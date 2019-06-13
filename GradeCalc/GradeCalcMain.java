package edu.buffalostate.cis425.sp19.exercises.baker;
/**
 * File: GradeCalcMain . java 
 * Description: This program creates a GradeCalcPanel and
 * adds it to the Frame's content pane and sets its size.
 */
/**
 *
 * @author Alan Baker
 *
 */
// See GradeCalculator . java for instructions

import javax .swing.*;

public class GradeCalcMain extends JFrame {
	 public GradeCalcMain () {
		    getContentPane ().add(new GradeCalcPanel ());
		    // register 'Exit upon closing' as a default close operation
		    setDefaultCloseOperation ( EXIT_ON_CLOSE );
		  } // end GradeCalcFrame () constructor
		  public static void main(String args []){
		    // change GUI so that it looks like Windows GUI, don't worry about this now
		    try {
		      UIManager . setLookAndFeel ("com.sun. java .swing. plaf .windows. WindowsLookAndFeel ");
		    } catch (Exception e) {}
		    GradeCalcMain   aframe = new GradeCalcMain ();
		    aframe . setSize (1250,75);
		    aframe . setVisible (true);
		  } // main()
		} // GradeCalcMain class

