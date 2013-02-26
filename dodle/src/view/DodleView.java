package view;

import java.awt.Toolkit;

import javax.swing.*;

public class DodleView {
/*
 * This is the View part of the MVC pattern. This will be implemented utilizing the Swing GUI framework. And further on this will be expanded into providing a Web-sevice, probably implementing RESTfulness.
 */
	public DodleView(){
	JFrame window = new JFrame("dodle");
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setSize(800,600);
	window.setVisible(true);
	Toolkit.getDefaultToolkit().setDynamicLayout(true);
	}
}
