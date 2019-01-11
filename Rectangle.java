// Ryan Beebe p2

import java.util.*;

public class Rectangle{
	public static void main (String [] args) {
		Scanner brynno = new Scanner(System.in);
		
		int h, w, p,a;
		
		for (h = 1; h <= 10; h++) {
			for (w = 1; w <=10; w++) {
			p = (h * 2) + (w * 2);
			
			a = h * w;
			
			System.out.println("Perimeter " + p "Area " + a);
			}
		}
	}
}