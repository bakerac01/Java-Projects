package edu.buffalostate.cis425.sp19.exercises.baker;

/** File: TaxWhiz.java
 *
 * Description: This class stores a tax rate and
 * computes the tax for a given purchase price.
 *
 * Assignment: 
 *  1) Add a method changeTax() that changes the current tax
 *     rate by the amount in the parameter
 *  2) Add a main method
 *  3) In the main, create two instances of TaxWhiz with a tax
 *     rates of 8.75 and 4.75 percent
 *  4) Compute the tax on two different purchases (one at the * 8.75 and one at the 4.75 rates
 *  5) Print the total of two purchases, the total tax and the
 *     total amount (purchases+tax)
 *     (try to make it look like a store receipt as best as you can,
 *     this actually could take trial/error)
 *  6) Repeat steps 4) and 5) but first increment the tax rate by 1.0 percentage point
 */ 
/**
 *
 * @author Alan Baker
 *
 */
public class TaxWhiz {
	 private double taxRate;
	  /**
	   * TaxWhiz() constructor creates an object with
	   * a given tax rate
	   * @param t -- the given tax rate
	   */ 
	  public TaxWhiz(double t) {
	    taxRate = t;
	  }
	  /**
	   * calcTax() returns the tax for a given purchase
	   * @param purchase -- the given purchase price
	   */ 
	  public double calcTax(double purchase) {
	    return taxRate * purchase;
	  }
	  /**
	   * changeTax() changes the current tax
	   * @param t -- the change added to the current tax rate
	   */ 
	  public  void changeTax(double t) {
	       taxRate = t;
	  }
	  public static void main(String[] args) {
		TaxWhiz a = new TaxWhiz(.0875);
		TaxWhiz b = new TaxWhiz(.0475);
		double p1 = 7.99; // purchase one
		double p2 = 15.99; // purchase 2
		double taxTotal = 0; // variable used to hold total tax amount
		double taxTemp = 0; 
		double total = 0;
		
		a.changeTax(.0875);
		taxTemp = a.calcTax(p1);
		taxTotal = taxTemp;
		b.changeTax(.0475);
		taxTemp = b.calcTax(p2);
		taxTotal += taxTemp;
		total = p1 + p2 + taxTotal;
		
				  
			
			System.out.print(" ");
			System.out.print("RECEIPT:\n=====================\nItem 1: "+p1+"\nItem 2: "+p2+"\nTotal Tax: "+ taxTotal + "\nTotal Amount Due: " + total);
			
			
		//NEW SYSTEM PRINT WITH INCREASED TAX
			
			a.changeTax(.0875+.01);
			taxTemp = a.calcTax(p1);
			taxTotal = taxTemp;
			b.changeTax(.0475+.01);
			taxTemp = b.calcTax(p2);
			taxTotal += taxTemp;
			total = p1 + p2 + taxTotal;
			
			System.out.print(" ");
			System.out.print("\n\n\nRECEIPT 2:\n=====================\nItem 1: "+p1+"\nItem 2: "+p2+"\nTotal Tax: "+ taxTotal + "\nTotal Amount Due: " + total);
	  }

	} // end TaxWhiz class

