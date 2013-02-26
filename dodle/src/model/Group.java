package model;

import java.util.HashMap;
import java.util.Map;

public class Group {
	String name;
	int id;
	Map<Integer,Person> members = new HashMap<Integer,Person>();


	public Group() {
	}

	// business logic...
	public boolean addPerson(Person person){
		boolean done = false;
		if(!members.containsKey(person.getId())) {
			members.put(person.getId(), person);
			done = true;
		}
		return done;
	}
	
	public boolean deletePerson(int id){
		boolean done = false;
		if(members.containsKey(id)) {
			members.remove(id);
			done = true;
		}
		return done;
	}
	
	
	// getters and setters...
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
	public Map<Integer,Person> getMembers() {
		return members;
	}
	public void setMembers(Map<Integer, Person> members) {
		this.members = members;
	}
}
