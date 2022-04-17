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

import com.gestion.projet.Entities.User;
import com.gestion.projet.Entities.Vol;
import com.gestion.projet.Services.IVolService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/vol")
public class VolController {
	@Autowired
	IVolService iVolService;
	@ApiOperation(value = "Récupérer la liste des Vols")
	@GetMapping("/retrieve-all-vols")
	public List<Vol> getVols() {
		List<Vol> listVols = iVolService.getAllVols();
		return listVols;
	}

	// http://localhost:8089/SpringMVC/Vol/retrieve-Vol/8
	@ApiOperation(value = "Récupérer un vol par Id")
	@GetMapping("/retrieve-vol/{vol-id}")
//	@ApiResponses(value = {
//			@ApiResponse(code = 200, message = "Success|OK"),
//			@ApiResponse(code = 401, message = "Not Authorized!"),
//			@ApiResponse(code = 403, message = "Forbidden!"),
//			@ApiResponse(code = 404, message = "Not Found!") })
	public Vol retrieveVol(@PathVariable("vol-id") Long  VolID) {
		return iVolService.getVol(VolID);
	}

	@PostMapping("/add-vol")
	public void addVol(@RequestBody Vol vol) {
		iVolService.addVol(vol);
		}

	// http://localhost:8089/SpringMVC/client/remove-vol/{vol-id}
	@DeleteMapping("/remove-vol/{vol-id}")
	public void removeVol(@PathVariable("vol-id") Long VolID ) {
		iVolService.deleteVol(VolID);
	}

	// http://localhost:8089/SpringMVC/vol/modify-vol
			@PutMapping("/modify-vol")
			public Vol modifyVol(@RequestBody Vol vol) {
				return iVolService.updateVol(vol);
			}
}
