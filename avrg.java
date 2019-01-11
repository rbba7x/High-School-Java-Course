//Ryan Beebe p2 10.2

import java.util.*;
public class avrg{

	public static void main(String [] args){
		//scanner
			Scanner brynno = new Scanner(System.in);
				//Variables and arrays
					double [] pinacolada = new double [10];
					double resp;
					//for each loop assembling the array
						for(int i=0; i<pinacolada.length; i++){ 
							System.out.println("Enter a double");
								resp= brynno.nextDouble();
									pinacolada[i] = resp;
						}
						//output and calling to methods
							System.out.println("The average of the numbers is " + Average(pinacolada));
							double [] gvag = GTA(pinacolada);
							System.out.print("The numbers greater than the average are ");
								for(int i=0; i<gvag.length; i++){
									if (gvag[i]>0)
									System.out.print(gvag[i] + "  ");
								}
	}
	
//average method
	public static double Average(double [] pinacolada){
		double avrage=0;
			for(int i=0;i<pinacolada.length; i++){
				avrage = avrage + pinacolada[i];
				}
				avrage = avrage/pinacolada.length;
					return avrage;
					}
// greater than avrg method
	public static double[] GTA(double[] pinacolada){ 
	double [] methodarray = new double[10];
		int nums=0;
		double temp=0;
			for(int i=0; i<pinacolada.length; i++){ 
				temp = pinacolada[i];
					if (temp > Average(pinacolada)){
						methodarray[nums]=temp;
						nums++;
					}
			}
		return methodarray;
	}
}
							
							
								
						
									
								
	
	