package com.example.helloworld.echo;

import java.io.Serializable;

public class EchoForm implements Serializable {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}