package com.gestion.projet.Services;

import java.util.List;

import com.gestion.projet.Entities.Vol;

public interface IVolService {
	public Vol addVol(Vol vol);
	public Vol updateVol(Vol vol);
	public void deleteVol(Long id);
	public Vol getVol(Long id);
	public List<Vol> getAllVols();
}
