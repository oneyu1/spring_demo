package com.example.helloworld.test;

import java.io.Serializable;
import java.util.HashMap;

public class TestForm implements Serializable{
	private String test;


	public void setTest(String test) {
		this.test = test;
	}

	public String getTest() {
		return test;
	}

	public void setdata(String key ,String value) {
		HashMap<String,String> data = new HashMap<String,String>();
		data.put(key, value);
	}
}
