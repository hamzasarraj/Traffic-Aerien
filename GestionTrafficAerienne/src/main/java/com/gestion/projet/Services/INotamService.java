package com.gestion.projet.Services;

import java.util.List;

import com.gestion.projet.Entities.Notam;


public interface INotamService {
	public void addNotam(Notam Notam);
	public void updateNotam(Notam Notam);
	public void deleteNotam(Long id);
	public Notam getNotam(Long id);
	public List<Notam> getAllNotams();
}
