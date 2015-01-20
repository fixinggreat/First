import java.util.*;
import java.text.NumberFormat;
public class AVG_Henok
 {

 		private static Scanner console;
		private static NumberFormat defaultFormat;

		public static void main (String[] args)
		{
			int avg;
			int total=0;
			
			console = new Scanner(System.in);
			
			defaultFormat = NumberFormat.getPercentInstance();
			
			for(int i=0;i<5;i++)//for loop for asking 
			{
				System.out.print("Enter in test scores: ");//asking for test score 5 times
				int scores=console.nextInt();
				total+=scores;// adding to total
				
			}
			
			avg=total/5;//dividing by 5
			
			System.out.println("Average of test scores: "+avg);
		}
		
 }
 
 /*--------------------Configuration: <Default>--------------------
Enter in test scores: 78
Enter in test scores: 88
Enter in test scores: 64
Enter in test scores: 54
Enter in test scores: 100
Average of test scores: 76%

Process completed.*/

			
			
			