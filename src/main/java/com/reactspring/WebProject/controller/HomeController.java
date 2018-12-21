package com.reactspring.WebProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactspring.WebProject.entity.Car;
import com.reactspring.WebProject.entity.Owner;
import com.reactspring.WebProject.service.CarService;
import com.reactspring.WebProject.service.OwnerService;

@RestController
public class HomeController {

	@Autowired
	CarService carService;
	
	@Autowired
	OwnerService ownerService;
	
	@GetMapping("/allCars")
	public List<Car> getAllCars(){
		return carService.findAllCars();
	}
	
	@GetMapping("/allOwners")
	public List<Owner> getAllOwners(){
		return ownerService.findAllOwners();
	}
}
