package com.gestion.projet.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.projet.Entities.Vol;
import com.gestion.projet.Repositories.VolRepository;
@Service
public class VolService implements IVolService {
	@Autowired
	public VolRepository volRepository;

	@Override
	public Vol addVol(Vol vol) {
		return volRepository.save(vol);
	}

	@Override
	public Vol updateVol(Vol vol) {
		return volRepository.save(vol);	}

	@Override
	public void deleteVol(Long id) {
		// TODO Auto-generated method stub
		volRepository.deleteById(id);
	}

	@Override
	public Vol getVol(Long id) {
		return volRepository.findById(id).orElse(null);
	}

	@Override
	public List<Vol> getAllVols() {
		return (ArrayList<Vol>)volRepository.findAll();

	}

}
