//Ryan Beebe p2  10.4 Median Program

import java.util.*;
public class Median{

	public static void main(String [] args){
		//scanner
			Scanner brynno = new Scanner(System.in);
				//Variables and arrays
					int [] list = new int [10];
					int [] test = new int [10];
					int [] end = new int [10];
					int resp = 0;
						//Get input
						for (int i=0; i<list.length; i++){
							System.out.print("Enter a number");
								resp = brynno.nextInt();
									list[i] = resp;
										test[i] = list[i-1]; 
											if (test[i]<0){
												test[i+1];
											}
											else if (test [i] != list [i])
												
										
										