package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Component
public class Alien {
    @Value("26")
    private int age;
    //@Autowired
//    @Qualifier("dsk")  // we can use desktop(class name starting with small char) instead of dsk
    private Computer cmp;

    public Computer getCmp() {
        return cmp;
    }
    @Autowired
    @Qualifier("dsk")  //high priority then primary
    public void setCmp(Computer cmp) {
        this.cmp = cmp;
    }
    public Alien(){
        System.out.println("Alien object created");
    }

    /* private Laptop lap;

        @ConstructorProperties({"age","lap"})
        public Alien(int age,Laptop lap) {
            System.out.println("Para alien constructor");
            this.age = age;
            this.lap = lap;
        }
         public Laptop getLap() {
            return lap;
        }

        public void setLap(Laptop lap) {
            this.lap = lap;
        }*/

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
         //   System.out.println("setter called");
            this.age = age;
        }

    public void code(){
        System.out.println("Alien coding");
        cmp.Compile();
    }
}
