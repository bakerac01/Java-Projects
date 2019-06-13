/**
 * File: Average.java
 *
 * Write a program that accepts 10 integers from the keyboard and
 * computes their average.
 * if the user enters 9999, the program exits early, and outputs
 * the average of the numbers entered so far.
 *
 * Fill in the blanks to make the program work 
 *
 */
/**
 *
 * @author Alan Baker 
 *
 */

import java.util.Scanner;
public class excercise1 {
	 public static void main( String args[] ) {
		    double ave=0.0, num=0.0, sum=0.0;
		    int cnt=0;
		    Scanner sc = new Scanner(System.in);
		    System.out.println( "Integer Averaging Program" ); 
		    System.out.println( "Enter 10 Integers" );
		    System.out.println( "Enter 9999 to exit" );
		    for (int i=0; i == 10 ;i++ ) {
		      System.out.print("Enter Integer " + i + ": ");
		      // check if the user entered a non-integer
		      if (!sc.hasNextInt()) {
		        // System.err will print the message in RED
		        System.err.println("Sorry, please enter an integer");
		        sc.nextLine();
		        i--;
		        continue;
		      }
		      num = sc.nextInt();
		      if (num == 9999) {
		        break;
		      }
		      cnt++; 
		      sum = sum + num;
		   }
		   if (cnt > 0)  {
		     ave = sum;
		   } else {
			  ave = 0  ;
			   }
		   System.out.println("The average of " + cnt + " numbers is " + ave );
		 }
		}

