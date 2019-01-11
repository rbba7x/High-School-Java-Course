//Ryan Beebe 4.7 P2

import java.util.*;

public class ModBinary{

	public static void main(String [] args){
	
	Scanner brynno = new Scanner(System.in);

	//Variables
	double exponent, ans, base;
	
	//Get input
		System.out.print("What is your exponent value? ");
		exponent = brynno.nextInt();
		System.out.print("What is your base value? ");
		base = brynno.nextInt();
	 //Calculations
		while (true)
			if (exponent>0){
				ans=Math.pow(base,exponent);
				System.out.println("The answer is " + ans);
				System.out.print("If you would like to continue, enter your new exponent. If you would like to exit, enter -1 ");
				exponent = brynno.nextInt();
			}
		else
			break; 
		}
	  }