package com.gestion.projet.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.projet.Entities.Notam;
import com.gestion.projet.Services.INotamService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/notam")
public class NotamController {
	@Autowired
	INotamService iNotamService;
	@ApiOperation(value = "Récupérer la liste des notams")
	@GetMapping("/retrieve-all-notams")
	public List<Notam> getNotams() {
		List<Notam> listNotams = iNotamService.getAllNotams();
		return listNotams;
	}

	// http://localhost:8089/SpringMVC/notam/retrieve-notam/8
	@ApiOperation(value = "Récupérer un notam par Id")
	@GetMapping("/retrieve-notam/{notam-id}")
//	@ApiResponses(value = {
//			@ApiResponse(code = 200, message = "Success|OK"),
//			@ApiResponse(code = 401, message = "Not Authorized!"),
//			@ApiResponse(code = 403, message = "Forbidden!"),
//			@ApiResponse(code = 404, message = "Not Found!") })
	public Notam retrieveNotam(@PathVariable("notam-id") Long NotamId) {
		return iNotamService.getNotam(NotamId);
	}

	@PostMapping("/add-notam")
	public Notam addNotam(@RequestBody Notam n) {
		return iNotamService.addNotam(n);
	}

	// http://localhost:8089/SpringMVC/notam/remove-notam/{notam-id}
	@DeleteMapping("/remove-notam/{notam-id}")
	public void removeNotam(@PathVariable("notam-id") Long NotamId) {
		iNotamService.deleteNotam(NotamId);
	}

	// http://localhost:8089/SpringMVC/notam/modify-notam
	@PutMapping("/modify-notam")
	public Notam modifyNotam(@RequestBody Notam notam) {
		return iNotamService.updateNotam(notam);
	}
}
