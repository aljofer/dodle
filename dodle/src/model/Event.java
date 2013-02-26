package model;

import java.sql.Date;
import java.util.Map;

public class Event {
	String name;
	Integer id;
	Date startDate;
	Date endDate;
	String description;
	Map<Integer,Person> attendees;
	
	
	public Event() {
	}

	public boolean addAttendee(Person person){
		boolean done = false;
		if(!attendees.containsKey(person.getId())) {
			attendees.put(person.getId(), person);
			done = true;
		}
		return done;
	}
	
	public boolean deleteAttendee(Integer id){
		boolean done = false;
		if(attendees.containsKey(id)) {
			attendees.remove(id);
			done = true;
		}
		return done;
	}
	
	public void changeDate(Date newStart, Date newEnd){
		this.startDate = newStart;
		this.endDate = newEnd;
	}
	
	// getters and setters for persistence...
	
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

}
