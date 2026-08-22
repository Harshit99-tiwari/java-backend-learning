package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int rollNo;
    private String sName;
    private int sAge;

    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo){
          this.rollNo =  rollNo;
    }
    public String getName(){
        return sName;
    }
    public void setName(String sName){
          this.sName=  sName;
    }
    public int getAge(){
        return sAge;
    }
    public void setAge(int sAge){
          this.sAge =  sAge;
    }
    @Override
    public String toString(){
       return "Strudent{"+
       "rollNo="+rollNo+
       ",sName="+sName+
       ",sAge="+sAge+"}";
    }
}
