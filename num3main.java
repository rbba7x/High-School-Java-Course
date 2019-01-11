//Ryan Beebe p2
import java.util.*;
public class num3main{

	public static void main(String[]args){
	
	Scanner brynno = new Scanner(System.in);
	
	//String choice;
	double r;
	int x=1;
	while (x==1){
	System.out.print("If you want to calculate Volume press V, for Surface Area press SA, for Area of Great Circle press GC, for all type ALL" + "\n" + "\n");
	String choice = brynno.nextLine();
	//System.out.print("What is the radius? ");
	//r = brynno.nextDouble();
	
		if (choice.equalsIgnoreCase("v")){
			System.out.print("\n" + "What is the radius?" + "\n" + "\n");
				r = brynno.nextDouble();
					num3 ans = new num3(r);
						System.out.print("\n" + "The volume is: " + ans.volume()); 
							x=2;
		}
			else if (choice.equalsIgnoreCase("sa")){
				System.out.print("\n" + "What is the radius?" + "\n" + "\n");
					r = brynno.nextDouble();
						num3 ans = new num3(r);
							System.out.print("\n" + "The surface area is: " + ans.SurAr()); 
								x=2;
			}
				else if (choice.equalsIgnoreCase("gc")){
				System.out.print("\n" + "What is the radius?" + "\n" + "\n");
					r = brynno.nextDouble();
						num3 ans = new num3(r);
							System.out.print("\n" + "The area of great circle is: " + ans.GC()); 
								x=2;
				}
					else if (choice.equalsIgnoreCase("all")){
					System.out.print("\n" + "What is the radius?" + "\n" + "\n");
						r = brynno.nextDouble();
							num3 ans = new num3(r);
							System.out.print(ans.toString()); 
								x=2;
					}
						else{
							System.out.print("\n" + "Please type an approriate answer" + "\n" + "\n");
							
	}
}
}
}
	
		