package model;

import java.util.HashMap;
import java.util.Map;

public class DodleGroup {
	String name;
	int id;
	Map<Integer,DodlePerson> members = new HashMap<Integer,DodlePerson>();


	public DodleGroup() {
	}

	// business logic...
	public boolean addPerson(DodlePerson dodlePerson){
		boolean done = false;
		if(!members.containsKey(dodlePerson.getId())) {
			members.put(dodlePerson.getId(), dodlePerson);
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
	public Map<Integer,DodlePerson> getMembers() {
		return members;
	}
	public void setMembers(Map<Integer, DodlePerson> members) {
		this.members = members;
	}
}
