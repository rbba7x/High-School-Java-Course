// Project 2.4 Min to years
// Ryan Beebe P2

import java.util.Scanner;
	public class Mintoyr{

	
	public static void main(String [] args){
	
	Scanner corndog = new Scanner(System.in);
 
	int minutes, year = 0; 

	System.out.print("How many minutes would you like to convert into years as an integer?" );
	minutes = corndog.nextInt(); 

	year = 525960/minutes;
	System.out.print(" The amount of years is: ");
	System.out.print(year) ;
	}
}

