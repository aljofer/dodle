package test;

import org.junit.Test;
import static org.junit.Assert.*;
import control.DodleControl;
import model.DodleModel;
import view.DodleView;
import model.DodleEvent;
import model.DodleGroup;
import model.DodlePerson;

/*
 * This is a test class for the JUnit tests. Tests will be implemented here before the feature they test are implemented in their respective classes.
 */

public class DodleTest{



	
	@Test
	public void testDodleControl(){
		//test preparation...
		DodleControl controlToTest = new DodleControl();
		//let's see whether the constructor worked...
		assertNotNull(DodleControl.getControl());
		assertNotNull(DodleControl.getModel());
		assertNotNull(DodleControl.getView());
	}
	
	@Test
	public void testDodleModel(){		
		DodleModel testModel = new DodleModel();
	}
	
	@Test
	public void testDodleGroup(){
		DodleGroup testGroup = new DodleGroup();
		testGroup.setName("Testgroup");
		testGroup.setId(23);
	}
	
	@Test
	public void testDodlePerson(){
		
	}
	
	@Test
	public void testDodleEvent(){
		
	}
	@Test
	public void testDodleView(){
		DodleView testView = new DodleView();
	}
	
}
