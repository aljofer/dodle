package model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
 * This is the model part of MVC. This class will handle all the data and will, later on, handle persitence. (I.e. database connectivity.)
 */
public class DodleModel{
	Map<Integer, Group> groups = new HashMap<Integer, Group>();
	Map <Integer, Person> persons = new HashMap<Integer, Person>();
	Map <Integer, Event> events = new HashMap<Integer, Event>();

	// business logic...
	public Person newPerson(String name, int userId, String description){
		
		// find the first unused id
		int id = 0;
		while(events.containsKey(id)) id++;

		
		Person newPerson = new Person(name, id, userId, description);
		persons.put(id, newPerson);

		return newPerson;
	}
	
	public boolean deletePerson(int id){
		boolean done = false;
		if(persons.containsKey(id)) {
			persons.remove(id);
			done = true;
		}
		return done;
	}	
	
	public Person getPerson(int id){
		Person retPerson = null;
		if(persons.get(id) != null) retPerson = persons.get(id);
		return retPerson;
	}
	
	public Event newEvent(String name, Date startDate, Date endDate, String description){
		
		// find the first unused id
		int id = 0;
		while(events.containsKey(id)) id++;

		Event newEvent = new Event(name, id, startDate, endDate, description);
		events.put(id, newEvent);

		return newEvent;

	}
	public boolean deleteEvent(int id){
		boolean done = false;		
		if(events.containsKey(id)) {
			events.remove(id);
			done = true;
		}
		return done;
	}
	public Event getEvent(int id){
		Event retEvent = null;
		if(events.get(id) != null) retEvent = events.get(id);
		return retEvent;
	}
	
	
	public Group newGroup(String name){
		
		// find the first unused id
		int id = 0;
		while(groups.containsKey(id)) id++;

		Group newGroup = new Group(name, id);
		groups.put(id, newGroup);

		return newGroup;
	}
	public boolean deleteGroup(int id){
		boolean done = false;		
		if(groups.containsKey(id)) {
			groups.remove(id);
			done = true;
		}
		return done;
	}
	
	public Group getGroup(int id){
		Group retGroup = null;
		if(groups.get(id) != null) retGroup = groups.get(id);
		return retGroup;
	}
	
	//getters and setters...
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



}
