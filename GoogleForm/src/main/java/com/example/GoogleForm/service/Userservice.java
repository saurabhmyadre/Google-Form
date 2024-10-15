package com.example.GoogleForm.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GoogleForm.dao.Usersdao;
import com.example.GoogleForm.entity.Usersdata;



@Service
public class Userservice {

	@Autowired
	Usersdao dao;
	
	public String addUsers(Usersdata d) {
		String msg= dao.addUsers(d);
		
		if(Objects.isNull(msg)) {
			msg="Record is not be Added...";
		}
		
	return msg;
	}
}
