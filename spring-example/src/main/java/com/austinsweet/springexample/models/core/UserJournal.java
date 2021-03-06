package com.austinsweet.springexample.models.core;

public class UserJournal {
	private long id;
	private String journal;
	private UserDetails userDetails;
	
	public UserJournal() {
	}
	
	public UserJournal(String journal) {
		super();
		this.journal = journal;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getJournal() {
		return journal;
	}

	public void setJournal(String journal) {
		this.journal = journal;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	
	

}
