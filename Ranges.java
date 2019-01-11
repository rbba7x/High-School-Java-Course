//Ryan Beebe, Brynne Shumway p2
// 6.4 #2

import java.util.Scanner;

public class Ranges{

	public static void main(String [] args){
	
	Scanner brynno = new Scanner(System.in);
	int sum, range, parameter1, parameter2;
	
	System.out.print("What is the first parameter?");
		parameter1 = brynno.nextInt();
	System.out.print("What is the second parameter?");
		parameter2 = brynno.nextInt();
	
	sum = sumRange(parameter1, parameter2);
	if (sum == 0)
		System.out.print("ERROR. YOUR PARAMETERS ARE INVALID");
	else
		System.out.print("The sum of the range is " + sum);
	
	}
	public static int sumRange (int min, int max){
	int total=0;
	
	if(min>max)
		return 0;
	else{
		for (int i=min; i<=max; i++){
			total = total + i; 
			}
	return total;
		}
	}
}
		
		
	