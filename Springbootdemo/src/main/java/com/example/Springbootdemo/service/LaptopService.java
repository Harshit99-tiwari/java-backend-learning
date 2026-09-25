package com.example.Springbootdemo.service;

import com.example.Springbootdemo.model.Laptop;
import com.example.Springbootdemo.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lapt){
        repo.Save(lapt);
    }
    public boolean isgoodforPROG(Laptop lap){
        return true;
    }
}
