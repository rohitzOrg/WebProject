package com.reactspring.WebProject.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.reactspring.WebProject.entity.Car;

public interface CarService {

	public List<Car> findAllCars();
	public Car create(Car car);
	List<Car> findByBrand(@Param("brand") String brand);

	  // Fetch cars by color
	  List<Car> findByColor(@Param("color") String color);

	  // Fetch cars by year
	 /* List<Car> findByYear(int year);
	  // Fetch cars by brand and model
	  List<Car> findByBrandAndModel(String brand, String model);

	  // Fetch cars by brand or color
	  List<Car> findByBrandOrColor(String brand, String color); 
	  
	  List<Car> findByBrandOrderByYearAsc(String brand);
	  
	  @Query("select c from Car c where c.brand like %?1")
	  List<Car> findByBrandEndsWith(String brand);*/
}
