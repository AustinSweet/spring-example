package com.austinsweet.springexample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.austinsweet.springexample.models.core.UserJournal;
import com.austinsweet.springexample.models.core.UserDetails;
import com.austinsweet.springexample.models.dto.RequestUserDTO;
import com.austinsweet.springexample.models.dto.ResponseUserDTO;

@Service
public class UserService {
	private UserDetails detailStorage = new UserDetails();
	private UserJournal dataStorage = new UserJournal();
	
	public String addUser(RequestUserDTO reqDTO) {
		this.detailStorage = reqDTO.getUserDetails();
		this.dataStorage = reqDTO.getUserData();
		return detailStorage.getName() + " Created!";
	}
	
	public ResponseUserDTO getUserJournal(long id) {
		ResponseUserDTO retVal = new ResponseUserDTO(detailStorage.getName(), dataStorage.getJournal());
		return retVal;
	}
}
