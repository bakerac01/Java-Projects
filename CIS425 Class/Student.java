package edu.buffalostate.cis425.sp19.exercises.baker;
/* 
 * don't forget comments 
 */
public class Student {
	 private String id, name;

	  // Constructor, set name of student
	  public Student( String id, String name ) {
	    this.setName(name);
	    this.setID(id);
	  }
	  /**
	   * set name of student
	   * @param name string -- student name
	   */
	  public void setName(String name){
	    this.name = name;
	  }
	  // return name of student
	  public String getName() {
	    return this.name;
	  }
	  // Add accessors to set the student ID and to get (return) the student ID
	  public String getID(){
		  return this.id;
	  }
	  
	  public void setID(String ID){
		  this.id = ID;
	  }
}
