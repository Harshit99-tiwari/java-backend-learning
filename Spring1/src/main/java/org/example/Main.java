package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]){
        ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");

        Alien obj = context.getBean("alien", Alien.class);
       // obj.code();
        obj.age =  21;
        System.out.println(obj.age);

        Alien obj2 = context.getBean("alien", Alien.class);
       // obj2.code();
        System.out.println(obj2.age);

       // Laptop l = context.getBean("lap", Laptop.class);
      //  l.code();
    }
}
