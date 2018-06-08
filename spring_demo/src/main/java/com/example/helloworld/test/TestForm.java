package com.example.helloworld.test;

import java.io.Serializable;

import com.fasterxml.jackson.databind.ObjectMapper;

class Info {
    public String name;
    public int age;
}

public class TestForm implements Serializable{
	
    String script = "{ \"name\":\"Taro Tanaka\", \"age\":30}";
    
    ObjectMapper mapper = new ObjectMapper();
    try {
        Info info = mapper.readValue(script, Info.class);
        System.out.println(info.name + ", " + info.age);
    } catch (IOException e) {
        e.printStackTrace();
    }
	private String title;


	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
}

