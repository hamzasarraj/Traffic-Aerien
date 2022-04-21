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

import com.gestion.projet.Entities.Formation;
import com.gestion.projet.Services.IFormationService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/formation")
public class FormationController {
	@Autowired
	IFormationService iFormationService;
	@ApiOperation(value = "Récupérer la liste des formations")
	@GetMapping("/retrieve-all-formations")
	public List<Formation> getClients() {
		List<Formation> listFormtion = iFormationService.getAllFormations();
		return listFormtion;
	}

	// http://localhost:8089/SpringMVC/client/retrieve-client/8
	@ApiOperation(value = "Récupérer une formation par Id")
	@GetMapping("/retrieve-formation/{formation-id}")
//	@ApiResponses(value = {
//			@ApiResponse(code = 200, message = "Success|OK"),
//			@ApiResponse(code = 401, message = "Not Authorized!"),
//			@ApiResponse(code = 403, message = "Forbidden!"),
//			@ApiResponse(code = 404, message = "Not Found!") })
	public Formation retrieveFormation(@PathVariable("Formation-id") Long FormationID) {
		return iFormationService.getFormation(FormationID);
	}

	@PostMapping("/add-formation")
	public Formation addFormation(@RequestBody Formation f) {
		return iFormationService.addFormation(f);
	}

	// http://localhost:8089/SpringMVC/formation/remove-formation/{formation-id}
	@DeleteMapping("/remove-formation/{formation-id}")
	public void removeFormation(@PathVariable("formation-id") Long FormationID) {
		iFormationService.deleteFormation(FormationID);
	}

	// http://localhost:8089/SpringMVC/formation/modify-formation
	@PutMapping("/modify-formation")
	public Formation modifyFormation(@RequestBody Formation f) {
		return  iFormationService.updateFormation(f);
	}
}
