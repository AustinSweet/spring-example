package com.austinsweet.springexample.h2testing;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "h2_testing")
public class H2Testing {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "hello_world")
	private String helloWorld = "Hey mom, I'm in a database!";

	public H2Testing() {
	}
	
	public H2Testing(String helloWorld) {
		super();
		this.helloWorld = helloWorld;
	}

	public String getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}
	
	
}
