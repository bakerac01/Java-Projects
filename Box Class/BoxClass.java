package edu.buffalostate.cis425.sp19.exercises.baker;


/** Box Class Assignment 1
 * 
 * @author Alan Baker
 *
 */
public class BoxClass {
	/** variables to hold box data */
	
	private double L1;
	private double W1;
	private double H1;
	private double Weight;
	
	/** constructor to initialize box class variables to 0 */
	public void box() {
		L1 = 0;
		W1 = 0;
		H1 = 0;
		Weight = 0;
	}
	
	/** constructor to initialize box class vriables to something */
	public BoxClass(double a, double b, double c, double d){
		L1 = a;
		W1 = b;
		H1 = c;
		Weight = d;
	}
	
	/** class method that returns the volume */
	public double calculateVolume (){
		return L1 * W1 * H1;
	}
	
	/** class method that returns the density */
	public double calculateDensity(){
		
		return Weight / calculateVolume();
	}
	
	
	 public static void main(String[] args) {
		 BoxClass a = new BoxClass(10,5,5,2600);	/** initializing the numbers to the box class */
		
		 		
		 
		 /** print statements to output data */
		 System.out.print(" ");
		 System.out.print("The Volume of the box is: " + a.calculateVolume() + "\n The Density of the box is: " + a.calculateDensity() );
	 }
}
