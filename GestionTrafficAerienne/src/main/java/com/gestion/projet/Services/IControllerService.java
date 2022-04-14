package com.gestion.projet.Services;

import java.util.List;

import com.gestion.projet.Entities.Controller;


public interface IControllerService {
	public void addController(Controller controller);
	public void updateController(Controller controller);
	public void deleteController(Long id);
	public Controller getController(Long id);
	public List<Controller> getAllControllers();
}
