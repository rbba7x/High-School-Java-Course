//Ryan Beebe p2
// 3.4 weekly pay

import java.util.Scanner;

public class WeeklyPay{

	public static void main(String [] args){
	
	Scanner brynno = new Scanner(System.in);
	
	//Variables
	double rh, op, wp, hw, oh; //regular hours, overtime pay, weekly pay, hourly wage, overtime hours
	
	//Get Input
	
	System.out.print("You may now enter your hourly wage here when ready ->" );
	hw = brynno.nextInt();
	System.out.print("You may now enter your total regular hours here when ready ->" );
	rh = brynno.nextInt();
	System.out.print("You may now enter your total overtime hours here when ready ->" );
	oh = brynno.nextInt();
	
	//Calculations
	wp = (hw*rh)+oh*(1.5*hw);
	
	//Output
	System.out.print("Your weekly pay is: ");
	System.out.println(wp);

	}
}
	