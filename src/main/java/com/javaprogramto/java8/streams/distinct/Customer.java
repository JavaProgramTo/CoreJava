package com.javaprogramto.java8.streams.distinct;

public class Customer {

	private int id;
	private String name;
	private long phonenumber;
	
	public Customer(int id, String name, long phonenumber) {
		super();
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + "]";
	}
	
}
