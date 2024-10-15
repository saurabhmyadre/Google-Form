package com.example.GoogleForm.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.GoogleForm.entity.Usersdata;
import com.example.GoogleForm.service.Userservice;



@CrossOrigin
@RestController
@RequestMapping("/api")
public class UsersController {

	@Autowired
	Userservice service;
	
	@PostMapping("/addUsers")
	public String addUsers(@RequestBody Usersdata d) {
		String msg= service.addUsers(d);
		return msg;
	}
}
