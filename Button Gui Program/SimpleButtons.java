package edu.buffalostate.cis425.sp19.assignments.baker;

import javax .swing.*;



import java . awt .*;
import java . awt .event.*;
import java .text.*;

public class SimpleButtons extends JFrame implements ActionListener {
	public JButton button0;
	public JButton button1;
	public JButton button2;
	public JButton button3;
	public JTextField resultField;
	
	public SimpleButtons(){
		
		setTitle("Simple Buttons");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200,200);
		setLocationRelativeTo(null);
		setResizable(false);
	
		JPanel panelMain = new JPanel(new FlowLayout());
		
		getContentPane().add(panelMain);
		
		button0 = new JButton ("0");
		panelMain.add(button0);
		button1 = new JButton ("1");
		panelMain.add(button1);
		button2 = new JButton ("2");
		panelMain.add(button2);
		button3 = new JButton ("3");
		panelMain.add(button3);
		resultField = new JTextField (5) ;
		panelMain.add(resultField, FlowLayout.TRAILING);
		resultField . setEditable (false);
	
		button0.addActionListener(this);
		button0.setActionCommand("zero");
		button1.addActionListener(this);
		button1.setActionCommand("one");
		button2.addActionListener(this);
		button2.setActionCommand("two");
		button3.addActionListener(this);
		button3.setActionCommand("three");
	}
	
	
	public void actionPerformed(ActionEvent ae) {
	    resultField.setText(" ");
		String action = ae.getActionCommand();
	    if (action.equals("zero")) {
	    	resultField.setText("0");
	      	
	    } else if (action.equals("one")) {
	    	resultField.setText("1");
	    	
	    } else if (action.equals("two")) {
	    	resultField.setText("2");
	    	
	    } else if (action.equals("three")) {
	    	resultField.setText("3");
	    	
	    }
	    }

	
	
public static void main(String args []){
    // change GUI so that it looks like Windows GUI, don't worry about this now
    try {
      UIManager . setLookAndFeel ("com.sun. java .swing. plaf .windows. WindowsLookAndFeel ");
    } catch (Exception e) {}
    SimpleButtons  aframe = new SimpleButtons ();
   
    aframe . setVisible (true);

}
}


