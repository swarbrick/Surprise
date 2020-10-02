package com.example.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Event;
import com.example.repo.EventDao;
import com.example.service.JSON;
import com.example.service.TimeService;

@Controller("EventController")
@CrossOrigin(origins = { "http://localhost:4200" })
public class EventController {

	private EventDao eventDao;
	
	
	@Autowired
	public EventController(EventDao eventDao) {
		super();
		this.eventDao = eventDao;
	}

//	@GetMapping("/event/{id}")
//	public @ResponseBody Event findEvent(@PathVariable("id") int id) {
//		//Spring Data has ALREADY created our basic CRUD methods for us, no worries
//		//foodDao.save(new Food("Slim Jims", 300.9);
//		
//		//return foodDao.findByDishName("Slim Jims");
//		return eventDao.findByEventId(id);
//	}
	
	@GetMapping("/allEvents")
	public @ResponseBody List<Event> findAllFood(){
		//return foodDao.findAll();
		List<Event> es = eventDao.findByOrderByDateAsc();
		for (Event e: es) {
			e.setTimeInWords(TimeService.changeTimeToWords(e.getTime()));
		}
		return es;
	}
	
	@PostMapping("/createEvent/{name}/{location}/{date}/{time}")
	public @ResponseBody Event createFood(@PathVariable("name") String name, @PathVariable("location") String location, @PathVariable("date") String date, @PathVariable("time") String time) {
		Event e = new Event(name, location, date, time);
		eventDao.save(e);
		e.setTimeInWords(TimeService.changeTimeToWords(time));
		return e;
	}
	
	@GetMapping("/currentTimeInWords")
	public @ResponseBody JSON currentTime() {
		System.out.println("in get current time");
		LocalTime time = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmm");
		return new JSON(TimeService.changeTimeToWords(time.format(formatter)));
	}
	
	@PostMapping("/timeInWords/{time}")
	public @ResponseBody String timeInWords(@PathVariable("time") String time) {
		System.out.println("inside time in words");
		System.out.println(time);
		return TimeService.changeTimeToWords(time);
	}
	
//	@PutMapping("/updateFood/{id}/{name}/{calories}")
//	public @ResponseBody Food updateFood(@PathVariable("id") int id, @PathVariable("name") String name, @PathVariable("calories") double calories) {
//		Food f = foodDao.findByFoodId(id);
//		f.setDishName(name);
//		f.setCalories(calories);
//		foodDao.save(f);
//		return f;
//	}
//	
//	@DeleteMapping("/deleteFood/{name}")
//	public @ResponseBody String deleteFood(@PathVariable("name") String name) {
//		try {
//		Food f = foodDao.findByDishName(name);
//		foodDao.delete(f);
//		} catch(Exception e) {
//			e.printStackTrace();
//			return "Delete Failed";
//		}
//		return "Delete Successful";
//	}
	
}

