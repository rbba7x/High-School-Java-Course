//Ryan Beebe p2

import java.util.*;

public class LMansPizzeriaa{

	public static void main(String [] args){

		Scanner brynno = new Scanner(System.in);

		int menuOption, toppings, x;
		double tab; 
			System.out.print("Welcome to L-Man's Pizzeria!" + "\n" + "What size uh pizza would you uh like?" + "\n" + "1: Small" + "\n" + "2: Medium" + "\n" + "3: Large" + "\n" + "4: EXTREME"); 
			menuOption = brynno.nextInt(); 
//small start
if (menuOption == 1){
	tab = 8.95;
		System.out.print("What kind of crust would you uh like?" + "\n" + "1: Thin" + "\n" + "2: Thick" + "\n" + "3: Cheesy" + "\n" + "4: Deep Dish" + "\n" + "5: Pretzel Crust");   
			menuOption = brynno.nextInt(); 
  if (menuOption == 1 || menuOption == 2 || menuOption == 3){
	tab = tab + 0;
		System.out.print("How many toppings would you like?" + "\n" + "We uh have uh sausage and uh peperoni and meatballs and some pineapple and bell peppers and uh some uh yummy mush-a-rooms and onions and exter uh cheese");
			toppings = brynno.nextInt();
				tab = tab + toppings * 1.5 - 1.5;
					System.out.print("Here is your uh pizza. You owe uh me uh $" + tab);
					}
	else if  (menuOption == 4){
		tab = tab + 2;
			System.out.print("How many toppings would you like?" + "\n" + "We uh have uh sausage and uh peperoni and meatballs and some pineapple and bell peppers and uh some uh yummy mush-a-rooms and onions and exter uh cheese");
				toppings = brynno.nextInt();
					tab = tab + toppings * 1.5 - 1.5;
						System.out.print("Here is your uh pizza. You owe uh me uh $" + tab);
						}
			
		 else if (menuOption == 5){
			tab = tab + 1;
				System.out.print("How many toppings would you like?" + "\n" + "We uh have uh sausage and uh peperoni and meatballs and some pineapple and bell peppers and uh some uh yummy mush-a-rooms and onions and exter uh cheese");
					toppings = brynno.nextInt();
						tab = tab + toppings * 1.5 - 1.5;
							System.out.print("Here is your uh pizza. You owe uh me uh $" + tab);
		}
		
	}
  
  //small end, med start
  else if (menuOption == 2){
	tab = 9.95;
		System.out.print("What kind of crust would you uh like?" + "\n" + "1: Thin" + "\n" + "2: Thick" + "\n" + "3: Cheesy" + "\n" + "4: Deep Dish" + "\n" + "5: Pretzel Crust");   
			menuOption = brynno.nextInt(); 
  if (menuOption == 1 || menuOption == 2 || menuOption == 3){
	tab = tab + 0;
		System.out.print("How many toppings would you like?" + "\n" + "We uh have uh sausage and uh peperoni and meatballs and some pineapple and bell peppers and uh some uh yummy mush-a-rooms and onions and exter uh cheese");
			toppings = brynno.nextInt();
				tab = tab + toppings * 1.5 - 1.5;
					System.out.print("Here is your uh pizza. You owe uh me uh $" + tab);
					}
	else if  (menuOption == 4){
		tab = tab + 2;
			System.out.print("How many toppings would you like?" + "\n" + "We uh have uh sausage and uh peperoni and meatballs and some pineapple and bell peppers and uh some uh yummy mush-a-rooms and onions and exter uh cheese");
				toppings = brynno.nextInt();
					tab = tab + toppings * 1.5 - 1.5;
						System.out.print("Here is your uh pizza. You owe uh me uh $" + tab);
						}
			
		 else if (menuOption == 5){
			tab = tab + 1;
				System.out.print("How many toppings would you like?" + "\n" + "We uh have uh sausage and uh peperoni and meatballs and some pineapple and bell peppers and uh some uh yummy mush-a-rooms and onions and exter uh cheese");
					toppings = brynno.nextInt();
						tab = tab + toppings * 1.5 - 1.5;
							System.out.print("Here is your uh pizza. You owe uh me uh $" + tab);
		}
		
	}
		// med end, lrg start 
	else if (menuOption == 3){
	tab = 10.95;
		System.out.print("What kind of crust would you uh like?" + "\n" + "1: Thin" + "\n" + "2: Thick" + "\n" + "3: Cheesy" + "\n" + "4: Deep Dish" + "\n" + "5: Pretzel Crust");   
			menuOption = brynno.nextInt(); 
  if (menuOption == 1 || menuOption == 2 || menuOption == 3){
	tab = tab + 0;
		System.out.print("How many toppings would you like?" + "\n" + "We uh have uh sausage and uh peperoni and meatballs and some pineapple and bell peppers and uh some uh yummy mush-a-rooms and onions and exter uh cheese");
			toppings = brynno.nextInt();
				tab = tab + toppings * 1.5 - 1.5;
					System.out.print("Here is your uh pizza. You owe uh me uh $" + tab);
					}
	else if  (menuOption == 4){
		tab = tab + 2;
			System.out.print("How many toppings would you like?" + "\n" + "We uh have uh sausage and uh peperoni and meatballs and some pineapple and bell peppers and uh some uh yummy mush-a-rooms and onions and exter uh cheese");
				toppings = brynno.nextInt();
					tab = tab + toppings * 1.5 - 1.5;
						System.out.print("Here is your uh pizza. You owe uh me uh $" + tab);
						}
			
		 else if (menuOption == 5){
			tab = tab + 1;
				System.out.print("How many toppings would you like?" + "\n" + "We uh have uh sausage and uh peperoni and meatballs and some pineapple and bell peppers and uh some uh yummy mush-a-rooms and onions and exter uh cheese");
					toppings = brynno.nextInt();
						tab = tab + toppings * 1.5 - 1.5;
							System.out.print("Here is your uh pizza. You owe uh me uh $" + tab);
								}
							}
	//lrg end, extreme start 
	else {
	tab = 13.95;
		System.out.print("Whoa dats uh big uh pizza" + "\n" + "What kind of crust would you uh like?" + "\n" + "1: Thin" + "\n" + "2: Thick" + "\n" + "3: Cheesy" + "\n" + "4: Deep Dish" + "\n" + "5: Pretzel Crust");   
			menuOption = brynno.nextInt(); 
  if (menuOption == 1 || menuOption == 2 || menuOption == 3){
	tab = tab + 0;
		System.out.print("How many toppings would you like?" + "\n" + "We uh have uh sausage and uh peperoni and meatballs and some pineapple and bell peppers and uh some uh yummy mush-a-rooms and onions and exter uh cheese");
			toppings = brynno.nextInt();
				tab = tab + toppings * 1.5 - 1.5;
					System.out.print("Here is your uh pizza. You owe uh me uh $" + tab);
					}
	else if  (menuOption == 4){
		tab = tab + 2;
			System.out.print("How many toppings would you like?" + "\n" + "We uh have uh sausage and uh peperoni and meatballs and some pineapple and bell peppers and uh some uh yummy mush-a-rooms and onions and exter uh cheese");
				toppings = brynno.nextInt();
					tab = tab + toppings * 1.5 - 1.5;
						System.out.print("Here is your uh pizza. You owe uh me uh $" + tab);
						}
			
		 else if (menuOption == 5){
			tab = tab + 1;
				System.out.print("How many toppings would you like?" + "\n" + "We uh have uh sausage and uh peperoni and meatballs and some pineapple and bell peppers and uh some uh yummy mush-a-rooms and onions and exter uh cheese");
					toppings = brynno.nextInt();
						tab = tab + toppings * 1.5 - 1.5;
							System.out.println("Here is your uh pizza. You owe uh me uh $" + tab);
								
								
						
						}
					}
				}
			}
		
			
			
					
				
			
			
  
 
