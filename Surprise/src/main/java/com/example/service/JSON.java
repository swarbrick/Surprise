package com.example.service;

public class JSON {
	
	String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public JSON(String string) {
		super();
		this.string = string;
	}

	@Override
	public String toString() {
		return "JSON [string=" + string + "]";
	}
	
	

}
