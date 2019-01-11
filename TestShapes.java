//Main Class


import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;

public class TestShapes{

	public static void main (String [] args){
		Pen p = new StandardPen();
		Shape s1 = new Circle(20, 20, 20);
		Shape s2 = new Rect(-20, -20, 20, 10);
		Shape s3 = new TriangleClass (20, 20, 40, 20, 40, 40);
		
		s1.draw(p);
		s2.draw(p);
		s3.draw(p);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.print("Press <Enter> to continue: ");
		Scanner reader = new Scanner(System.in);
		reader.nextLine();
		
		p.setColor(Color.white);
		s1.draw(p);
		s2.draw(p);
		s3.draw(p);
		p.setColor(Color.red);
		
		s1.move(30, 30);		s2.move(-30, -30);
		s1.stretchBy(2);		s2.stretchBy(2);
		s1.draw(p);				s2.draw(p);
		s3.move(30,30);
		s3.stretchBy(2);
		s3.draw(p);
		
		}
	}