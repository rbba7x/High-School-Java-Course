//Ryan Beebe Fraction Class

public class FractionClass{

private int top1, top2, bot1, bot2; 

//constructor 
	public FractionClass(){
	top1 = 0;
	top2 = 0;
	bot1 = 1;
	bot2 = 1;
	
	}
	public FractionClass(int t1, int t2, int d1, int d2){
	top1 = t1;
	top2 = t2;
	bot1 = d1;
	bot2 = d2;
	
	
	}
	public String Addition(){ 
	int top=top1 *bot2 + top2*bot1;
	int bot=bot1*bot2;
	return top + "/" + bot;
	}	
	public String Subtraction(){
	int above=top1*bot2 - top2*bot1;
	int below = bot1*bot2;
	return above + "/" + below;
	}
	public String Multiplication(){
	int high = top1*top2;
	int low = bot1*bot2;
	return high +"/"+low;
	}
	public String Division(){
	int heaven = top1*bot2;
	int hell = bot1*top2;
	return heaven + "/" + hell;
	}
	public String toString(){
	String str;
	str = "Addition: " + Addition() + "\n" +
		"Subtraction: " + Subtraction() + "\n"
		+ "Multiplication: " + Multiplication() + "\n" + 
		"Division: " + Division();
		return str;
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//int n1, n2;
	//while (n1 != 0){
			//System.out.println(n2 + "\t" + n1 + "\t" + rem );
			//n2 = n1;
			//n1 = rem; 
			//if (n1 == 0)
			//	break;
			//else
			//	rem = n2%n1;
	
	
