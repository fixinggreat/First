import java.util.*;
public class Objectpractice_Test {
	
	private static Scanner console;

	public static void main(String[] args){
		
		console = new Scanner(System.in);
		
		Objectpractice Phoneminutes= new Objectpractice();
		
		System.out.print("Enter in the amount of minutes added: ");
		int added=console.nextInt();
		
		System.out.print("Enter in the amount of minutes used: ");
		int used=console.nextInt();
		
		
		Phoneminutes.Addminutes(added);
		Phoneminutes.Useminutes(used);
		System.out.println("The remaining minutes are: "+Phoneminutes.minutesleft());
	}

}
