package com.gestion.projet.Services;

import java.util.List;

import com.gestion.projet.Entities.Formation;


public interface IFormationService {
	Formation addFormation(Formation Formation);
	Formation updateFormation(Formation Formation);
	public void deleteFormation(Long id);
	public Formation getFormation(Long id);
	public List<Formation> getAllFormations();
}
