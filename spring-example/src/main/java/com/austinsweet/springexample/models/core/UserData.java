package com.austinsweet.springexample.models.core;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_data")
public class UserData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "data_id")
	private long id;
	
	@Column(name = "user_journal")
	private String journal;
	
	@OneToOne(cascade = CascadeType.ALL)
	private UserDetails userDetails;
	
	public UserData() {
	}
	
	public UserData(String journal) {
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
