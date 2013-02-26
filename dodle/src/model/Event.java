package model;

import java.util.Date;
import java.util.Map;

public class Event {
	String name;
	Integer id;
	Date startDate;
	Date endDate;
	String description;
	Map<Integer,Person> attendees;
	
	
	public Event(String name, int id, Date startDate, Date endDate,
			String description) {
		super();
		this.name = name;
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Map<Integer, Person> getAttendees() {
		return attendees;
	}
	public void setAttendees(Map<Integer, Person> attendees) {
		this.attendees = attendees;
	}
	public boolean addAttendee(Person person){
		return true;
	}
	public boolean deleteAttendee(Integer id){
		return true;
	}
}
