package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Event;

public interface EventDao extends CrudRepository<Event, Integer>{

	public List<Event> findAll();
	public List<Event> findByOrderByEventName();
	public List<Event> findByOrderByEventNameDesc();
	
	public Event findByEventId(int id);
	public Event findByEventName(String dishName);
	public Event findByLocation(String location); //variable name doesn't matter
	public Event findByEventNameAndLocation(String eventName, String location);
	public List<Event> findByOrderByDateAsc();
	
}
