// Ryan Beebe p2 4.1 Division

import java.util.*;

public class Division{

	public static void main(String [] args){
	
	Scanner brynno = new Scanner(System.in);
	
	//Variables
	double x, y, quo1, quo2, r1, r2; //quotient and remainder 
	
	//get input
	System.out.println("What is your first number?");
	x = brynno.nextInt();
	System.out.println("What is your second number?");
	y = brynno.nextInt();
	
	//calculations and output
	if (x>y){
		quo1 = x/y; 
		System.out.print("The quotient is" + quo1);
		r1 = x%y;
		System.out.print("The remainder is" + r1);
	}
	else{
		quo2 = y/x;
		System.out.print("The quotient is" + quo2);
		r2 = y%x;
		System.out.print("The remainder is" + r2);
		}
	}
}
	