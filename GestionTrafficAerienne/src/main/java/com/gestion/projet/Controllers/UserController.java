package com.gestion.projet.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.projet.Entities.User;
import com.gestion.projet.Services.IUserService;


@RestController
@RequestMapping("/User")
public class UserController {
	@Autowired
	IUserService iUserService;
	@GetMapping("/retrieve-all-users")
	public List<User> getUsers() {
	return iUserService.getAllUsers();
	}
	// http://localhost:8082/SpringMVC/User/retrieve-user/8
	@GetMapping("/retrieve-user/{user-id}")
	public User retrieveUser(@PathVariable("user-id") Long UserId) {
	return iUserService.getUser(UserId);
	}
	// http://localhost:8082/SpringMVC/User/remove-user/{user-id}
	@DeleteMapping("/remove-client/{client-id}")
	public void removeClient(@PathVariable("user-id") Long UsertId) {
	iUserService.deleteUser(UsertId);
	}
	


	@PostMapping("/add-User")
	public void addUser(@RequestBody User user) {
		iUserService.addUser(user);
	}
}
