package model;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

/*
 * This is the model part of MVC. This class will handle all the data and will, later on, handle persitence. (I.e. database connectivity.)
 */
public class DodleModel{
	Map <Integer, DodleGroup> dodleGroups = new HashMap<Integer, DodleGroup>();
	Map <Integer, DodlePerson> dodlePersons = new HashMap<Integer, DodlePerson>();
	Map <Integer, DodleEvent> dodleEvents = new HashMap<Integer, DodleEvent>();

	// business logic...
	public DodlePerson newPerson(String name, int userId, String description){
		
		// find the first unused id
		int id = 1;
		while(dodleEvents.containsKey(id)) id++;

		DodlePerson newPerson = new DodlePerson();
		newPerson.setName(name);
		newPerson.setId(id);
		newPerson.setUserId(userId);
		newPerson.setDescription(description);
		dodlePersons.put(id, newPerson);

		return newPerson;
	}
	
	public boolean deletePerson(int id){
		boolean done = false;
		if(dodlePersons.containsKey(id)) {
			dodlePersons.remove(id);
			done = true;
		}
		return done;
	}	
	
	public DodlePerson getPerson(int id){
		DodlePerson retPerson = null;
		if(dodlePersons.get(id) != null) retPerson = dodlePersons.get(id);
		return retPerson;
	}
	
	public DodleEvent newEvent(String name, Date startDate, Date endDate, String description){
		
		// find the first unused id
		int id = 1;
		while(dodleEvents.containsKey(id)) id++;

		DodleEvent newEvent = new DodleEvent();
		newEvent.setName(name);
		newEvent.setId(id);
		newEvent.setStartDate(startDate);
		newEvent.setEndDate(endDate);
		newEvent.setDescription(description);
		dodleEvents.put(id, newEvent);

		return newEvent;

	}
	public boolean deleteEvent(int id){
		boolean done = false;		
		if(dodleEvents.containsKey(id)) {
			dodleEvents.remove(id);
			done = true;
		}
		return done;
	}
	public DodleEvent getEvent(int id){
		DodleEvent retEvent = null;
		if(dodleEvents.get(id) != null) retEvent = dodleEvents.get(id);
		return retEvent;
	}
	
	
	public DodleGroup newGroup(String name){
		
		// find the first unused id
		int id = 1;
		while(dodleGroups.containsKey(id)) id++;

		DodleGroup newGroup = new DodleGroup();
		newGroup.setName(name);
		newGroup.setId(id);
		dodleGroups.put(id, newGroup);

		return newGroup;
	}
	public boolean deleteGroup(int id){
		boolean done = false;		
		if(dodleGroups.containsKey(id)) {
			dodleGroups.remove(id);
			done = true;
		}
		return done;
	}
	
	public DodleGroup getGroup(int id){
		DodleGroup retGroup = null;
		if(dodleGroups.get(id) != null) retGroup = dodleGroups.get(id);
		return retGroup;
	}
	
	//getters and setters...
	public Map<Integer, DodleGroup> getGroups() {
		return dodleGroups;
	}

	public void setGroups(Map<Integer, DodleGroup> dodleGroups) {
		this.dodleGroups = dodleGroups;
	}

	public Map<Integer, DodlePerson> getPersons() {
		return dodlePersons;
	}

	public void setPersons(Map<Integer, DodlePerson> dodlePersons) {
		this.dodlePersons = dodlePersons;
	}

	public Map<Integer, DodleEvent> getEvents() {
		return dodleEvents;
	}

	public void setEvents(Map<Integer, DodleEvent> dodleEvents) {
		this.dodleEvents = dodleEvents;
	}



}
