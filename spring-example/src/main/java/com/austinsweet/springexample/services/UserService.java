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
	
	//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//This is a hack, never do this.
	private ResponseUserDTO temp = new ResponseUserDTO();
	//End of hacky stuff
	//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	public String addUserToDatabase(RequestUserDTO reqDTO) {
		UserDetails tempDeets = reqDTO.getUserDetails();
		UserData tempData = reqDTO.getUserData();
		
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//This is a hack, never do this.
		this.temp.setName(tempDeets.getName());
		this.temp.setJournal(tempData.getJournal());
		//End of hacky stuff.
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		userDeetsRepo.save(tempDeets);
		userDataRepo.save(tempData);
		return tempDeets.getName() + " Created!";
	}
	
	//This isn't finished, freaking sue me I only got so many hours for Merit
	public ResponseUserDTO getUserJournal(long id) {
		return temp;
	}
}
