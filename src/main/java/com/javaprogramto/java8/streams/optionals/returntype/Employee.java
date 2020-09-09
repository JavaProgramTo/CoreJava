package com.javaprogramto.java8.streams.optionals.returntype;

import java.io.Serializable;
import java.util.Optional;

public class Employee implements Serializable {

	private int id;
	
	private Optional<Long> salary;
	
	//  setters and  getters
	
	private String name;

	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
