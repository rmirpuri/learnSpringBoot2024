package com.spring.core;


import org.springframework.stereotype.Component;

@Component("car")
//@Primary
public class Car implements Vehicle{

    public void move(){
        System.out.println("Car is moving");
    }



}
