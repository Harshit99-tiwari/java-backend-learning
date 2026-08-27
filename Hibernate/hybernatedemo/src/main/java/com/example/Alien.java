package com.example;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.FetchType;




@Entity
public class Alien {

    @Id
    private int aid;
    private  String aname;
    private String tech;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Laptop> laptops;

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
    public List<Laptop> getLaptops() {
        return laptops;
    }
    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }
    
    @Override
    public String toString(){
       return "Alien{"+
       "aid="+aid+
       ",aname="+aname+
       ",tech="+tech+
       ",laptop="+laptops+"}";
    }

}