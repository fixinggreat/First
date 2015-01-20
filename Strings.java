import java.util.*;
public class Strings {
	
	static Scanner console= new Scanner(System.in);
	
	public static void main(String[] args)
	{
		CountNumbers();
		

		
	}
	public static void inputTest()

	{
		String message=console.nextLine();
		System.out.print(Hello(message));
			
	}
	public static String Hello(String message)
	{
		if(message.equals("hi"))
		{
			return"Hello";
		}
		else
		{
			return"Goodbye";
		}
	}
	
	public static void CountNumbers()
	{
		int numbers=0;
		while (numbers<100)
		{
			System.out.println(numbers);
			numbers++;
		}
	}
	public static void CompareUnqualStrings()
	{
		String x="Brandon";
		String y="Ted";
		
		if(!x.equals(y))
		{
			System.out.println("X does not equal y");
		}
		
		
			
		}
}

