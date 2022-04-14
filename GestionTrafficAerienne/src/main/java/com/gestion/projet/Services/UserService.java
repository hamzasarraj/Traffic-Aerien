package com.gestion.projet.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.projet.Entities.User;
import com.gestion.projet.Repositories.UserRepository;
@Service
public class UserService implements IUserService{
	@Autowired
	public UserRepository userRepository;
	@Override
	public void addUser(User User) {
		// TODO Auto-generated method stub
		userRepository.save(User);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public User getUser(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public List<User> getAllUsers() {
		return (ArrayList<User>)userRepository.findAll();

	}

}
