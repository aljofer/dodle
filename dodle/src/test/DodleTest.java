package test;

import org.junit.Test;
import static org.junit.Assert.*;
import control.DodleControl;
import model.DodleModel;
import view.DodleView;
import model.Event;
import model.Group;
import model.Person;

/*
 * This is a test class for the JUnit tests. Tests will be implemented here before the feature they test are implemented in their respective classes.
 */

public class DodleTest{
	//test preparation...
	DodleControl controlToTest = new DodleControl();
	DodleModel testModel = new DodleModel();
	DodleView testView = new DodleView();
	Group testGroup = new Group("Test Group", 1);
	Person testPerson = new Person("Test Person", 1, 0, "This is a test Person.");
	Event testEvent = new Event("Test Event", 1, null, null, "This is a test Event.");
	
	@Test
	public void testDodleControl(){
		//let's see whether the constructor worked...
		assertNotNull(DodleControl.getControl());
		assertNotNull(DodleControl.getModel());
		assertNotNull(DodleControl.getView());
	}
	
	@Test
	public void testDodleModel(){		
		// testing Person
		assertEquals("Test Person",testPerson.getName());
		assertEquals(1,testPerson.getId());
		assertEquals(0,testPerson.getUserId());
		assertEquals("This is a test Person.",testPerson.getDescription());

		// testing Group
		assertEquals("Test Group",testGroup.getName());
		assertEquals(1,testGroup.getId());
		
		// testing Event
		assertEquals("Test Event",testEvent.getName());
		assertEquals(1,testEvent.getId());
		assertEquals("This is a test Event.",testEvent.getDescription());
		
	}
	
}
