package com.gestion.projet.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.projet.Entities.User;
import com.gestion.projet.Services.IUserService;

import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	IUserService iUserService;
	@ApiOperation(value = "Récupérer la liste des users")
	@GetMapping("/retrieve-all-users")
	public List<User> getUsers() {
		List<User> listUser= iUserService.getAllUsers();
		return listUser;
	}
	// http://localhost:8089/SpringMVC/user/retrieve-user/2
	@GetMapping("/retrieve-user/{user-id}")
	public User retrieveUser(@PathVariable("user-id") Long UserId) {
	return iUserService.getUser(UserId);
	}
	// http://localhost:8089/SpringMVC/user/remove-user/{user-id}
	@DeleteMapping("/remove-User/{user-id}")
	public void removeClient(@PathVariable("user-id") Long UsertId) {
	iUserService.deleteUser(UsertId);
	}
	


	@PostMapping("/add-User")
	public User addUser(@RequestBody User user) {
		return iUserService.addUser(user);
	}
	// http://localhost:8089/SpringMVC/user/modify-user
		@PutMapping("/modify-user")
		public User modifyUser(@RequestBody User user) {
			return iUserService.updateUser(user);
		}

}
