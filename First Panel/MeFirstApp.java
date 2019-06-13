package edu.buffalostate.cis425.sp19.exercises.baker;
/**
 * File: MeFirstApp.java
 *
 * Description: This app creates a MeFirstPanel and
 *  adds it to the app's content pane.
 *
 * Assignment: see MeFirstPanel.java
 *
 */
/** 
 * 
 * @author Alan Baker 
 * 
 */


import javax.swing.*;

public class MeFirstApp extends JFrame {
	private static final long serialVersionUID = 1L;

	  public MeFirstApp() {
		 setSize(200,200);
		 getContentPane().add(new MeFirstPanel());
		 //register 'Exit upon closing' as a default close operation
	    setDefaultCloseOperation( EXIT_ON_CLOSE );
	  } // End MeFirstApp

	  public static void main(String args[]) {
	    MeFirstApp b = new MeFirstApp();
	    b.setVisible(true);
}
}
