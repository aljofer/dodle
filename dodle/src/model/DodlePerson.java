package model;

import java.util.Map;

public class DodlePerson {
	
	String name;
	Integer id;
	Integer userId;
	String description;
	Map<Integer, DodleGroup> dodleGroups;
	Map<Integer, DodleEvent> schedule;
	
	public DodlePerson() {
	}

	
	// business logic... 
	public boolean addGroup(DodleGroup dodleGroup){
		boolean done = false;
		if(!dodleGroups.containsKey(dodleGroup.getId())) {
			dodleGroups.put(dodleGroup.getId(), dodleGroup);
			done = true;
		}
		return done;
	}
	public boolean deleteGroup(int id){
		boolean done = false;
		if(dodleGroups.containsKey(id)) {
			dodleGroups.remove(id);
			done = true;
		}
		return done;
	}
	public boolean addEvent(DodleEvent dodleEvent){
		boolean done = false;
		if(!schedule.containsKey(dodleEvent.getId())) {
			schedule.put(dodleEvent.getId(), dodleEvent);
			done = true;
		}
		return done;
	}
	public boolean deleteEvent(Integer id){
		boolean done = false;
		if(schedule.containsKey(id)) {
			schedule.remove(id);
			done = true;
		}
		return done;
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Map<Integer, DodleGroup> getGroups() {
		return dodleGroups;
	}
	public void setGroups(Map<Integer, DodleGroup> dodleGroups) {
		this.dodleGroups = dodleGroups;
	}
	public Map<Integer, DodleEvent> getSchedule() {
		return schedule;
	}
	public void setSchedule(Map<Integer, DodleEvent> schedule) {
		this.schedule = schedule;
	}
	
}
