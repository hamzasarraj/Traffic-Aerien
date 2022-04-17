package com.gestion.projet.Services;

import java.util.List;

import com.gestion.projet.Entities.Notam;


public interface INotamService {
	public Notam addNotam(Notam Notam);
	public Notam updateNotam(Notam Notam);
	public void deleteNotam(Long id);
	public Notam getNotam(Long id);
	public List<Notam> getAllNotams();
}
