package model;

import java.util.Map;

public class Person {
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
	public Person(String name, int id, int userId, String description) {
		super();
		this.name = name;
		this.id = id;
		this.userId = userId;
		this.description = description;
	}
	String name;
	Integer id;
	Integer userId;
	String description;
	Map<Integer, Group> groups;
	Map<Integer, Event> schedule;
	
	public boolean addGroup(Group group){
		return true;
	}
	public boolean deleteGroup(int id){
		return true;
	}
	public boolean addEvent(Event event){
		return true;
	}
	public boolean deleteEvent(Integer id){
		return true;
	}
}
