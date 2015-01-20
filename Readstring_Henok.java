import java.util.*;


public class Readstring_Henok
{

	private static Scanner console;

	public static void main(String[] args)
	{
		int countA=0;
		int countE=0;
		int countI=0;
		int countO=0;
		int countU=0;
		int countExtra=0;
		int Limit;
		
		console = new Scanner(System.in);
		
		System.out.print("Enter a string of characters:"); //asking for a string of characters
		String str = console.nextLine();
		
		str = str.toLowerCase(); // turns all characters into lower case
		
		int inputlength=str.length(); 
		
		
		
		for(Limit=0;Limit<inputlength;Limit++) // for loop 
		{
		
		switch(str.charAt(Limit))//making limit the limit of the charcters
		{
			case 'a':
				countA++;
			break;
			
			case 'e':
				countE++;
			break;
			
			case 'i':
				countI++;
			break;
			
			case 'o':
				countO++;
			break;
			
			case 'u':
				countU++;
			break;
			
			default: 

 				countExtra++;// using this to stor everything but vowels
 				
 			break;
		}

	}
			System.out.println("A= " +countA);//outputing the vowels 
			System.out.println("E= " +countE);
			System.out.println("I= " +countI);
			System.out.println("O= " +countO);
			System.out.println("U= " +countU);
			System.out.println("Extra Characters= " +countExtra);
	
	
	
	
	}

}


/*Enter a string of characters:chicken
A= 0
E= 1
I= 1
O= 0
U= 0
Extra Characters= 5

Process completed.*/

			