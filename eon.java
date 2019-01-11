//Ryan Beebe p2 
//Sort 10.1

import java.util.*;
public class eon{

	public static void main(String[]args){
	//scanner 
	Scanner brynno = new Scanner(System.in);
	//variables and arrays
	int [] evenList = new int [10];
	int [] oddList = new int [10];
	int [] negativeList = new int [10];
	int resp, oddCount = 0, evenCount = 0, negCount = 0; 
	//get input
	for(int i=0;i<10; i++){ 
		System.out.println("Enter an integer");
			resp = brynno.nextInt(); 
			//sorting the input
				if (resp<0){
					negativeList[negCount]=resp;
					negCount ++;
				}
				else if (resp%2==0){ 
					evenList[evenCount]=resp;
					evenCount ++;
				}
				else if (resp%2==1){
					oddList[oddCount]=resp;
					oddCount++;
				}
	}
	//Printing out the array
	System.out.print("The negative numbers are ");
	for(int m=0; m<negCount; m++){
		System.out.print(negativeList[m] + " ");
	 }
			System.out.println("");
				System.out.print("The even numbers are ");
					for(int n=0;n<evenCount; n++){
						System.out.print(negativeList[n] + " ");
					}
						System.out.println("");
							System.out.print("The odd numbers are ");
								for(int o=0;o<oddCount; o++){
									System.out.print(oddList[o] + " ");
								}
	}
}
	