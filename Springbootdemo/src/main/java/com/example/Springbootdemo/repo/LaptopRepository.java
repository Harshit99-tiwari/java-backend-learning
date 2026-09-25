package com.example.Springbootdemo.repo;

import com.example.Springbootdemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void Save(Laptop lap){
        System.out.println("saved in databasse");
    }
}
