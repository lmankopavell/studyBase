package com.ua.studybase.entity;

/**
 * Created by BlackAngel on 15.06.2016.
 */
public class BeanB {

    private BeanA beanA;

    public  BeanB(){
        System.out.println("Creating instance B");
    }

    public void setBeanA(BeanA beanA){
        System.out.println("Setting property a of B instance");
    }
}
