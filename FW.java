import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class FW {

	public static void main(String[] args) 
	{
		
		File newfile= new File("C:/Users/Henok/Desktop/ROMO.txt");//makes a file object 
		
		if(newfile.exists())//if the object already exists it will say so
		{
			System.out.println("File Already Exists");
		}
		else
		{
			try{//it was try to do all that
				
			newfile.createNewFile();//creating the text file
			FileWriter writer=new FileWriter(newfile);//telling it which file we will write in
			BufferedWriter buffW=new BufferedWriter(writer);//This thing is the writer 
			buffW.write("Coffee");//this is what we write
			buffW.close();//closes the writer 
			System.out.print("File Written");//gives is a file written
			
			}catch(Exception s)//it will catch errors
			{
				s.printStackTrace();//it will trace it back to the point of error
			}
		}
		
		

	}

}
