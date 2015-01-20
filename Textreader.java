import java.io.BufferedReader;
import java.io.FileReader;

public class Textreader 
{
	public static void main(String []args) throws Exception
	{
		FileReader File=new FileReader("C:/Users/Henok/Desktop/newfile.txt");//picks a file it wants to read
		BufferedReader BR = new BufferedReader(File);//takes the file and reads it
		
		String text = "";
		String line=BR.readLine();//reads everything in the file
		
		while(line != null)//runs the file until line is null
		{
			text+=line;//adds everything to line
			line=BR.readLine();//line keeps reading
			
		}
		BR.close();//close the reader
		System.out.println(text);//prints the stuff
		
	}

}
