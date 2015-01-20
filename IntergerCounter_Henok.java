import java.util.Scanner;

public class IntergerCounter_Henok
{

	public static void main (String[] args)
	{
		
		Scanner console = new Scanner (System.in);
		
		int[] numberslist = new int[50];
		
		
		char current;
		
		System.out.print("Enter a number: ");
		String input = console.nextLine();
	
		for (int f = 0; f < input.length(); f++)
		{
			current = input.charAt(f);
			
			if (current >='0'  && current <= '9' )
				numberslist[current-'1' ]++;
			else
			{
			}

		}

		System.out.println ();
		
		for (int q=0; q < numberslist.length; q++)
		{
			System.out.print ( (char) (q + '1' ) );
			System.out.print (": " + numberslist[q]);
			System.out.println("\t\t");

		}
		
		System.out.println ();
		
	
	}
}



