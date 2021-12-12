package Elevator;

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in); 
			
			System.out.println("Current Floor is 5"); 

	       
			System.out.println("Enter destination Floor: (0 to 10):"); 

			 int dest_floor = in.nextInt(); 
			 while(dest_floor < 0 || dest_floor >10 ) {
				 System.out.println("invalid entry.Try Again :)");
				 dest_floor= in.nextInt();
			 } 
			 
			
			 System.out.println("--------------------------------------------");

			
			 Elevators elv=new  Elevators(5,dest_floor);
	}

}
