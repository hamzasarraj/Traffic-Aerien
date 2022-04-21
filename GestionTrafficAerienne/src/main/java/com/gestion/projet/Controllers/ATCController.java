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

import com.gestion.projet.Entities.Controller;
import com.gestion.projet.Services.IControllerService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/controller")
public class ATCController {
	@Autowired
	IControllerService controllerService;
	@ApiOperation(value = "Récupérer la liste des controlleurs")
	@GetMapping("/retrieve-all-controllers")
	public List<Controller> getControllers() {
		List<Controller> listControllers = controllerService.getAllControllers();
		return listControllers;
	}

	// http://localhost:8089/SpringMVC/controller/retrieve-controller/8
	@ApiOperation(value = "Récupérer un controlleur par Id")
	@GetMapping("/retrieve-controller/{controller-id}")
//	@ApiResponses(value = {
//			@ApiResponse(code = 200, message = "Success|OK"),
//			@ApiResponse(code = 401, message = "Not Authorized!"),
//			@ApiResponse(code = 403, message = "Forbidden!"),
//			@ApiResponse(code = 404, message = "Not Found!") })
	public Controller retrieveController(@PathVariable("controller-id") Long ControllerID) {
		return controllerService.getController(ControllerID);
	}

	@PostMapping("/add-controller")
	public Controller addController(@RequestBody Controller c) {
		return controllerService.addController(c);
	}

	// http://localhost:8089/SpringMVC/controller/remove-controller/{controller-id}
	@DeleteMapping("/remove-controller/{controller-id}")
	public void removeController(@PathVariable("controller-id") Long ControllerID) {
		controllerService.deleteController(ControllerID);
	}

	// http://localhost:8089/SpringMVC/controller/modify-controller
	@PutMapping("/modify-controller")
	public Controller modifyController(@RequestBody Controller controller) {
		return controllerService.updateController(controller);
	}
}
