package com.gestion.projet.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.projet.Entities.Controller;
import com.gestion.projet.Repositories.ControllerRepository;
@Service
public class ControllerService implements IControllerService {
	@Autowired
	public ControllerRepository controllerRepository;

	@Override
	public void addController(Controller controller) {
		// TODO Auto-generated method stub
		controllerRepository.save(controller);
	}

	@Override
	public void updateController(Controller controller) {
		// TODO Auto-generated method stub
		controllerRepository.save(controller);

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

