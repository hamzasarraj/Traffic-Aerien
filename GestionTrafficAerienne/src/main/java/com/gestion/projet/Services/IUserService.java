package com.gestion.projet.Services;

import java.util.List;

import com.gestion.projet.Entities.User;

public interface IUserService {
	User addUser(User User);
	User updateUser(User user);
	public void deleteUser(Long id);
	 User getUser(Long id);
	public List<User> getAllUsers();
}
