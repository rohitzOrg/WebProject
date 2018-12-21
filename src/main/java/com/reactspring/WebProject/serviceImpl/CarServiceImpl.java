package com.reactspring.WebProject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.reactspring.WebProject.entity.Car;
import com.reactspring.WebProject.repository.CarRepository;
import com.reactspring.WebProject.service.CarService;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	CarRepository carRepo;
	
	@Override
	public List<Car> findAllCars() {
		return carRepo.findAll();
	}

	@Override
	public Car create(Car car) {
		return carRepo.saveAndFlush(car);
	}

	@Override
	public List<Car> findByBrand(@Param("brand") String brand) {
		// TODO Auto-generated method stub
		return carRepo.findAll();
	}

	@Override
	public List<Car> findByColor(@Param("color") String color) {
		// TODO Auto-generated method stub
		return carRepo.findAll();
	}

}
