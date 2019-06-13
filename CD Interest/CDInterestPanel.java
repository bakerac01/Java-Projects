package edu.buffalostate.cis425.sp19.exercises.baker;
/**
 * File: CDInterestPanel.java
 *
 * Description: This class defines a GUI in a JPanel which contains
 * JTextFields for entering principal, interest rate, and years
 * and a JButton which when clicked will compute the maturity
 * value of a CD with those values and will display this value
 * in a JTextField. It uses the BankCD class.
 *
 * Assignment:
 *   1) Change the layout of the component so that it looks
 *      more "professional" (use a Layout Manager). You can
 *      decide on the aesthetics...
 *   2) Add error checking to the inputs, so that data is
 *      entered correctly. Catch errors and other bad input
 *   3) Add a TextField or TextArea object to display any
 *      error messages from 2) above
 */

/** 
 * 
 * @author Alan Baker
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
public class CDInterestPanel extends JPanel implements ActionListener {
  
	JFrame frame = new JFrame("GridLayout");
	
	private JLabel prompt1; // Prompt for the principal.
  private JLabel prompt2; // Prompt for the interest rate.
  private JLabel prompt3; // Prompt for the number of years.
  private JTextField inputField1; // For principal.
  private JTextField inputField2; // For interest rate.
  private JTextField inputField3; // For number of years
  private JLabel resultLabel;  // Labels the output
  private JTextField resultField;  // The output
  private JButton button;  // Click to compute the maturity value.
  private JLabel errorLabel; //label for error output box.
  private JTextField errorField; //output field for errors
  private JLabel blankLabel; // used for spacing grid layout correctly
  

  public CDInterestPanel() {
	  setLayout ( new FlowLayout() );
	
    
    
    
    
    
    prompt1 = new JLabel("Enter the CD's initial principal:");
	 prompt2 = new JLabel("Enter the CD's interest rate (percent):");
	 prompt3 = new JLabel("Enter the number of years to maturity:");
	 resultLabel = new JLabel("The Maturity Value is:");
	 inputField1 = new JTextField(10);
	 inputField1.setEditable(true);
	 inputField2 = new JTextField(10);
	 inputField2.setEditable(true);
	 inputField3 = new JTextField(10);
	 inputField3.setEditable(true);
	 resultField = new JTextField(10);
	 button = new JButton("Calculate the Maturity Value");
	 button.addActionListener(this);
	 errorLabel = new JLabel("Error Message");
	 errorField = new JTextField (20);
	 blankLabel = new JLabel("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	add(prompt1);
	add(inputField1);
	 add(prompt2);
	 add(inputField2);
	 add(prompt3);
	 add(inputField3);
	 add(button);
	 add(resultLabel);
    add(resultField);
    add (blankLabel);
    add(errorLabel);
    add (errorField);
    
  } // End CDInterestPanel()

  /** 
   * actionPerformed() handles clicks on the calculate button.
   * It inputs the data from the JTextFields, converts them to 
   * numeric values and calls on the BankCD object to perform 
   * the calculation. It translates the result into a currency format 
   * and displays it in a JTextField. 
   *
   * @param e event
   */
  public void actionPerformed(ActionEvent e) {
    boolean flag = true;
	  String inputString = inputField1.getText();
    double principal =0;
    try {
    	principal = Double.parseDouble(inputString);
    } catch 
    	(NumberFormatException ex) {
        	errorField.setText("Enter a Valid INT for Principal");
        	  	flag = false;
    }
    
    inputString = inputField2.getText();
    double rate = 0;
    try{
    	rate = Double.parseDouble(inputString)/100.0;
    } catch (NumberFormatException ex) {
    	errorField.setText("Enter a Valid INT for interest rate");
    	  	flag = false;
    }
    
    inputString = inputField3.getText();
    double years = 0;
    try {
    	years = Double.parseDouble(inputString);
    } catch (NumberFormatException ex) {
    	errorField.setText("Enter a Valid INT for years to maturity");
    		flag = false;
    }
    
    if (flag == false){
    	resultField.setText(" ");
    } else {
    BankCD cd = new BankCD(principal, rate, years);
    double maturityValue = cd.calcYearly();

    NumberFormat dollars = NumberFormat.getCurrencyInstance();
    String resultStr = dollars.format(maturityValue);
    resultField.setText(resultStr);
    }
  } // End actionPeformed()
} // EndCDInterestPanel class