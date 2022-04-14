package com.gestion.projet.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.projet.Entities.Formation;
import com.gestion.projet.Repositories.FormationRepository;

@Service
public class Formationservice implements IFormationService {
	@Autowired
	public FormationRepository formationRepository;

	@Override
	public void addFormation(Formation Formation) {
		// TODO Auto-generated method stub
		formationRepository.save(Formation);
	}

	@Override
	public void updateFormation(Formation Formation) {
		// TODO Auto-generated method stub
		formationRepository.save(Formation);

		
	}

	@Override
	public void deleteFormation(Long id) {
		// TODO Auto-generated method stub
		formationRepository.deleteById(id);
	}

	@Override
	public Formation getFormation(Long id) {
		return formationRepository.findById(id).orElse(null);
	}

	@Override
	public List<Formation> getAllFormations() {
		return (ArrayList<Formation>) formationRepository.findAll();
	}

}
