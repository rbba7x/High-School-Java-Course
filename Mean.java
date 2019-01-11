//Ryan Beebe p2
// 6.4 #3

import java.util.Scanner;

public class Mean{

	public static void main(String [] args){
	
	Scanner brynno = new Scanner(System.in);
	int p1, p2, p3;
	double average;
	
	System.out.print("What is the first parameter?");
		p1 = brynno.nextInt();
	System.out.print("What is the second parameter?");
		p2 = brynno.nextInt();
	System.out.print("What is the third parameter?");
		p3 = brynno.nextInt();	
		
	average = average(p1,p2,p3);
	
	System.out.print("The average is " + average);
	
	}
	
	
	
	public static double average (int num1, int num2, int num3){
		double mean;
		mean = (num1 + num2 + num3)/3.0;
		
		return mean;
	}
}