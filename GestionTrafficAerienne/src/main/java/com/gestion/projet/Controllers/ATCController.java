package com.gestion.projet.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.projet.Services.IControllerService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Controller")
public class ATCController {
	@Autowired
	IControllerService controllerService;
	@ApiOperation(value = "Récupérer la liste des controlleurs")
	@GetMapping("/retrieve-all-controllers")
}
