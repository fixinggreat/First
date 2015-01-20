import javax.swing.JOptionPane;


public class morejoption {
	
	public static void main(String[] args){
		
		Double number=Double.parseDouble(JOptionPane.showInputDialog("What is 3/2?"));//uses a cool pop-up to input and output
		if(number - 1.5 < 0.000001 && number +1.5 >= 3)//used so input must be 1.5 without using ==1.5 because the computer thinks is 1.4444
		{
			JOptionPane.showMessageDialog(null, "You are Correct!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You are Incorrect!");
		}
		

	}

}
