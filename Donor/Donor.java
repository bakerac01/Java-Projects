package edu.buffalostate.cis425.sp19.exercises.baker;



/**
 * File: Donor.java
 *
 * Description: This class represents a donor to an
 * organization. It stores the donor's name and rating.
 * The main() method tests the class's methods.
 *
 * Assignment:
 *   1) Add a new level "low" to this class (in addition to * "high", "medium", "none") 		done!
 *   2) Add a new method:
 *      public void updateRating(double amt){ } which recalculates
 *      a donor's rating according to the following schedule:
 *        a) amt = 0 - none
 *        b) amt < $100 - low level
 *        c) amt >= $100 and amt < $1000 - medium level
 *        d) amt >= $1000 - high level
 *      updateRating() should change the instance variable:
 *      rating to the new value																	done!
 *      
 *   3) Modify this template to include an address variable and
 *      change the constructor to accept this new variable
 *      (along with the parameters). Basically, the object
 *      stores the donor's name, address and rating												Done!
 *      
 *   4) Modify main() to print out donor address also
 *   5) Create a new donor (donor4) with an initial "low" rating,
 *      a) then let donor4 contribute $150,
 *      b) print this donor's new rating to the console
 *   6 Modify the rest of the program (as needed) so that it 
 *      compiles and runs correctly
 *
 */
/**
 *
 * @author Alan Baker
 *
 */

public class Donor {
	private String name = "no name";
	  private String rating = "none";
	  private String address = "none";
	  /**
	   * Donor() constructor sets the object's name and rating
	   * @param str -- a String giving the donor's name
	   * @param str2 -- a String giving the donor's rating
	   */
	  public Donor(String str, String str2, String str3) {
	    name = str;
	    rating = str2;
	    address = str3;
	    // Hint: add address string here
	  }

	  /**
	   * getName() returns the donor's name
	   * @return a String giving the person's name
	   */
	  public String getName() {
	    return name;
	  }

	  public String getAddress() {
		  return address;
	  }
	  // Hint: add accessor method to get the address
	  public void updateRating(double amt){ 
		if (amt >= 1000) {
			rating = "high";		
		} else if (amt >= 100 && amt < 1000) {
			rating = "medium";
		} else if (amt <100) {
			rating = "low";
		} else {
			rating = "none";
		}
	  }
	  /**
	   * getRating() returns the donor's rating
	   * @return a String giving the person's rating
	   */
	  public String getRating() {
	    // This if could be a switch/case conditional
	    // add check for low level
	    if (rating.equals("high")) {
	      return "high";
	    } else if (rating.equals("medium")) {
	      return "medium";
	    } else if (rating.equals("low")) {
	      return "low";
	    }  else {
	      return "none";
	    }
	  }

	  /**
	   * main() creates three Donor instances and tests this classes methods.
	   */
	  public static void main (String argv[]) {
	    // Hint: add address string to the three (3) constructors
	    Donor donor1 = new Donor("Alan", "high", "1586 Deleware Ave");
	    
	    
	    // Hint: add address string to the output
	    System.out.println("Donor's name is " + donor1.getName());
	    System.out.println(donor1.getName() + "'s rating is " + donor1.getRating());
	    System.out.println(donor1.getName() + "'s Address is " + donor1.getAddress());
	    
	    Donor donor2 = new Donor("Maria", "medium", "1234 Main Street");
	    System.out.println("Donor's name is " + donor2.getName());
	    System.out.println(donor2.getName() + "'s rating is " + donor2.getRating());
	    System.out.println(donor2.getName() + "'s Address is " + donor2.getAddress());

	    Donor donor3 = new Donor("Elliot", "none", "420 High Street");
	    System.out.println("Donor's name is " + donor3.getName());
	    System.out.println(donor3.getName() + "'s rating is " + donor3.getRating());
	    System.out.println(donor3.getName() + "'s Address is " + donor3.getAddress());
	    
	    Donor donor4 = new Donor("James", "low", "7277 Orchard Drive");
	    System.out.println("Donor's name is " + donor4.getName());
	    System.out.println(donor4.getName() + "'s rating is " + donor4.getRating());
	    System.out.println(donor4.getName() + "'s Address is " + donor4.getAddress());

	    donor4.updateRating(150);
	    System.out.println(donor4.getName() + "'s NEW UPDATED rating is " + donor4.getRating());
	    
	    // add code to construct donor4 and print donor4 info
	    // add code to increase donor4's amount (updateRating())
	 // and print out new donor4 rating
	  } // end main()
	} // end Donor class

