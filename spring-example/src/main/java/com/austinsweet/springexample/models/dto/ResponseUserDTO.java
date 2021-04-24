package com.austinsweet.springexample.models.dto;

public class ResponseUserDTO {
	
	private String name;
	private String journal;
	
	public ResponseUserDTO() {
	}

	public ResponseUserDTO(String name, String journal) {
		super();
		this.name = name;
		this.journal = journal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJournal() {
		return journal;
	}

	public void setJournal(String journal) {
		this.journal = journal;
	}
	
	
		
}
