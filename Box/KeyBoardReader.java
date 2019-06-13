package edu.buffalostate.cis425.sp19.exercises.baker;

/*
 * File: KeyBoardReader.java
 *
 */

/** 
 * 
 * @author Alan Baker
 * 
 */

import java.io.*;

import edu.buffalostate.cis425.sp19.exercises.baker.UserInterface.userInterface;



// See Box.java for instructions

public class KeyBoardReader implements userInterface {
	  public int value;
	  
	private BufferedReader reader;
	  public KeyBoardReader() {
	    reader = new BufferedReader(new InputStreamReader(System.in));
	  }
	  public String getKeyboardInput() {
	    return readKeyboard();
	  }
	  public int getKeyboardInteger() {
	    return Integer.parseInt(readKeyboard());
	  }
	  // HINT: add new method that limits input in range from Min to Max
	  public  int getKeyboardIntegerRange(int min, int max) {
		 
		  
		 
		  int value = getKeyboardInteger();
		  while (value < min || value > max){
		 
			  System.out.println("*ERROR* Please Enter a Number between 1 and 10");
		  
		
		  }
		return value;
		  		  
	  }
	 
		  
	  
	    // fill in rest, method should not return until the user entered number is within range
	    // Prompt user with message if number is not within range before looping for another try.
	    // Catch exceptions
	  
	  public double getKeyboardDouble() {
	    return Double.parseDouble(readKeyboard());
	  }
	  public String getUserInput() {
	    return getKeyboardInput();
	  }
	  public void prompt(String s) {
	    System.out.print(s);
	  }
	  public void report(String s) {
	    System.out.print(s);
	  }
	  public void display(String s) {
	    System.out.print(s);
	  }
	  private String readKeyboard() {
	    String line = "";
	    try {
	      line = reader.readLine();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	    return line;
	  }
	}
