//Ryan Beebe P2 4.8

import java.util.*;

public class Salary{

	public static void main(String [] args){
	
		Scanner brynno = new Scanner(System.in);
	
	//Variables 
		double startsal, percin, years, x, sum;
	
	//Get Input
		System.out.print("What is your starting salary? ");
		startsal = brynno.nextDouble();
		System.out.print("What is your percent increase? ");
		percin = brynno.nextDouble();
		System.out.print("How many years? ");
		years = brynno.nextDouble();
	
		System.out.println("Year one salary is $" + startsal);
	
	//Calculations
			double limit = years, count = 2;
			while (count<=limit){
	//startsal += startsal * percin
				x = startsal * percin;
				sum = x + startsal;
				startsal = sum;
				System.out.println("The amount earned after " + count + " is " + startsal);
	
			count++;
			}
		}
	}
	
	