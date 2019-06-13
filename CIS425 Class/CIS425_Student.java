package edu.buffalostate.cis425.sp19.exercises.baker;
/*
@author Alan Baker
 * don't forget comments
 */


public class CIS425_Student extends Student {
	
	int [] exams = new int[3];
	
	 					//Exam Array used to store grades
	
	
	public CIS425_Student( String id, String name, int num_exams ) {
		
		super(id, name);  			//calls in constructors from the super class
		num_exams = 3; 				// sets default exams to 3
	}
    	
    	
    	
	public boolean addGrade( int exam, int grade ) {
		
	try { exams[exam] = grade;
	return true;
	}
		catch(IndexOutOfBoundsException ee){
			return false;
		}
	}
    
	public int getGrade( int exam ) { 
		
		if (exam > exams.length+1){				//if exam is out of range
			return -1;				// return -1
		} else {					
		return exams[exam];			//if in bounds, return grade at the specific array location
	}
}
	
	
	

				
	}
