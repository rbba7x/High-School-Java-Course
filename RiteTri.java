// Ryan Beebe p2 4.2 Triangle

import java.util.*;

public class RiteTri{

	public static void main(String [] args){
	
	Scanner brynno = new Scanner(System.in);
	
	//Variables
	int side1, side2, hyponoose= 0;
	
	//Input
		System.out.print("What is the first side of the triangle, but not the hypotenuse? ");
		side1 = brynno.nextInt(); 
		System.out.print("What is the second side of the triangle, but still not the hypotenuse? "); 
		side2 = brynno.nextInt();
		System.out.print("What is the hypotenuse? ");
		hyponoose = brynno.nextInt();
	// calculation and output
			if (hyponoose <= 0 || side1 <= 0 || side2 <= 0)
				System.out.print("You are a bozo. Yes you, Jeff ");
			
			else if( hyponoose*hyponoose == side1*side1+side2*side2){
				System.out.print("This is a right triangle ");
				
			}

			else 
				System.out.print("This is not a right triangle ");
			
			
				}
	
		}

	
	
	
	
	
	
	