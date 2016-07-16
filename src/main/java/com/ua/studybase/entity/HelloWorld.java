package com.ua.studybase.entity;

/**
 * Created by BlackAngel on 15.06.2016.
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message = message;
    }

    public void printMessage(){
        System.out.println("Your message " + message);
    }

}
