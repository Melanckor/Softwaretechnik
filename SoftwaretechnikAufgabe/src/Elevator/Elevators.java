package Elevator;

import java.util.Scanner;

public class Elevators {

	public static int current_Floor=5;
	int dest_Floor;
	private ElevatorStates State ;
	Scanner in ;
	// private ElevatorStates State = new ElevatorStates();
	
	public Elevators (int current_floor,int dest_floor)
	{  if(!(current_floor == dest_floor))  {
		current_Floor =current_floor; 
		this.dest_Floor=dest_floor;
	System.out.println("*** Destination floor is: "+ dest_Floor);
	arrive_atFloor();
    in = new Scanner(System.in); 
    
      new Elevators(current_Floor,in.nextInt());}
      
      //in.close();
      System.out.println("Program is done! ");
    }
   

	
	void go_up() {
		current_Floor++;
	//	System.out.print("Current Floor: " + current_Floor+ " ");
	}
	void go_down() {
		current_Floor--;
	//	System.out.print("Current Floor: " + current_Floor+ " ");
	}

	private void arrive_atFloor() {

		
		
		
		
		if(dest_Floor < current_Floor) {
			State = ElevatorStates.Moving_Down;
			System.out.print("Current Floor: " + current_Floor+ " ");
			System.out.println("Current State: Moving down to the " + (current_Floor-1) + " floor");
	        go_down();arrive_atFloor();
			
		}else if(dest_Floor >  current_Floor)  {
			State = ElevatorStates.Moving_Up;
			System.out.print("Current Floor: " + current_Floor+ " ");
			System.out.println("Current State: Moving Up to the " + (current_Floor+1) + " floor");
			go_up();arrive_atFloor();
		
	}else {   
	System.out.println(" arrived at destination floor.Please exit or enter new destination."
			+ "Current State :Idle")  ;
	State= ElevatorStates.Idle;
	
	
	
	
	}

}
}