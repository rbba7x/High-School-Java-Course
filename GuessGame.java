//Ryan Beebe P2 Ch 7.1 Guess Game

import java.util.*;

public class GuessGame{

	public static void main(String[] args){
		
		Scanner brynno = new Scanner(System.in);
		Random generator = new Random();
		//Variables 
		int compnum, yournum, x=0, guess=1;
		
		compnum = generator.nextInt(100)+1;
		
		System.out.print("I am thinking of a number between 1 and 100. Can you guess my number? Hint: No you can't:	");
		yournum = brynno.nextInt();
		while(x==0){
		if (yournum < compnum || yournum > compnum){
			if (yournum<compnum){
				System.out.println("You have guessed wrong. Your number was less than my number ");
				
				System.out.print("Guess again!");
				yournum = brynno.nextInt();
			}	
				
			else{ 
				System.out.print("Wrong!! Your number was larger than my number ");
				System.out.print("Guess again!");
				yournum = brynno.nextInt();
			}
		}	
		else {
			System.out.println("Darn you! You have guessed my number! Lucky guess ");
			break;
		}
			guess++;
		}
		System.out.print("It took you " + guess + " guesses");
	}
}
	
	