package com.gestion.projet.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.projet.Entities.Controller;
import com.gestion.projet.Repositories.ControllerRepository;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class ControllerService implements IControllerService {
	@Autowired
	public ControllerRepository controllerRepository;

	@Override
	public Controller addController(Controller controller) {
		return controllerRepository.save(controller);
	}

	@Override
	public Controller updateController(Controller controller) {
		return controllerRepository.save(controller);

	}

	@Override
	public void deleteController(Long id) {
		// TODO Auto-generated method stub
		controllerRepository.deleteById(id);
	}

	@Override
	public Controller getController(Long id) {
		return controllerRepository.findById(id).orElse(null);
	}

	@Override
	public List<Controller> getAllControllers() {
		return (ArrayList<Controller>) controllerRepository.findAll();

	}

}

