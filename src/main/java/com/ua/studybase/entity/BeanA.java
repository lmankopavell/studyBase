package com.ua.studybase.entity;

/**
 * Created by BlackAngel on 15.06.2016.
 */
public class BeanA {

    private BeanB beanB;

    public BeanA(){
        System.out.println("Creating instance of A");
    }

    public void setBeanB(BeanB beanB){
        System.out.println("Setting property b of A instance");
        this.beanB = beanB;
    }


}
