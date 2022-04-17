package com.gestion.projet.Services;

import java.util.List;

import com.gestion.projet.Entities.Aircraft;


public interface IAircaftService {
	public Aircraft addAircraft(Aircraft Aircraft);
	public Aircraft updateAircraft(Aircraft Aircraft);
	public void deleteAircraft(Long id);
	public Aircraft getAircraft(Long id);
	public List<Aircraft> getAllAircrafts();
}
