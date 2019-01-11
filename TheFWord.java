//Ryan Beebe p2 6-3

import java.util.*;

public class TheFWord{

	public static void main(String [] args){
	
	Scanner brynno = new Scanner(System.in);
	//variables
	int num1, num2, den1, den2;
	
	//input
	System.out.println("What is the numerator of the first fraction?") ;
	num1 = brynno.nextInt(); 
	System.out.println("What is the denominator of the first fraction? ");
	den1 = brynno.nextInt();
	System.out.println("What is the numerator of the second fraction?");
	num2 = brynno.nextInt();
	System.out.println("What is the denominator of the second fraction?");
	den2=brynno.nextInt();
	//Call to class
	 FractionClass ans = new FractionClass(num1, num2, den1, den2);
	
	System.out.print(ans);
	}
}
	
	
	
	