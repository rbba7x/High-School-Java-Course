// Ryan Beebe p2 
// Dimensions of a sphere (DOAS) 

import java.util.Scanner;

public class DOAS{

	public static void main(String [] args){
	
	Scanner brynno = new Scanner(System.in);
	
	//Variables
	double r, d, c, sa, v, pi = 3.14; //radius, diameter, circumference, surface area, volume, pi
	
	//Get Input
	System.out.print("You may now enter the radius of the sphere here when ready ->" );
	r = brynno.nextInt(); 
	
	//Calculations
	d = r*2;
	c = 2*pi*r;
	sa = 4*pi*(r*r);
	v = (4.0/3)*pi*(r*r*r);

	//Output
	System.out.print("The diameter of the sphere is: ");
	System.out.println(d);
	System.out.print("The circumference of the sphere is: ");
	System.out.println(c);
	System.out.print("The surface area of the sphere is: ");
	System.out.println(sa);
	System.out.print("The volume of the sphere is: ");
	System.out.println(v);
				
			
	}
}		
	
	
	
	