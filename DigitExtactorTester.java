import java.util.*;
public class DigitExtactorTester {

	private static Scanner console;

	public static void main(String[] args) {
		
			console = new Scanner(System.in);
			
			System.out.println("Welcome to the digit Extactor");
			System.out.print("Enter in 5 digits: ");
			String input=console.next();
			System.out.println("Mathmatically: ");
			DigitExtractor DE = new DigitExtractor(Integer.parseInt(input));
			DE.ReturnInvertedByMath();
			System.out.println("Using Strings: ");
			DigitExtractor DSE= new DigitExtractor(input);
			DSE.returnInvertedAsString();
			
			
			
			
	}

}
