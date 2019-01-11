//Ryan Beebe p2 
//Teenagers
import java.util.*;
public class Teens{

	public static void main(String[]args){
	
	Scanner brynno = new Scanner(System.in);
	
	String [] name = new String [10];
	int [] age = new int [10];
	//Input
	for(int i=0;i<name.length; i++){
		System.out.println("Enter a name");
			name[i] = brynno.nextLine();
				System.out.println("Enter " + name[i] + "'s age");
					age[i] = brynno.nextInt(); 
						brynno.nextLine(); 
						
	}
	// name array
		for (int j=0; j<name.length; j++){
			System.out.print(name[j] + "  "); 
		}
			System.out.println(" ");
			// age array
				for (int j=0; j<name.length; j++){
					System.out.print(age[j] + "  "); 
				}
				
					System.out.println(" ");
	// counting 17 year olds
		int counta = 0;
		for (int k = 0; k<name.length; k++){
			if (age[k] == 17)
				counta++;
			}
		System.out.println("The number of teens with the age of 17 is " + counta);
	// counting how many named Chris
			int countb = 0;
			for (int k = 0; k<name.length; k++){
				if (name[k].equalsIgnoreCase("Chris"))
				countb++;
			}
		System.out.print("The number of teens with the name of Chris is " + countb);
	}
}
	
	