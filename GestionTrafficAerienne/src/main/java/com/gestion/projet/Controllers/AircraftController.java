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

import com.gestion.projet.Entities.Aircraft;
import com.gestion.projet.Services.IAircaftService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/aircraft")
public class AircraftController {
	@Autowired
	IAircaftService aircaftService;
	@ApiOperation(value = "Récupérer la liste des avions")
	@GetMapping("/retrieve-all-aircrafts")
	public List<Aircraft> getAircrafts() {
		List<Aircraft> listAvions = aircaftService.getAllAircrafts();
		return listAvions;
	}

	// http://localhost:8089/SpringMVC/client/retrieve-client/8
	@ApiOperation(value = "Récupérer un avion par Id")
	@GetMapping("/retrieve-avion/{avion-id}")
//	@ApiResponses(value = {
//			@ApiResponse(code = 200, message = "Success|OK"),
//			@ApiResponse(code = 401, message = "Not Authorized!"),
//			@ApiResponse(code = 403, message = "Forbidden!"),
//			@ApiResponse(code = 404, message = "Not Found!") })
	public Aircraft retrieveAircraft(@PathVariable("aicraft-id") Long AircraftId) {
		return aircaftService.getAircraft(AircraftId);
	}

	@PostMapping("/add-aircraft")
	public Aircraft addAircraft(@RequestBody Aircraft c) {
		return aircaftService.addAircraft(c);
	}

	// http://localhost:8089/SpringMVC/aircraft/remove-aircraft/{aircraft-id}
	@DeleteMapping("/remove-aircraft/{aircraft-id}")
	public void removeAircraft(@PathVariable("aircraft-id") Long AircraftId) {
		aircaftService.deleteAircraft(AircraftId);
	}

	// http://localhost:8089/SpringMVC/aircraft/modify-aircraft
	@PutMapping("/modify-aircraft")
	public Aircraft modifyAircraft(@RequestBody Aircraft aircraft) {
		return aircaftService.updateAircraft(aircraft);
	}
}
