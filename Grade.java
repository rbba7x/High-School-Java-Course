//Ryan Beebe P2 

import java.util.*;
	public class Grade{
	
	public static void main(String [] args){
		Scanner brynno = new Scanner(System.in);
		
		int grade; 
		
		System.out.print("What is your grade as an integer?");
		grade = brynno.nextInt();
		
		if (grade>= 96 && grade <=100)
				System.out.println("Your grade is an A+ ");
			else if (grade >=92 && grade<=95)
				System.out.println("Your grade is an A ");
			else if (grade >=90 && grade<=91)
				System.out.println("Your grade is an A- ");
			else if (grade >=86 && grade<=89)
				System.out.println("Your grade is an B+ ");	
			else if (grade >=82 && grade<=85)
				System.out.println("Your grade is an B ");
			else if (grade >=80 && grade<=81)
				System.out.println("Your grade is an B- ");
			else if (grade >=76 && grade<=79)
				System.out.println("Your grade is an C+ ");	
			else if (grade >=72 && grade<=75)
				System.out.println("Your grade is an C ");
			else if (grade >=70 && grade<=71)
				System.out.println("Your grade is an C- ");
			else if (grade >=66 && grade<=69)
				System.out.println("Your grade is an D+ ");
			else if (grade >=62 && grade<=65)
				System.out.println("Your grade is an D ");
			else if (grade >=60 && grade<=61)
				System.out.println("Your grade is an D- ");
			else if (grade >=0 && grade<=59)
				System.out.println("Your grade is an F. You failed ");
				}
				}