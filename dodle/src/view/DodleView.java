package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.*;

public class DodleView {
/*
 * This is the View part of the MVC pattern. This will be implemented utilizing the Swing GUI framework. And further on this will be expanded into providing a Web-sevice, probably implementing RESTfulness.
 */
	public DodleView(){
	// setting up the main window
	JFrame window = new JFrame("dodle - the free and privacy protecting doodle clone!");
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Toolkit.getDefaultToolkit().setDynamicLayout(true);
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	window.setSize( dim.width/2 , dim.height/2 );
	window.setLocationRelativeTo(null);
	
	/* That's great, now let's fill it with actual things we want to have...
	*
	*/
	

	//Users expect Menu Bars at the top of the man window, so we should get one
	JMenuBar menuBar = new JMenuBar();
	window.setJMenuBar(menuBar);
	
	
	//A Menu all about ones own schedule and events
	JMenu scheduleMenu = new JMenu( "My Schedule" ); 
	menuBar.add( scheduleMenu );
	scheduleMenu.add( new JMenuItem("Show my Schedule...") );
	scheduleMenu.add( new JMenuItem("Add a New Event...") );
	
	//A Menu all about ones own schedule and events
	JMenu groupsMenu = new JMenu( "My Groups" ); 
	menuBar.add( groupsMenu );
	groupsMenu.add( new JMenuItem("Show my Groups...") );
	groupsMenu.add( new JMenuItem("Start a New Group...") );
	
	//So that the user can set his preferences
	JMenu optionsMenu = new JMenu( "Options" );
	menuBar.add( optionsMenu );
	optionsMenu.add( new JMenuItem("Preferences...") );


	
	//we need a panel so that things can happen in dodle
	JPanel panel = new JPanel();
	panel.setLayout( new FlowLayout() ); 
	window.add(panel);
	
	
	
	
	// let's draw everything on the screen
	window.setVisible(true);
	}
}
