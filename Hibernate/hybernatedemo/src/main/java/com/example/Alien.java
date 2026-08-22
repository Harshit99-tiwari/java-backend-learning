package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {

    @Id
    private int aid;
    private  String aname;
    private String tech;

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
    @Override
    public String toString(){
       return "Laptop{"+
       "LaptopID="+aid+
       ",LaptopName="+aname+
       ",LaptopTech="+tech+"}";
    }

}