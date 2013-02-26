package model;

import java.util.Map;

public class Person {
	
	String name;
	Integer id;
	Integer userId;
	String description;
	Map<Integer, Group> groups;
	Map<Integer, Event> schedule;
	
	public Person(String name, int id, int userId, String description) {
		super();
		this.name = name;
		this.id = id;
		this.userId = userId;
		this.description = description;
	}

	
	// business logic... 
	public boolean addGroup(Group group){
		boolean done = false;
		if(!groups.containsKey(group.getId())) {
			groups.put(group.getId(), group);
			done = true;
		}
		return done;
	}
	public boolean deleteGroup(int id){
		boolean done = false;
		if(groups.containsKey(id)) {
			groups.remove(id);
			done = true;
		}
		return done;
	}
	public boolean addEvent(Event event){
		boolean done = false;
		if(!schedule.containsKey(event.getId())) {
			schedule.put(event.getId(), event);
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
	public Map<Integer, Group> getGroups() {
		return groups;
	}
	public void setGroups(Map<Integer, Group> groups) {
		this.groups = groups;
	}
	public Map<Integer, Event> getSchedule() {
		return schedule;
	}
	public void setSchedule(Map<Integer, Event> schedule) {
		this.schedule = schedule;
	}
	
}
