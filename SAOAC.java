// Project 3.1 Surface Area of a Cube
// Ryan Beebe P2

import java.util.Scanner;

public class SAOAC{

	public static void main(String [] args){

			Scanner brynno = new Scanner(System.in);
			
			//Variables
			int loe, sa = 0; 
			// loe  is length of edge, sa is surface area
			
			// Get input
			System.out.print("You may now enter your edge length as an integer here when ready ->" ); 
			loe = brynno.nextInt();
			
			//Calculations
			sa = loe*loe*6;
			
			//output
			System.out.print("The surface area of the cube is: ");
			System.out.print(sa);
			
			
		}
}		