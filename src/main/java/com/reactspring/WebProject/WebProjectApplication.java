package com.reactspring.WebProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.reactspring.WebProject.entity.Car;
import com.reactspring.WebProject.entity.Owner;
import com.reactspring.WebProject.entity.User;
import com.reactspring.WebProject.repository.UserRepository;
import com.reactspring.WebProject.service.CarService;
import com.reactspring.WebProject.service.OwnerService;

@SpringBootApplication
public class WebProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebProjectApplication.class, args);
		//adding comment
	}
	/*
	@Autowired
	CarService carService;
	
	@Autowired
	OwnerService ownerService;
	
	@Autowired
	UserRepository userRepository;
	
	  @Bean
      CommandLineRunner runner() {
        return args -> {
          // Add owner objects and save these to db
          Owner owner1 = new Owner("John" , "Johnson");
          Owner owner2 = new Owner("Mary" , "Robinson");
          ownerService.create(owner1);
          ownerService.create(owner2);
    
          // Add car object with link to owners and save these to db.
          Car car = new Car("Ford", "Mustang", "Red", 
              "ADF-1121", 2017, 59000, owner1);
          carService.create(car);
          car = new Car("Nissan", "Leaf", "White",
              "SSJ-3002", 2014, 29000, owner2);
          carService.create(car);
          car = new Car("Toyota", "Prius", "Silver",
              "KKO-0212", 2018, 39000, owner2);
          carService.create(car);
          
          userRepository.save(new User("user",
        	      "$2a$04$1.YhMIgNX/8TkCKGFUONWO1waedKhQ5KrnB30fl0Q01QKqmzLf.Zi",
        	      "USER"));
        	      // username: admin password: admin
          userRepository.save(new User("admin",
        	      "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG", 
        	      "ADMIN"));
        };
	  }*/
}

