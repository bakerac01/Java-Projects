package edu.buffalostate.cis425.sp19.exercises.baker;
/**
 * File: GradeCalcPanel . java 
 * Author: Java Java Java  -
 * This class provides a user interface to
 * the GradeCalc class, which calculates a student's average
 * and letter grade for grades input into a JTextField .
 * The interface consists of input and output JTextFields and
 * and button to calculate the course average and letter grades. 
 * Also, add a text box to display user error/informational messages,
 * similar to resultField. 
 */
/**
 *
 * @author Alan Baker
 * 
 */
// See GradeCalculator . java for instructions

import javax .swing.*;
import java . awt .*;
import java . awt .event.*;
import java .text.*;

public class GradeCalcPanel extends JPanel implements ActionListener {
  private JLabel prompt; // GUI components
  private JTextField   inputField ;
  private JLabel   resultLabel ;
  private JLabel countLabel;
  private JTextField countField;
  private JTextField   resultField ;
  private JTextField 	errorField;
  private JButton button;
  private GradeCalculator calculator;  // The Calculator object

  public GradeCalcPanel () {
    calculator = new GradeCalculator (); // Create a calculator instance
     // setLayout ( new GridLayout (1,5,10,10));
    prompt = new JLabel ("Grade:");
    resultLabel = new JLabel ("Average:");
    countLabel = new JLabel ("Count:");
    countField = new JTextField (5);
    inputField = new JTextField (10);
    resultField = new JTextField (20);
    errorField = new JTextField (30);
    resultField . setEditable (false);
    button = new JButton ("Enter");
    button. addActionListener (this);
    add(prompt);
    add( inputField );
    add(button);
    add( resultLabel );
    add( resultField );
    add (countLabel);
    add (countField);
    add (errorField);
    inputField . setText ("");
  } // end GradeCalcPanel ()

  /**
   * actionPerformed () handles clicks on the button. 
   * It takes the data from the input JTextFields , and sends them to
   * the GradeCalculater class to calculate a running average and
   * computes the letter grade, which are displayed in TextFields .
   * @param e -- the ActionEvent the generated this system call
   */
  public void actionPerformed ( ActionEvent e) {
    errorField.setText(" ");
	  double grade = 0, ave;
    DecimalFormat   df = new DecimalFormat ("0.00");
    String inputString = inputField . getText ();
    // HINT: use try/catch blocks to catch bad input to parseDouble ()
    try {
    grade = Double. parseDouble ( inputString );
    } catch (NumberFormatException ex) {
    	errorField.setText("Enter a Valid INT");
    	return;
    }
    inputField . setText ("");
    
   
    // HINT: reject a bad grade in some way (the modified addGrade will return false
    // there is a problem with the grade
    
    	
    	if	(calculator.addGrade (grade) == false);{
    	errorField.setText("Enter a grade between 0 and 100");
    	}
    	
    
    // HINT: output grade count along with average and letter grade
   int gradeCount = calculator.getCount();
   String gradecount = "" + df.format(gradeCount);
    countField.setText(gradecount);
    ave = calculator. calcAvg ();
    String average = "" + df .format(ave);
    String letterGrade = calculator. calcLetterGrade ();
    resultField . setText (average + " " + letterGrade );
  } // end actionPeformed ()
} // end GradeCalcPanel class