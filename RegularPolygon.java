//Ryan Beebe Re-Quest 

public class RegularPolygon{
private int sides;
private double los, apo;

public RegularPolygon(){
sides=0;
los=0;
apo=0;
}
public RegularPolygon(int s, double l, double a){
sides=s;
los=l;
apo=a;
}
public double Perimeter(){
double peri;
peri= los * sides;
return peri;
}
public double area(){
double area;
area = .5*apo*Perimeter();
return area;
}
public String toString(){
String str;
str= "sides: " + sides + "\n" + "length of sides: " + los + "\n" + "Perimeter: " + Perimeter() + "\n" + "area: " + area();
return str;
}
}