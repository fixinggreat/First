
public class Array {

	public static void main(String[] args) {
		int arrayInt[] = new int[5];
		
		arrayInt[0]=1;
		System.out.println(arrayInt[0]);
		
		int i=1;
		while(i<=4)
		{
			arrayInt[i]=i+1;
			i++;
		}
		System.out.println(arrayInt[0]);
		System.out.println(arrayInt[1]);
		System.out.println(arrayInt[2]);
		System.out.println(arrayInt[3]);
		System.out.println(arrayInt[4]);
		
	}

}
