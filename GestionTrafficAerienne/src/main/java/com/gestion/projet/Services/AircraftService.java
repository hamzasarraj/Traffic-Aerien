package com.gestion.projet.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.projet.Entities.Aircraft;
import com.gestion.projet.Repositories.AircraftRepository;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class AircraftService implements IAircaftService {

	@Autowired
	public AircraftRepository aircraftRepository;
	@Override
	public Aircraft addAircraft(Aircraft Aircraft) {
		// TODO Auto-generated method stub
		return aircraftRepository.save(Aircraft);
	}

	@Override
	public Aircraft updateAircraft(Aircraft Aircraft) {
		return aircraftRepository.save(Aircraft);
	}

	@Override
	public void deleteAircraft(Long id) {
		// TODO Auto-generated method stub
		aircraftRepository.deleteById(id);
	}

	@Override
	public Aircraft getAircraft(Long id) {
		return aircraftRepository.findById(id).orElse(null);
	}

	@Override
	public List<Aircraft> getAllAircrafts() {
		return (ArrayList<Aircraft>)aircraftRepository.findAll();

	}

}
