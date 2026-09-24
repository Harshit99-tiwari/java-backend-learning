package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("lap1")
//@Primary
public class Laptop implements Computer
{
    public Laptop(){
        System.out.println("Laptop object created");
    }
   // public void code(){
   //     System.out.println("laptop coding");
   // }
    @Override
    public void Compile(){
        System.out.println("Laptop Compiling");
    }
}
