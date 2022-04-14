package com.gestion.projet.Services;

import java.util.List;

import com.gestion.projet.Entities.Formation;


public interface IFormationService {
	public void addFormation(Formation Formation);
	public void updateFormation(Formation Formation);
	public void deleteFormation(Long id);
	public Formation getFormation(Long id);
	public List<Formation> getAllFormations();
}
