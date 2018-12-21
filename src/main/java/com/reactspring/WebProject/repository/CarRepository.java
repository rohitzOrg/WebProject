package com.reactspring.WebProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.reactspring.WebProject.entity.Car;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car,Long> {

	List<Car> findByBrand(@Param("brand") String brand);

	  // Fetch cars by color
	  List<Car> findByColor(@Param("color") String color);
}
