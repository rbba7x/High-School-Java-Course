// Ryan Beebe p2 Bank Main Program

import java.util.*;

public class Bank{

	public static void main(String [] args){
	
	Scanner brynno = new Scanner(System.in);
	
	//variables
	String name;
	double balance, dep, with;
	
	System.out.print("What is your name?");
		name = brynno.nextLine();
	System.out.print("What is your balance?");
		balance = brynno.nextDouble();
	System.out.print("How much do you wish to deposit?" + "\n" + "Do not deposit and withdrawl in the same transaction");
		dep = brynno.nextDouble();
	System.out.print("How much do you wish to withdrawl?");
		with = brynno.nextDouble();
	BankAccount nm = new BankAccount(name, balance);
	
	if (with < 0)
		System.out.print("You cannot withdrawl a negative amount");
	else if (with>0)
		System.out.print(nm);
			System.out.println(nm.withdrawl(with));
	 if (dep < 0)
		System.out.print("You cannot deposit a negative amount");
	else if (dep > 0)
		System.out.println(nm);
			System.out.println(nm.deposit(dep));
	}
}
	
	