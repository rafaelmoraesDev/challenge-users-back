package br.com.rafael.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafael.model.Users;
import br.com.rafael.respository.UsersRepository;

@CrossOrigin()
@RestController
@RequestMapping("api/users")
public class UsersController {
	@Autowired
	private UsersRepository usersRepository;

	@GetMapping
	public List<Users> list() {
		return usersRepository.findAll();
	}
}
