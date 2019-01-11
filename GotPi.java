//Ryan Beebe 4.5

import java.util.*;

public class GotPi{

	public static void main(String [] args){
	
	Scanner brynno = new Scanner(System.in);
	
	//Variables
	double ans= 0.0, denom = 1.0, num = 1.0, control;
	
	//Get input 
	System.out.print("How many time would you like to go through the loop? ");
	 control = brynno.nextInt();
	
	//Calculations

	for (int i=1; i<=control; i++){ 
	 ans = ans + num/denom ;
	
	 denom+=2;
	 num*=(1-2);
	}
	

	//Output 
	System.out.print("The answer is " + ans*4);
	}
	}