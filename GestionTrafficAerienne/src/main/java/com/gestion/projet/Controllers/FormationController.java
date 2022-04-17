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
import tn.esprit.spring.entities.Client;

@RestController
@RequestMapping("/Formation")
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
	@ApiOperation(value = "Récupérer un client par Id")
	@GetMapping("/retrieve-client/{client-id}")
//	@ApiResponses(value = {
//			@ApiResponse(code = 200, message = "Success|OK"),
//			@ApiResponse(code = 401, message = "Not Authorized!"),
//			@ApiResponse(code = 403, message = "Forbidden!"),
//			@ApiResponse(code = 404, message = "Not Found!") })
	public Client retrieveClient(@PathVariable("client-id") Long clientId) {
		return clientService.retrieveClient(clientId);
	}

	@PostMapping("/add-client")
	public Client addClient(@RequestBody Client c) {
		return clientService.addClient(c);
	}

	// http://localhost:8089/SpringMVC/client/remove-client/{client-id}
	@DeleteMapping("/remove-client/{client-id}")
	public void removeClient(@PathVariable("client-id") Long clientId) {
		clientService.deleteClient(clientId);
	}

	// http://localhost:8089/SpringMVC/client/modify-client
	@PutMapping("/modify-client")
	public Client modifyClient(@RequestBody Client client) {
		return clientService.updateClient(client);
	}
}
