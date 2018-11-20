package com.exgnt.web;

public class User {

	public String firstName, lastName, email;
	
	public String GlobalID;
	

	public User() {
		this.firstName="Adrian";
		this.lastName="Jensen";
		this.email="kenkenf@gmail.com";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
