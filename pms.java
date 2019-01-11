//Ryan Beebe p2
import java.util.*;

public class pms{
	public static void main(String [] args){
		Scanner brynno = new Scanner(System.in);
			int [][] pms = new int [4][4]; //potential magic square 
			int [] colsum = new int [4];
			int [] rowsum = new int [4];
			int [] diag1sum = new int [4];
			int [] diag2sum = new int [4];
			int sum1=0, sum2=0;
			
			// get input 
			for (int row = 0; row < pms.length; row++){
				for(int col=0; col <pms.length; col ++){
					System.out.println("Input the potnetial magic square numbers");
						pms[row][col] = brynno.nextInt();
				}
			}
			// calcuations
			//rows sum
			
			for(int row = 0; row <pms.length; row ++){
				for(int col = 0; col < pms[row].length; col++){
					rowsum [row] += pms [row] [col];
				}
			}
				for(int i=0; i<pms.length; i++){
					System.out.print("The row sum is:" + rowsum[i] + "\n");
				}
			//column sums
			for(int row = 0; row <pms.length; row++){
				for(int col =0; col < pms[row].length; col++){
					colsum[col] += pms [row] [col];
				}
			}
				for(int i=0; i < colsum.length; i++){
					System.out.print("The column sum is: " + colsum[i] + "\n");
				}
			//Diag1 sums
			
			for (int row=0; row < pms.length; row ++){
				for (int col=0; col < pms[row].length; col ++){
					if (row== col){
						sum1 += pms[row][col];
					}
				}	
			}
			for (int i=0; i < diag1sum.length; i++){
				System.out.print("Diagonal 1 sum: " + sum1 + "\n"); 
			}
			for (int row=0; row <pms.length; row ++){
				for ( int col=0 ; col < pms [row].length; col ++){
					if (row + col == 3) {
						sum2 += pms [row][col];
					}
				}
			}
			for (int i=0; i<diag2sum.length; i++){
				System.out.print("Diagonal 2 sum: " + sum2 + "\n");
			}
		}
	}