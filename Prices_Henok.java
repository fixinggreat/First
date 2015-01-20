import java.util.*;
import java.text.NumberFormat;


public class Prices_Henok
 {

 		public static void main (String[] args)
		{	
			NumberFormat money= NumberFormat. getCurrencyInstance();// the money sign
			
			
	
			double [] Prices = { 5.35, 2.20, 3.32, 2.27, 2.22, 5.42, 12.42, 16.42, 24.40, 88.52};//assigning the array
			double sum=0;
			double less=0;
			double average;
			
			
			for(int x=0;x<10;x++)//a for loop that goes throught the array to the tenth number
			{
				sum=sum+Prices[x];
					
			}
			average=sum/10;//finda the average of the array
			System.out.println("The Sum of the prices is "+money.format(sum));
			
		
			for(int y=0;y<10;y++)//same for loop as the top one
			{
				
			if (Prices[y]<5.00)//thats the array and only find sthe ones under 5.00
			{
				System.out.print(Prices[y]);//prints the true ones
			}
			else
			{
				
			}
			
				
				
			}
			System.out.println(" Are the values under $5.00");
			System.out.println("The average price of all them is "+money.format(average));
			
			for(int z=0;z<10;z++)
			{
				if (Prices[z]>average)//finds the prices over the averages and prints them out
				{
				System.out.print(Prices[z]);
				}
				else
				{
				}
			}
			System.out.println(" Are all the values higher than the average");
			
		}
		
		
 }
 
 /*--------------------Configuration: <Default>--------------------
The Sum of the prices is $162.54
2.2 3.32 2.27 2.22 Are the values under $5.00
The average price of all them is $16.25
16.42 24.4 88.52 Are all the values higher than the average

Process completed.
*/

