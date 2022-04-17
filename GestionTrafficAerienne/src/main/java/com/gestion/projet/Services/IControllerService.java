package com.gestion.projet.Services;

import java.util.List;

import com.gestion.projet.Entities.Controller;


public interface IControllerService {
	public Controller addController(Controller controller);
	public Controller updateController(Controller controller);
	public void deleteController(Long id);
	public Controller getController(Long id);
	public List<Controller> getAllControllers();
}
