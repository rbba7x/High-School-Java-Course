//Ryan Beebe p2
// 6.4 #1

import java.util.Scanner;

public class Alarm{

	public static void main(String [] args){
	
	Scanner brynno = new Scanner(System.in);
	String x="Alarm", s="";
	int y;
	
	System.out.print("How many times do you want the alarm to ring?");
	y = brynno.nextInt();
	
	s = sentence (y);
	
	System.out.print(s);
	
	}
	
	public static String sentence (int m){
	String sentence = "";
	
	for(int i=1; i<=m; i++){
		sentence = sentence + "   A  l  a  r  m !   ";
		}
		return sentence;
	}
}