package org.example;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private Computer cmp;

    public Computer getCmp() {
        return cmp;
    }

    public void setCmp(Computer cmp) {
        this.cmp = cmp;
    }
    public Alien(){
       // System.out.println("Alien object created");
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
