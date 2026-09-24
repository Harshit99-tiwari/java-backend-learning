package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dsk")  //dsk refer as bean name
@Scope("prototype")
public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop object");
    }
    @Override
    public void Compile(){
        System.out.println("Desktop Compiling.....");
    }
}
