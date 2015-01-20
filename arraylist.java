import java.util.ArrayList;//the library of the program
import java.util.Scanner;
public class arraylist {

	static Scanner console=new Scanner(System.in);//scanner
	
	static ArrayList<Integer> Array=new ArrayList<Integer>();//declaring an array list with name Array
	
	public static void main(String[] args)
	{
		System.out.println("Please enter a list of number and type 0 to finish: ");//asking for input
		int input=console.nextInt();
		
		while(input!=0)//a loop until input 0
		{	
			Array.add(input);//adds all input to the arraylist
			input=console.nextInt();//taking in the inputs
		}
		
		PrintArray();//prints the array
		
		
		System.out.print("What number would you like to delete: ");//asking for input
		int del=console.nextInt();
		
		for(int i=0;i<Array.size();i++)//will go through the whole array list
		{
			if (Array.get(i)==del)//if it does get a number in the array list that equals the delete number
			{
				Array.remove(i);//it will remove that number from the array list
				
				break; //after it finally does that it will quit the loop with a break
			}
			
		}
		
		PrintArray();//and prints it on last time
		
		
	}
	
	public static void PrintArray(){
		
		
		System.out.println("-------------------------------------------");
		
		for(int i: Array)//will got through the whole array same as for(int i=0;i<array.size();I++)
		{
			System.out.println(i);
		}

	}
	
}
/*Please enter a list of number and type 0 to finish: 
5
4
3
2
1
0
-------------------------------------------
5
4
3
2
1
What number would you like to delete: 3
-------------------------------------------
5
4
2
1*/
