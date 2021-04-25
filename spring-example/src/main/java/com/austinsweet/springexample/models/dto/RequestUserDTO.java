package com.austinsweet.springexample.models.dto;

import com.austinsweet.springexample.models.core.UserJournal;
import com.austinsweet.springexample.models.core.UserDetails;

public class RequestUserDTO {
	private UserDetails userDetails;
	private UserJournal userData;
	
	public RequestUserDTO() {
	}

	public RequestUserDTO(UserDetails userDetails, UserJournal userData) {
		super();
		this.userDetails = userDetails;
		this.userData = userData;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public UserJournal getUserData() {
		return userData;
	}

	public void setUserData(UserJournal userData) {
		this.userData = userData;
	}
	
	
}
