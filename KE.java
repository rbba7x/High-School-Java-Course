// Ryan Beebe p2 
// Kinetic Energy

import java.util.Scanner;

public class KE{

	public static void main(String [] args){
	
	Scanner brynno = new Scanner(System.in);
	
	//Variables
	double m, v, ke, mo; //mass, velocity, kinetic energy, momentum
	
	//Get Input
	System.out.print("You may now enter the object's mass here when ready ->" );
	m = brynno.nextInt(); 
	System.out.print("You may now enter the object's velocity here when ready ->" );
	v = brynno.nextInt(); 
	//Calculations
	ke = (1/2)*m*(v*v);
	mo = m*v;
	
	//Output
	System.out.print("The object's kinetic energy is: ");
	System.out.println(ke);
	System.out.print("The object's momentum is: ");
	System.out.println(mo);
					
			
	}
}		
	
	