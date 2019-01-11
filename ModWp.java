//Ryan Beebe p2
// 3.5 mod weekly pay

import java.util.Scanner;

public class ModWp{

	public static void main(String [] args){
	
	Scanner brynno = new Scanner(System.in);
	
	//Variables
	double rh, op, wp, hw, oh1, oh2, oh3, oh4, oh5, oh; //regular hours, overtime pay, weekly pay, hourly wage, overtime hours for each day
	
	//Get Input
	
	System.out.print("You may now enter your hourly wage here when ready ->" );
	hw = brynno.nextInt();
	System.out.print("You may now enter your total regular hours here when ready ->" );
	rh = brynno.nextInt();
	System.out.print("How many overtime hours did you work on day one?" );
	oh1 = brynno.nextInt();
	System.out.print("How many overtime hours did you work on day two?" );
	oh2 = brynno.nextInt();
	System.out.print("How many overtime hours did you work on day three?" );
	oh3 = brynno.nextInt();
	System.out.print("How many overtime hours did you work on day four?" );
	oh4 = brynno.nextInt();
	System.out.print("How many overtime hours did you work on day five?" );
	oh5 = brynno.nextInt();
	
	//Calculations
	oh = oh1+oh2+oh3+oh4+oh5;
	wp = (hw*rh)+oh*(1.5*hw);
	
	//Output
	System.out.print("Your weekly pay is: ");
	System.out.println(wp);

	}
}
	