package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Food;

public interface FoodDao extends CrudRepository<Food, Integer> {

	public List<Food> findAll();
	public List<Food> findByOrderByDishName();
	public List<Food> findByOrderByDishNameDesc();
	
	public Food findByFoodId(int id);
	public Food findByDishName(String dishName);
	public Food findByCalories(double awfoijaoifjiojwi); //variable name doesn't matter
	public Food findByDishNameAndCalories(String dishName, double calories);
	
	/*
	 * PLEASE LOOK AT THE DOCUMENTATION FOR NAMING PATTERNS/CONVENTIONS:
	 * 
	 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
	 */
}
