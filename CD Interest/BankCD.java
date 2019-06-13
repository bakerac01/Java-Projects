package edu.buffalostate.cis425.sp19.exercises.baker;
/**
 * File: BankCD.java
 *
 * Description: This class calculates the maturity value of
 * a CD given its principal, interest rate and time period
 * in years. It contains a single method to perform this task.
 */
/**
 *  
 * @author Alan Baker  
 *  
 */

  public class BankCD { 
    private double principal;  // Purchase price of the CD.
    private double rate;  // Yearly interest rate.
    private double years; // The period until maturity of CD.

    /**  
     * BankCD constructor assigns values to instance variables.
     * @param p -- a double representing the initial principal
     * @param r -- a double representing the interest rate 
     * @param y -- a double representing the number of years.
     */
    public BankCD(double p, double r, double y) {
      principal = p;
      rate = r;
      years = y;
    } // End BankCD

    /**
     * calcYearly() calculates the maturity value of a CD given
     *   its principal, yearly interest rate, and maturity period.
     *   It uses the formula a = p * (1 + r)^y
     * @param p -- a double representing the initial principal
     * @param r -- a double representing the interest rate 
     * @param y -- a double representing the number of years
     * @return -- a doublein currency format is returned
     */
    public double calcYearly() {
      return (principal * Math.pow(1 + rate, years));
    } // eND calcYearly()

    /**
     * calcDaily() calculates the maturity value of a CD given
     * its principal, yearly interest rate, and maturity period
     * assuming daily compound interest.
     * It uses the formula a = p * (1 + r/365)^(365*y)
     * @param p -- a double representing the initial principal
     * @param r -- a double representing the interest rate 
     * @param y -- a double representing the number of years
     * @return -- a doublein currency format is returned
     */
    public double calcDailyly() {
      return (principal * Math.pow(1 + rate/365, years*365));
    } // End calcDaily()
} // End BankCD class