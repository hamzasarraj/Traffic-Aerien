package com.gestion.projet.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.gestion.projet.Entities.Notam;
import com.gestion.projet.Repositories.NotamRepository;
@Service
public class NotamService implements INotamService {
	@Autowired
	public NotamRepository notamRepository;

	@Override
	public Notam addNotam(Notam Notam) {
		return notamRepository.save(Notam);
	}

	@Override
	public Notam updateNotam(Notam Notam) {
		return notamRepository.save(Notam);

	}

	@Override
	public void deleteNotam(Long id) {
		// TODO Auto-generated method stub
		notamRepository.deleteById(id);
	}

	@Override
	public Notam getNotam(Long id) {
		return notamRepository.findById(id).orElse(null);
	}

	@Override
	public List<Notam> getAllNotams() {
		return (ArrayList<Notam>) notamRepository.findAll();

	}
	

}
