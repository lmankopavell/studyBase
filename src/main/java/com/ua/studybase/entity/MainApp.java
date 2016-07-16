package com.ua.studybase.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by BlackAngel on 15.06.2016.
 */
public class MainApp {
    public static void main(String [] args){
       // ClassLoader.getSystemResource()
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.printMessage();
    }
}
