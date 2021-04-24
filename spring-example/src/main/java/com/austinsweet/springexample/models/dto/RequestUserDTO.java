package com.austinsweet.springexample.models.dto;

import com.austinsweet.springexample.models.core.UserData;
import com.austinsweet.springexample.models.core.UserDetails;

public class RequestUserDTO {
	private UserDetails userDetails;
	private UserData userData;
	
	public RequestUserDTO() {
	}

	public RequestUserDTO(UserDetails userDetails, UserData userData) {
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

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}
	
	
}
