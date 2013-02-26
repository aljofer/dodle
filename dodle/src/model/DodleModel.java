package model;

public class DodleModel {
/*
 * This is the model part of MVC. This class will handle all the data and will, later on, handle persitence. (I.e. database connectivity.)
 */
	public Person newPerson(){
		return new Person();
	}
	
	public Event newEvent(){
		return new Event();
	}

}
