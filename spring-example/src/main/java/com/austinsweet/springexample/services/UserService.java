package com.austinsweet.springexample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.austinsweet.springexample.models.core.UserData;
import com.austinsweet.springexample.models.core.UserDetails;
import com.austinsweet.springexample.models.dto.RequestUserDTO;
import com.austinsweet.springexample.models.dto.ResponseUserDTO;
import com.austinsweet.springexample.repositories.UserDataRepository;
import com.austinsweet.springexample.repositories.UserDetailsRepository;
@Service
public class UserService {
	@Autowired
	UserDetailsRepository userDeetsRepo;
	@Autowired
	UserDataRepository userDataRepo;
	
	public String addUserToDatabase(RequestUserDTO reqDTO) {
		UserDetails tempDeets = reqDTO.getUserDetails();
		UserData tempData = reqDTO.getUserData();
		userDeetsRepo.save(tempDeets);
		userDataRepo.save(tempData);
		return tempDeets.getName() + " Created!";
	}
	
	public ResponseUserDTO getUserJournal(long id) {
		List<UserDetails> tempDeets = userDeetsRepo.findById(id);
		List<UserData> tempData = userDataRepo.findById(id);
		return null;
	}
	
	
}
