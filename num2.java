//Ryan Beebe p2
import java.util.*;
public class num2{

	public static void main(String[] args){
		Scanner brynno = new Scanner(System.in);
		
	String name;
	double amnt;
	
	System.out.print("What is your name?");
		name = brynno.nextLine();
	System.out.print("What is your amount of sales?");
		amnt = brynno.nextDouble();
	
	if (amnt < 0){
		System.out.print("Hi " + name + "\n" + "You are in debt");
	}
		else if (amnt >=0 && amnt <= 5000){
			System.out.print("Hi " + name + "\n" + "Your bonus is three percent");
		}
			else if (amnt > 5000 && amnt <= 10000){ 
				System.out.print("Hi " + name + "\n" + "Your bonus is five percent");
			}
				else if (amnt > 10000 && amnt < 15000){ 
					System.out.print("Hi " + name + "\n" + "Your bonus is eight percent");
				}
					else if (amnt > 15000){ 
						System.out.print("Hi " + name + "\n" + "Your bonus is ten percent");
					}
	}
}
	