package org.example;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private Laptop lap;
    public Alien(){
        System.out.println("Alien object created");
    }
    @ConstructorProperties({"age","lap"})
    public Alien(int age,Laptop lap) {
        System.out.println("Para alien constructor");
        this.age = age;
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        System.out.println("Alien coding");
        lap.Compile();
    }
}
