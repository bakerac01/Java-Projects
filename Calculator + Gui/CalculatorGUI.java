package edu.buffalostate.cis425.sp19.exercises.baker;


/**
 * File: CalculatorGUI.java
 *
 * Description: This class creates an user interface for
 * a four-function integer calculator. The keys are arranged
 * in a 4 x 4 grid, which is at the center of the Frame's
 * border layout. At the north of the border layout is the
 * calculator's accumulator/display, implemented with a text
 * field. This version creates an instance of the Calculator
 * class which performs the operations associated with the
 * interface. See the actionPerformed() method.
 *
 * Assignment: 
 *   1) Add four extra buttons to this calculator
 *      - the new buttons should be: * SM, RM, CM, X^2
 *      SM is short for Store Memory
 *      RM is short for Recall Memory
 *      CM is short for Clear Memory
 *      X^2 is short for X*X
 *      Add these buttons to the bottom row of the display
 *   2) Modify Calculator.java to add the extra functionality
 *      See HINTS for help
 */

/**
 * 
 * @author Alan Baker 
 * 
 */
 
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener{
	private final long serialVersionUID = 1L;
	  private final static int NBUTTONS = 20; // Constants - HINT add 4 extra buttons
	  private JPanel keyPadPanel; // Panel to hold keyPad
	  private JTextField accumulator; // Calculator's display
	  private JButton keyPad[]; // Internal keyPad array
	  private String label[] =  // 16 keyPad Button Labels
	                          {  "1","2","3","+",
	                             "4","5","6","-",
	                             "7","8","9","*",
	                             "C","0","=","/", "SM", "RM", "CM", "X^2"  }; // HINT add the label to the new buttons
	  private Calculator calcMachine = new Calculator(); // The calculator
	  /**
	   * CalculatorGUI() constructor sets up the GUI.
	   * @param title -- String for panel title
	   */
	  public CalculatorGUI(String title) {
	    // Set up the keypad grid layout
	    super(title);
	    keyPadPanel = new JPanel();
	    keyPadPanel.setLayout(new GridLayout (5,4,5,5)); // HINT - bigger grid for the new buttons
	    // Create an array of buttons
	    keyPad = new JButton [NBUTTONS];
	    for (int k = 0; k < keyPad.length; k++) {
	      // For each array slot Create a button
	      keyPad[k] = new JButton( label[k] );
	      // And a listener for it
	      keyPad[k].addActionListener(this);
	      // And add it to the panel
	      keyPadPanel.add(keyPad[k]);
	      
	      if (k == 0 || k == 1 || k == 2 || k == 4 || k == 5 || k == 6 || k == 8 || k == 9 || k == 10 || k == 13 ){
	    	  keyPad[k].setBackground(Color.BLUE);
	    	  keyPad[k].setForeground(Color.BLACK);
	      } else if (k == 3 || k == 7 || k == 11 || k == 15 || k == 19) {
	    	  keyPad[k].setBackground(Color.CYAN);
	      } else if (k == 14){
	    	  keyPad[k].setBackground(Color.red);
	      } else {
	    	  keyPad[k].setBackground(Color.GREEN);
	      }
	    	  
	    	  
	    } // End for
	    // Set up the accumulator display
	    accumulator = new JTextField("0",20);
	    accumulator.setEditable (false);
	    // Add components to the frame with Border layout
	    getContentPane().setLayout(new BorderLayout(10, 10));
	    getContentPane().add("North", accumulator);
	   getContentPane().add("Center", keyPadPanel);
	  } // End CalculatorGUI()
	  /**
	   * actionPerformed() handles all the action on the
	   * calculator's keys. In this version the key plus the
	   * current value of the calculator's display are passed
	   * to the Calculator object, which performs an operation
	   * and returns a result.   
	   * @param e -- Event
	   */
	  public void actionPerformed (ActionEvent e) {
	    // Get the button that was clicked
	    JButton b = (JButton) e.getSource();
	    //  And its label
	    String key = b.getText();
	    String result = calcMachine.handleKeyPress(key, accumulator.getText());
	    accumulator.setText(result);
	  } // End actionPerformed()

	  /**
	   * main() creates an instance of the interface.
	   * @param args - command line argiments
	   */
	  public static void main( String args[] ) {
	    // Make calculator look like a windows app
	    try {
//	      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//	      UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//	      UIManager.setLookAndFeel("javax.swing.plaf.mac.MacLookAndFeel");
//	      UIManager.setLookAndFeel("javax.swing.plaf.motif.MotifLookAndFeel");
	      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//	      UIManager.getCrossPlatformLookAndFeelClassName());
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
		 }
	    CalculatorGUI calc = new CalculatorGUI("Calculator");
	    calc.setSize(400,400);
	    calc.setVisible(true);
	    calc.addWindowListener(new WindowAdapter() {

	    public void windowClosing(WindowEvent e) {
	      System.exit(0);
	    }
	    });
	  } // End main()
	} // END CalculatorGUI
