//Ryan Beebe p2  10.4 Median Program

import java.util.*;
public class Median{

	public static void main(String [] args){
	
	double med = 0;
	
	int [] numbers = {0, 1, 2, 18, 27, 66, 75, 103, 1123};
	
	if (numbers.length % 2 ==0){
		med = (numbers[numbers.length/2] + numbers[(numbers.length/2) +1 ])/2.0;
	}
		else{
			med = numbers[numbers.length/2];
		}
	System.out.print(med);
	}
}
	