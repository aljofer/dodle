package model;

import java.util.Map;

/*
 * This is the model part of MVC. This class will handle all the data and will, later on, handle persitence. (I.e. database connectivity.)
 */
public class DodleModel {
	Map<Integer, Group> groups;
	Map <Integer, Person> persons;
	Map <Integer, Event> events;
	
	public Map<Integer, Group> getGroups() {
		return groups;
	}

	public void setGroups(Map<Integer, Group> groups) {
		this.groups = groups;
	}

	public Map<Integer, Person> getPersons() {
		return persons;
	}

	public void setPersons(Map<Integer, Person> persons) {
		this.persons = persons;
	}

	public Map<Integer, Event> getEvents() {
		return events;
	}

	public void setEvents(Map<Integer, Event> events) {
		this.events = events;
	}


	
	public Person newPerson(){
		return new Person(null, 0, 0, null);
	}
	
	public boolean deletePerson(int id){
		return true;
	}	
	
	public Person getPerson(int id){
		return new Person(null, id, id, null);
	}
	
	public void setPerson(){
	}
	
	public Event newEvent(){
		return new Event(null, 0, null, null, null);
	}
	public boolean deleteEvent(int id){
		return true;
	}
	public Event getEvent(int id){
		return new Event(null, id, null, null, null);
	}
	
	public void setEvent(){
	}
	
	public Group newGroup(){
		return new Group(null, 0);
	}
	public boolean deleteGroup(int id){
		return true;
	}
	
	public Group getGroup(int id){
		return new Group(null, id);
	}
	
	public void setGroup(){
	}
}
