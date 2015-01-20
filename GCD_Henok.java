import java.util.*;

public class GCD_Henok
 {

 		private static Scanner console;

		public static void main (String[] args)
		{
			
			
			console = new Scanner(System.in);
			
			int Num1,Num2,Num3;
			
			System.out.print("Enter in first number: ");//asking for first number
			Num1 = console.nextInt();
			
			System.out.print("Enter in your second number: "); //asking for second number
			Num2 = console.nextInt();
				
			
			while(Num2 > 0 && Num1>0) //it will loop until Num2 and 1 are over 0
			{

				Num3 = Num1 % Num2;//finding the reminder

				Num1 = Num2;
				
				Num2 = Num3;
				
				
			}
			
			
			System.out.println("The GCD is "+Num1);
			
			
		}
		
		
 }
 
 /*--------------------Configuration: <Default>--------------------
Enter in first number: 32
Enter in your second number: 40
The GCD is 8

Process completed.*/

