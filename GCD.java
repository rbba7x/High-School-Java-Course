// Ryan Beebe 7.5

import java.util.Scanner;
	public class GCD{
	
		public static void main(String [] args){
		Scanner  brynno = new Scanner (System.in);
		
		int n1, n2, newnum, rem, temp;  
		
		System.out.print("Enter the first number "); 
		n1 = brynno.nextInt(); 
		System.out.print("Enter your second number "); 
		n2 = brynno.nextInt();
		
		if (n2>n1){
			rem = n2%n1;
			//System.out.print("The remainder is " + rem );
			}
		else {
			temp = n1;
			n1 = n2;
			n2 = temp; 
			
			rem = n2%n1;
			//System.out.print("The remainder is " + rem );
			}
		
		// Going into the while loop, n2 is the larger number
		while (n1 != 0){
			System.out.println(n2 + "\t" + n1 + "\t" + rem );
			n2 = n1;
			n1 = rem; 
			if (n1 == 0)
				break;
			else
				rem = n2%n1;
			// n2 is smaller number
			
			
			}
			System.out.print("The GCD is " + n2);
			
		}
	}