//Ryan Beebe Penny Pitch

import java.util.*;

public class pp{
	public static void main(String [] args){
		Random gen = new Random();
        Scanner brynno = new Scanner(System.in);
			int totalScore = 0;
			int played = 0;
			int round = 0;
            int row = 0;
            int col = 0;
            int attempt = 0;
            String str = "";
            int score = 0;
            boolean playAgain = true;
            int boardTotal = 0;

	while(true){
		Sq[][] PennyBoard= {{1,1,1,1,1}, {1,2,2,2,1},{1,2,3,2, 1}, {1,2,2,2,1},{1,1,1,1,1}};
			while(playAgain && round < 5){
		int random = gen.nextInt(25) + 1;
			attempt = gen.nextInt(25) + 1;
				row = (attempt - 1) / 5;
					col = (attempt - 1) % 5;
						str = "";
							score += PennyBoard[row][col];
								round++;
									boardTotal++;
	
		
	for(int row2 = 0; row2 < PennyBoard.length; row2++){
       for(int col2 = 0; col2 < PennyBoard.length; col2++){
			str += PennyBoard[row2][col2] + "   ";
       }
     str += "\n";
    }
		System.out.print("The Board: " + boardTotal + " out of 5" +  "\n" + str);
                  }
               }
 
               totalScore += score;
               played++;
	System.out.print("Score for this round is " + score + " points");
    System.out.print("Total is " + totalScore + " points");
 
               int option = 0;
			   System.out.print("Wanna quitar? If yes, press 0. If no quitar, press any other integer to continue");
			   option = brynno.nextInt();
               if (option == 0)
                  break;
            }
 
            System.out.print("Total Status: " + totalScore + " points, in " + played + " rounds.");
         }
      

