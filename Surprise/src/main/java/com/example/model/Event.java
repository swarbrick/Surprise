package com.example.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="event")
public class Event {

	@Id
	@Column(name="event_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eventId;
	
	@Column(name="event_name", unique=true, nullable=false)
	private String eventName;
	
	@Column(name="location", nullable=false)
	private String location;
	
	@Column(name="d", nullable=false)
	private String date;
	
	@Column(name="t", nullable=false)
	private String time;
	
	@Column(name="time_in_words", nullable=true)
	private String timeInWords;

	public Event() {}
	
	public Event(int eventId, String eventName, String location, String date, String time) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.location = location;
		this.date = date;
		this.time = time;
	}
	
	public Event(String eventName, String location, String date, String time) {
		super();
		this.eventName = eventName;
		this.location = location;
		this.date = date;
		this.time = time;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTimeInWords() {
		return timeInWords;
	}

	public void setTimeInWords(String timeInWords) {
		this.timeInWords = timeInWords;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", location=" + location + ", date=" + date
				+ ", time=" + time + ", timeInWords=" + timeInWords + "]";
	}

	
	
	
		
}
