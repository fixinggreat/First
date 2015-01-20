import java.util.*;
import java.util.Random;

public class MathTutor_Henok {
  
  
  public static void main(String[] args) {
  	
  	Random r = new Random ();
  		
  	Scanner console = new Scanner(System.in);

  	
 	int correct=0;//correct answer var
  	int first = r.nextInt(10) + 1;//random for first second and signs
  	int second = r.nextInt(10) + 1;
  	int signroll= r.nextInt(4) + 1;
  
  	if(signroll==1)//if one of the numbers lands on a 1 it will be addition question
  	{
  		System.out.println(first+" + "+second);
  		correct+=first+second;
  	}
  	
  	else if(signroll==2)
  	{
  		System.out.println(first+" - "+second);
  		correct+=first-second;
  	}
  	
  	else if(signroll==3)
  	{
  		System.out.println(first+" * "+second);
  		correct+=first*second;
  	}
  	
  	else if(signroll==4)
  	{
  		System.out.println(first+" / "+second);
  		correct+=first/second;
  	}
  
  	
  	System.out.print("Enter in your answer: ");//asking for an input
  	int answer=console.nextInt();
  	
  		
  		if(answer == correct)//ches if input is correct with answer
		{
			System.out.println("That is correct.");
		}
		else
		{
			System.out.println("Incorrect");
		}
		
		
	}
	
  
  
  }
  
  
  /*--------------------Configuration: <Default>--------------------
7 + 4
Enter in your answer: 12
Incorrect

Process completed.
*/
  

	
	

