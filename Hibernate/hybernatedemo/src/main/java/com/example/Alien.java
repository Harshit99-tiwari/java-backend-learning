package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {

    @Id
    private int aid;
    private  String aname;
    private String tech;
    private Laptop laptop;

     public int getaID(){
        return aid;
    }
    public void setaID(int aid){
          this.aid =  aid;
    }
    public String getaName(){
        return aname;
    }
    public void setaName(String aname){
          this.aname=  aname;
    }
    public String getTech(){
        return tech;
    }
    public void setTech(String tech){
          this.tech= tech;
    }
    public Laptop getLaptop() {
        return laptop;
    }
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    @Override
    public String toString(){
       return "Alien{"+
       "aid="+aid+
       ",aname="+aname+
       ",tech="+tech+
       ",laptop="+laptop+"}";
    }

}