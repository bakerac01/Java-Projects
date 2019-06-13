package edu.buffalostate.cis425.sp19.exercises.baker;

/**
 * File: Cube.java
 *
 * Description: This class creates an instance of the Cube
 * class and prints its area and volume.
 *
 * Assignment:
 *   1) Create 3 cube objects. The size of each of the cubes
 *      should be input from the keyboard
 *      (hint: study the code below)
 *   2) Print the Side length, Surface area and Volume to the
 *      users screen (console) for each of the cubes
 *   3) The program should catch input error exceptions and
 *      deal with them in a reasonable manner
 *
 */
/**
 *
 * @author Alan Baker
 * 
 */

import java.util.Scanner;
import java.io.*;
public class Cube {
	 // Hint: put your class variables and objects here
	private int length;
	
	
	public void cube(){
		length = 0;
		
	}
    // For example the Scanner statement as a 'static' object
	static Scanner sc = new Scanner(System.in);
    // Create the getLength() method to accept input and verify it is numeric
	public double getLength(double a){
		if(sc.hasNextInt()){
			a = sc.nextInt();
			return a;
	} else {
		System.out.println("Enter a Valid Integer");
		System.exit(0);
		return a;
		}
		
	}
    // Create the calculateSurfaceArea() method
	public double calculateSurfaceArea(double a){
		return 6 *(a*a);
	}
    // Create the calculateVolume() method
    public double calculateVolume(double a){
    	return a*a*a;
    }
    /**
     * main() -- creates 3 instances of Cube and calculates the surface area and volume
     */
    public static void main(String args[]) throws IOException {
        int length;

        // HINT: input the side from the keyboard and check for errors and exceptions 
        System.out.println("Enter Legth of cube1: ");
        length = sc.nextInt();
        Cube cube1 = new Cube();
        System.out.println("Side length of cube1 is " + cube1.getLength(length));
        System.out.println("Surface Area of cube1 is " + cube1.calculateSurfaceArea(length));
        System.out.println("Volume of cube1 is " + 	cube1.calculateVolume(length));

        // Hint - add two more cube instances
        System.out.println("Enter Legth of cube2: ");
        length = sc.nextInt();
        Cube cube2 = new Cube();
        System.out.println("Side length of cube2 is " + cube2.getLength(length));
        System.out.println("Surface Area of cube2 is " + cube2.calculateSurfaceArea(length));
        System.out.println("Volume of cube2 is " + 	cube2.calculateVolume(length));
        
        System.out.println("Enter Legth of cube3: ");
        length = sc.nextInt();
        Cube cube3 = new Cube();
        System.out.println("Side length of cube3 is " + cube3.getLength(length));
        System.out.println("Surface Area of cube3 is " + cube3.calculateSurfaceArea(length));
        System.out.println("Volume of cube3 is " + 	cube3.calculateVolume(length));
        // Don't forget to close your Scanner object  
        sc.close();
   } // main()
} // Cube