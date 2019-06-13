package edu.buffalostate.cis425.sp19.exercises.baker;

/**
 * File: MeFirstPanel.java
 *
 * Description: This class defines a GUI in a JPanel which contains
 * two JButton with initial labels "Me first!" and "Me next!".
 * Pressing either button causes the labels to be exchanged.
 *
 * Assignment: 1) Add a third button to the panel, with the label "third"
 *             2) Every time any of the buttons are pressed, the labels 
 *                should shift one place to the right first->second->third 
 *                would shift to third->first->second when one of the buttons
 *                was pressed
 */

/**
 *
 * @author put-your-name-here
 *
 */

import javax.swing.*;
import java.awt.event.*;


public class MeFirstPanel extends JPanel implements ActionListener {
  private JButton aButton;
  private JButton bButton;
  private JButton cButton;
  // add button here

  String aText = "first";
  String bText = "second";
  String cText = "third";
  // add string here 

  String tempText; // To use to exchange labels



  public MeFirstPanel() {
	    aButton = new JButton(aText);
	    aButton.addActionListener(this); // add event handler
	    bButton = new JButton(bText);
		 bButton.addActionListener(this); // add event handler
		cButton = new JButton(cText);
		cButton.addActionListener(this);
		 add(aButton); // add button to JPanel
		 add(bButton); // add button to JPanel
		 add(cButton);
	  } // End MeFirstPanel()

	  /**
	   * actionPerformed
	   * @param e button clicked
	   */
	  public void actionPerformed(ActionEvent e) {
	    tempText = aText;  // Exchange the strings
	    aText = bText;
	    bText = cText;
	    cText = tempText;
	    // add code here
	    aButton.setText(aText); // Set button labels
	    bButton.setText(bText);
	    cButton.setText(cText);
	    // add code here
	  } // EndactionPeformed()
	} // End MeFirstPanel class