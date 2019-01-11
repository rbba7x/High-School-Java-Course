//Ryan Beebe p2

public class RightTriangle{

private double leg1, leg2;

public RightTriangle(){
leg1=0.0;
leg2=0.0; 
}
public RightTriangle(double l1, double l2){
leg1 = l1;
leg2 = l2;
}
public double perimeter(){
double p, h, x;
x = leg1*leg1*leg2*leg2;
h= Math.sqrt(x);
p = leg1 + leg2 + h;
return p;
}
public double area(){
double area;
area = .5 * leg1 * leg2;
return area;
}
public String toString(){
String str;
str = "leg1: " + leg1 + "\n" + "leg2: " + leg2 + "\n" + "Perimeter: " + perimeter() + "\n" + "area: " + area();

return str;
}
}