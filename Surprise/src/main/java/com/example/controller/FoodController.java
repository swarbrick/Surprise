package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Food;
import com.example.repo.FoodDao;

@Controller("FoodController")
@CrossOrigin(origins = { "http://localhost:4200" })
public class FoodController {

	private FoodDao foodDao;
	
	
	@Autowired
	public FoodController(FoodDao foodDao) {
		super();
		this.foodDao = foodDao;
	}

	@GetMapping("/food/{id}")
	public @ResponseBody Food findFood(@PathVariable("id") int id) {
		//Spring Data has ALREADY created our basic CRUD methods for us, no worries
		//foodDao.save(new Food("Slim Jims", 300.9);
		
		//return foodDao.findByDishName("Slim Jims");
		return foodDao.findByFoodId(id);
	}
	
	@GetMapping("/allFood")
	public @ResponseBody List<Food> findAllFood(){
		return foodDao.findAll();
//		return foodDao.findByOrderByDishNameDesc();
	}
	
	@PostMapping("/createFood/{name}/{calories}")
	public @ResponseBody Food createFood(@PathVariable("name") String name, @PathVariable("calories") double calories) {
		System.out.println(name);
		System.out.println(calories);
		Food f = new Food(name, calories);
		foodDao.save(f);
		return f;
	}
	
	@PutMapping("/updateFood/{id}/{name}/{calories}")
	public @ResponseBody Food updateFood(@PathVariable("id") int id, @PathVariable("name") String name, @PathVariable("calories") double calories) {
		Food f = foodDao.findByFoodId(id);
		f.setDishName(name);
		f.setCalories(calories);
		foodDao.save(f);
		return f;
	}
	
	@DeleteMapping("/deleteFood/{name}")
	public @ResponseBody String deleteFood(@PathVariable("name") String name) {
		try {
		Food f = foodDao.findByDishName(name);
		foodDao.delete(f);
		} catch(Exception e) {
			e.printStackTrace();
			return "Delete Failed";
		}
		return "Delete Successful";
	}
	
}
