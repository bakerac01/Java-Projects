package edu.buffalostate.cis425.sp19.exercises.baker;
/**
 * File: CDInterestApp.java
 *
 * Description: This program creates a CDInterestPanel and
 * adds it to the Frame's content pane and sets its size.
 *
 * Assignment: See CDInterestPanel.java file
 *
 */
/** 
 * 
 * @author Alan Baker
 * 
 */

import javax.swing.*;

public class CDInterestApp extends JFrame {
  public CDInterestApp() {
    getContentPane().add(new CDInterestPanel());
    //register 'Exit upon closing' as a default close operation
    setDefaultCloseOperation( EXIT_ON_CLOSE );
  } // End CDInterestFrame() constructor

  /**
   * main()
   * @param args command line arguments
   */
  public static void main(String args[]){
    CDInterestApp aframe = new CDInterestApp();
    aframe.setSize(250,325);
    aframe.setVisible(true);
    aframe.setResizable(false);
    
    
    
  } // End main()
} // End CDInterestApp class