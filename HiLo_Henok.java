import java.util.*;
import java.util.Random; 

public class HiLo_Henok
 {

 		private static Scanner console;

		public static void main (String[] args)
		{
			
				Random r = new Random ();
				
				int again;
				int count=0;
				int playerNumber;
				int secretNumber;
				
				
				console = new Scanner(System.in);
				
					do{//a do loop for the random number
					secretNumber = r.nextInt(100) + 1;
					
					do{//a do loop for input
					
					System.out.print("Enter a number between 1 and 100: "); //asking for a number
			 		playerNumber = console.nextInt();
			 		
					if(playerNumber == secretNumber) 
					{	
					count++;//counting the guesses
					System.out.println("You won!");
					System.out.println(count+" guesses taken.");
					
					}
						
					
					else if(playerNumber<secretNumber)//if it is over the number 
					{
						System.out.println("Low");
						count++;
						
					}
					else if(playerNumber>secretNumber)
					{
						System.out.println("High");
						count++;
					}
					
					}while(playerNumber!=secretNumber);
					
					System.out.print("if you would like to play again press 0: " );
					again = console.nextInt();
					
					}while(again == 0); //it will report until it will hit 0
				
		}
		
		
 }
		
		
/*-----Configuration: <Default>--------------------
Enter a number between 1 and 100: 30
Low
Enter a number between 1 and 100: 40
High
Enter a number between 1 and 100: 32
Low
Enter a number between 1 and 100: 37
High
Enter a number between 1 and 100: 38
High
Enter a number between 1 and 100: 36
High
Enter a number between 1 and 100: 33
You won!
7 guesses taken.
if you would like to play again press 0: 0
Enter a number between 1 and 100: */		

				
