import javax.swing.JOptionPane;

public class TryingJoptions {
	

	public static void main(String[] args)
	{
		
		String name =JOptionPane.showInputDialog(null,"What is your name?");
		
		switch(name)
		{
		case "Henok":JOptionPane.showMessageDialog(null, "Wass good man");
		break;
		default:JOptionPane.showMessageDialog(null, "Get the fuck out");
		break;
		}
	}
}
