// Ryan Beebe P2
//Triangle Class

import TurtleGraphics.*;

 public class TriangleClass implements Shape{

	protected double xPos, yPos, x2, y2, x3, y3;
	
	public TriangleClass(){
		double xPos = 0;
		double yPos = 0;
		double x2 = 0;
		double y2 = 0;
		double x3 = 0;
		double y3 = 0;
	}
	
	public TriangleClass(double xLoc, double yLoc, double xLoc2, double yLoc2, double xLoc3, double yLoc3){
		xPos = xLoc;
		yPos = yLoc;
		x2 = xLoc2;
        y2 = yLoc2;
        x3 = xLoc3;
        y3 = yLoc3;
	}
	
	public double area(){
		return  (Math.abs(xPos*y2-x2*yPos+x2*y3-x3*y2+x3*yPos-xPos*y3))/2.0;
	}
	
	public void draw (Pen p){
		p.up();
		p.move(xPos, yPos);
		p.down();
		p.move(x2, y2); 
		p.move(x3, y3);
		p.move(xPos, yPos);
	}
	public double getXPos(){
		return xPos;
		}
		public double getYPos(){
		return yPos;
	}
	public void move (double xLoc, double yLoc){
		xPos=xLoc;
		yPos=yLoc;
		}
	  public double perimeter(){
		double s1 = Math.sqrt((xPos-x2)*(xPos-x2)+(yPos-y2)*(yPos-y2));
		double s2 = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		double s3 = Math.sqrt((x3-xPos)*(x3-xPos)+(y3-yPos)*(y3-yPos));
		double perimeter = s1 + s2 + s3;
		return perimeter;
		}
	  public void stretchBy (double factor){
		x2 = xPos + (x2-xPos)*factor;
		x3 = xPos + (x3-xPos)*factor;
		y2 = yPos + (y2-yPos)*factor;
		y3 = yPos + (y3-yPos)*factor;
		}
		
		public String toString(){
		double s1 = Math.sqrt((xPos-x2)*(xPos-x2)+(yPos-y2)*(yPos-y2));
		double s2 = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		double s3 = Math.sqrt((x3-xPos)*(x3-xPos)+(y3-yPos)*(y3-yPos));
		String str="TRIANGLE\n" + "Side1\n" + s1+ "Side2\n" + s2 + "\n" + "(X,Y) Position: (" + xPos + "," + yPos + ")\n" + "Area: " + area();
		return str;
}
}

	  
	  
	  