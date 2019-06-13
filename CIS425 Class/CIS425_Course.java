package edu.buffalostate.cis425.sp19.exercises.baker;



/* 
 Main doesnt work.  Im completly stuck thought and dont know what else to try.
 */
public class CIS425_Course {
	int Capacity = 30;		//save capacity as a class variable
	private CIS425_Student[] roster;	// create and start an array of objects to the size capacity
	private int i = 0;		
	boolean enrolled; 				//set an enrolled class variable
	
	public CIS425_Course( int capacity ) { 
	
		capacity = Capacity;		// constructor that init the capacity to the class variable
		roster = new CIS425_Student[capacity];		
		
	}
		
	public boolean addStudent( String id, String name, int num_exams ) { 
		
		 			// variable used to move through array
				
		if ( i < Capacity){						//if statement to check to see if course is full
		CIS425_Student a = new CIS425_Student(id, name, num_exams);	// creates new student
		roster[i] = a;											// adds new student to the roster
		i += 1;						//adds one to the counter variable
		return true;				// can add more students
		} else {
		return false;				// course is full so return false.
		}
		
		
	}
	 
	public  CIS425_Student findStudent( String id ) {
		
		for (int i = 0; i < roster.length; i++)
		if (roster[i].getID() == id){
			return roster[i];
		} 
					
		return null;
		
		
	}

	
	public double computeAverage( int exam ) {
		double total = 0;
		
		for (int i=0; i <roster.length; i++){
			if(roster[i] == null){
				total = total/i;
				return total;
			}
		total +=roster[i].getGrade(exam);
		}	
		total = total/roster.length;
		return total;
}
	 
	public static void main( String[] args ) { 
		
		CIS425_Course course1 = new CIS425_Course(30);						//init the course
		course1.addStudent("B0000001", "Sally Smarty", 3);					// add the first student to the course
		course1.addStudent("B0000002", "Phil Phailure", 3);					//init the second student to the course
		
		course1.roster[0].addGrade(0, 100);
		course1.roster[1].addGrade(0, 60);
		
		System.out.println(course1.roster[0].getName() + " has a grade of: " + course1.roster[0].getGrade(0));	//output the names and grades of the 2 students.
		System.out.println(course1.roster[1].getName() + " has a grade of: " + course1.roster[1].getGrade(0));
		System.out.println("Class average on exam 1: " + course1.computeAverage(0));
		
		
	}
}
