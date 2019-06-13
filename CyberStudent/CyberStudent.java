package edu.buffalostate.cis425.sp19.exercises.baker;
/**
*
* <h1>File:  CyberStudent . java </h1> 
*
* <h2>Requirements</h2>
*   <ol>
*     <li>Create a CyberStudent class with the following
*     characteristics/properties:
*       <ol>
*         <li>CyberStudent has 2 basic states and each of these basic states
*         have several substates:
*           <ol>
*             <li>awake (0)
*               <ol>
*                 <li>Substates:
*                   <ol>
*                     <li>eating (0)</li>
*                     <li>working (1)</li>
*                   </ol>
*                 </li>
*               </ol>
*             </li>
*             <li>sleeping (1)
*               <ol>
*                 <li>Substates:
*                   <ol>
*                     <li>dreaming (0)</li>
*                     <li>snoring (1)</li>
*                   </ol>
*                 </li>
*               </ol>
*             </li>
*           </ol>
*         </li>
*       </ol>
*     </li>
*     <li>A constructor that accepts a String object which is the name of the
*     newly created CyberStudent, which is initially sleeping and dreaming
*     CyberStudent has 2 basic methods that change the state of the
*     CyberStudent to one of the 2 basic allowable states:
*       <ol>
*         <li><code>boolean Awake(int Substate</code>)</li>
*         <li><code>boolean Sleep(int Substate</code>)</li>
*       </ol>
*     </li>
*     <li>Check the substate parameter (<code>int Substate</code>) in the above
*     methods for consistency (within range) before changing the
*     state (and substate). Return true if state was successfully
*     changed, false otherwise. If there is a problem, return false
*     without changing anything.</li>
*     <li>In addition, create mutator methods for each of the substates:
*       <ol>
*         <li><code>boolean Eat()</code></li>
*         <li><code>Work()</code></li>
*         <li><code>Dream()</code></li>
*         <li><code>Snore()</code></li>
*       </ol>
*     </li>
*     <li>Each of these substate mutator methods should check for consistency,
*     for example, a Cyberstudent in the awake state cannot be placed in
*     the substate snoring. Return true if substate was changed, false
*     otherwise.</li>
*     <li>CyberStudent has 2 accessor (getter) methods:
*       <ol>
*         <li><code>getState()</code>: returns a String object giving the current state
*         (and substate) of the CyberStudent</li>
*         <li><code>getName()</code>: returns a String object giving the name of the
*         CyberStudent object.</li>
*       </ol>
*     </li>
*     <li>Display the current substate for the student then change the
*     substate to each available substate and display the substate after
*     each change.</li>
*   </ol>
*
*   <p><strong>Note:</strong> DO NOT USE Strings to store the "state" of
*   the CyberStudent.</p>
*
* @author Alan Baker
* @version 1.0 
* @since Put the date here (1990-04*4)
*
*/ 
public class CyberStudent {
	int State, substate ; 
	  String Name;
	  /**
	   * Create a student object 
	   * @ param  name -- represent the student's name  
	  */
	  public  CyberStudent (String name) { 
	    //Hint: add object constructor here
		  State = 0;
		  substate = 0;
		  Name = name;
	  } //end  CyberStudent () 
	  /** 
	   * Get the student's name 
	   * @return name -- a string representing the student's name 
	   */
	  public String  getName () { 
	    //Hint: add appropriate return statement here
		  return this.Name;
	  } //end  getName  
	  /**
	   * Get the student's state
	   * @return state -- a string representing the student's state
	   */ 
	  public String  getState () { 
	    //Hint: add code to check valid state and substate and return 
		  String temp = " ";
		  
		  if (State == 0){
			 if (substate == 0){
				 temp = " is Awake and Eating";
				 return temp;
			 } if(substate == 1){ 
				 temp = " is Awake and Working";
				 return temp;
			 } else {
				 if (substate == 0) {
					 temp = " is Asleep and Dreaming";
					 return temp;
				 } else {
					 temp = " is Asleep and Snoring";
					 return temp;
				 }
			 }
		  }
	    //  string with current state and substate
	    //  or return string with unknown state and substate  
		temp = " Unknown State and Substate";
		return temp;
	  } //end  getState () 
	  /** 
	   * Changes  CyberStudent's  state to SLEEP (1) and substate  
	   *  
	   * @ param  -- an integer -- 0 for Dreaming, 1 for Snoring   
	   */
	  public Boolean Sleep(int substate1 ) { 
	    //Hint: add code to check valid substate and set object state and substate
		  if (substate != 0 || substate !=1){
			  return false;
		  } else {
		  if(State == 0){
			  State = 1;
			  substate = substate1;
			  return true;
		  } else {
			  
			  return false;
		  }
		  }
		
	    //and return true or return false
	  }  
	  //Hint: add methods for Awake, Eating, Working, Snoring, and Dreaming
	  public Boolean Awake (int substate1) {
		  if (substate != 0 || substate !=1){
			  return false;
		  } else {
			  if (State == 1){
				  State = 0;
				  substate = substate1;
				  System.out.print("is this working?");
				  return true;
		  } else {
			  return false;
		  }
			  
	  }
  } 
	  public Boolean Snore (int substate){
		  if (substate !=0 || substate !=1){
			  return false;
		  } else {
			  if (State == 0){
			  State = 1;
			  substate = 1;
			  return true;
		  } else {
			  return false;
		  }
	  }
  }
	  public Boolean Dreaming(int substate){
		  if (substate !=0 || substate !=1){
			  return false;
		  } else {
			  if (State == 0){
				  State = 1;
				  substate = 0;
				  return true;
				  
			  } else {
				  return false;
			  }
		  }
	  }
	  
	  public Boolean Eating(int substate){
		  if (substate !=0 || substate !=1){
			  return false;
		  } else {
			  if (State == 1){
				  State = 0;
				  substate = 0;
				  return true;
			  } else {
				  return false;
			  }
		  }
	  }
	  
	  public Boolean Working(int substate){
		  if (substate !=0 || substate !=1){
			  return false;
		  } else {
			  if (State == 1){
				  State = 0;
				  substate =1;
				  return true;
			  } else {
				  return false;
			  }
		  }
	  }
	  public static void main( String  args [] ) { 
	    //Hint: Add constructor for student here 
		  CyberStudent HAL = new CyberStudent("HAL");
		  
	    //Hint: Display student's current name, state, and substate
		  System.out.println(HAL.getName() + HAL.getState() );
	    //Hint: add code to change substate to Eat and display new state and substate
		  HAL.Eating(1);
		  System.out.println(HAL.getName() + HAL.getState());
	    //  or display that this is an invalid substate 
	    //Hint: add code to change substate to Snore and display new state and substate 
		  HAL.Snore(1);
		  System.out.println(HAL.getName() + HAL.getState());
	    //  or display that this is an invalid substate   
	    //Hint: add code to change state to Awake( substate ) and display new state and substate  
		  HAL.Awake(1);
		  System.out.println(HAL.getName() + HAL.getState());
	    //Hint: add code to change substate to Dream and display new state and substate  
		  HAL.Dreaming(1);
		  System.out.println(HAL.getName() + HAL.getState());
	    //   or display that this is an invalid substate 
	    //Hint: add code to change substate to Eat and display new state and substate
		  HAL.Eating(0);
	    //   or display that this is an invalid substate
	    System.exit(0);
	  } //end main() 
	} //end  CyberStudent ()