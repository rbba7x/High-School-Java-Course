//Ryan Beebe
//Test wheels

import TurtleGraphics.*;

public class TestWheel{ 
	public static void main (String [] args){
	
	Pen p = new StandardPen();
	Shape s1 =new Circle (20, 20, 20);
	Shape s2 = new Wheel (-20,-20,-20, 6);
	
	s1.draw(p);
	s2.draw(p); 
	}
}