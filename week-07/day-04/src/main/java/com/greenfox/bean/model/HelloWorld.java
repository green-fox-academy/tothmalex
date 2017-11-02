package com.greenfox.bean.model;

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your message: " + message);
    }

}