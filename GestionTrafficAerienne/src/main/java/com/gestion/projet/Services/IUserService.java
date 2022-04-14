package com.gestion.projet.Services;

import java.util.List;

import com.gestion.projet.Entities.User;

public interface IUserService {
	public void addUser(User User);
	public void updateUser(User user);
	public void deleteUser(Long id);
	public User getUser(Long id);
	public List<User> getAllUsers();
}
