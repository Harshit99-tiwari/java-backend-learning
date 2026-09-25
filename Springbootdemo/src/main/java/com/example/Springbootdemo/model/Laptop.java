package com.example.Springbootdemo.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    @Override
    public void compile(){
        System.out.println("Laptop Compiling.......");
    }
}
