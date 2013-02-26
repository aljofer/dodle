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
	//test preparation...
	DodleControl controlToTest = new DodleControl();
	DodleModel testModel = new DodleModel();
	DodleView testView = new DodleView();
	
	@Test
	public void testDodleControl(){
		//let's see whether the constructor worked...
		assertNotNull(DodleControl.getControl());
		assertNotNull(DodleControl.getModel());
		assertNotNull(DodleControl.getView());
	}
	
	@Test
	public void testDodleModel(){		
	
		
	}
	
}
