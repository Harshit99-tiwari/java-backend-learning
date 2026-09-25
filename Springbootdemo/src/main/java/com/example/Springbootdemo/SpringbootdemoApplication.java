package com.example.Springbootdemo;

import com.example.Springbootdemo.model.Alien;
import com.example.Springbootdemo.model.Laptop;
import com.example.Springbootdemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
	ApplicationContext context =  SpringApplication.run(SpringbootdemoApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);
		Laptop laptop = context.getBean(Laptop.class);
		service.addLaptop(laptop);

//	Alien obj = context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//	obj.code();
	}

}
