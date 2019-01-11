//Ryan Beebe Re-Quest Main Pogram 

import java.util.*;

public class ReQuest{

	public static void main(String [] args){
	
		Scanner brynno = new Scanner(System.in);
		
		int s;
		double l, a;
		
		System.out.print("How many sides does this polygon have?");
		s = brynno.nextInt();
		System.out.print("What is the length of the sides?");
		l = brynno.nextDouble();
		System.out.print("What is the apothem?");
		a = brynno.nextDouble();
		
		RegularPolygon out= new RegularPolygon(s, l, a);
		
		System.out.print(out);
		}
	}