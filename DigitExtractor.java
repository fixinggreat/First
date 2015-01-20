
public class DigitExtractor {
	
	int tnumber=0;
	String snumber;

	public DigitExtractor(int numbers)
	{
		tnumber=numbers;
		
	}
	
	public DigitExtractor(String numbers)
	{
		snumber=numbers;
	}
	
	public void ReturnInvertedByMath()
	{
		int interger1=0;
		int interger2=0;
		int interger3=0;
		int interger4=0;
		int interger5=0;
		interger1=(tnumber%10);
		interger2=(tnumber%100)/10;
		interger3=(tnumber%1000)/100;
		interger4=(tnumber%10000)/1000;
		interger5=(tnumber%100000)/10000;
		
		System.out.println(interger1);
		System.out.println(interger2);
		System.out.println(interger3);
		System.out.println(interger4);
		System.out.println(interger5);
		
	}
	
	public void returnInvertedAsString()
	{
		char part1;
		char part2;
		char part3;
		char part4;
		char part5;
		
		part1 = snumber.charAt(4);
		part2 = snumber.charAt(3);
		part3 = snumber.charAt(2);
		part4 = snumber.charAt(1);
		part5 = snumber.charAt(0);
		
		System.out.println(part1);
		System.out.println(part2);
		System.out.println(part3);
		System.out.println(part4);
		System.out.println(part5);
		
		
		
		
		
		
		
		
	}
}
