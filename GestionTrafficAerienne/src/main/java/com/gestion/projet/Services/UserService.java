package com.gestion.projet.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.projet.Entities.User;
import com.gestion.projet.Repositories.UserRepository;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class UserService implements IUserService{
	@Autowired
	public UserRepository userRepository;

	@Override
	public User addUser(User User) {
		return userRepository.save(User);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.saveAndFlush(user);
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public User getUser(Long id) {
		return userRepository.findById(id).get();
		
	}

	@Override
	public List<User> getAllUsers() {
		List<User>ListUser=null;
		return ListUser=userRepository.findAll();
	}
	
}
