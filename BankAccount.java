//Bank Account Class Ryan Beebe p2

public class BankAccount{

private String name;
private Double balance;

//default constructor 
public BankAccount(){
	name = "";
	balance = 0.0;
}
//constructor
public BankAccount(String noom, double bal){
 name = noom;
 balance=bal;
}
public double deposit(double dep){
	double depo = dep;
	balance += depo; 
	return balance; 
}
public double withdrawl (double with){
	double w1=with;
	balance -= w1;
	return balance; 
}

public String toString(){
	String str; 
	str = "Name: " + name + "\n" + "Your new balance is: ";

return str; 
}
}