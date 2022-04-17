package com.gestion.projet.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.projet.Services.IAircaftService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/Aircraft")
public class AircraftController {
	@Autowired
	IAircaftService aircaftService;
	@ApiOperation(value = "Récupérer la liste des avions")
	@GetMapping("/retrieve-all-aircrafts")
}
