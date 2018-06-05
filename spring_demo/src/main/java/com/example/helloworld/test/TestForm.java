package com.example.helloworld.test;

import java.io.Serializable;

public class TestForm implements Serializable{
	private String test;

	public void setTest(String test) {
		this.test = test;
	}

	public String getTest() {
		return test;
	}
}
