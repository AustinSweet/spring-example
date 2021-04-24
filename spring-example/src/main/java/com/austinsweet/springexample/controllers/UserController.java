package com.austinsweet.springexample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.austinsweet.springexample.models.dto.RequestUserDTO;
import com.austinsweet.springexample.models.dto.ResponseUserDTO;
import com.austinsweet.springexample.services.UserService;

@RestController
public class UserController {
	
	@Autowired 
	private UserService service;
	
	@GetMapping("/")
	@ResponseBody
	public String test() {
		return "Hello World!";
	}
	
	@PostMapping("/users")
	@ResponseBody
	public String createUser(@RequestBody RequestUserDTO reqDTO) {
		return service.addUserToDatabase(reqDTO);
	}
	
	@GetMapping("/users/{id}/journal")
	@ResponseBody
	public ResponseUserDTO getUserJournal(@PathVariable long id) {
		return service.getUserJournal(id);
	}
}
