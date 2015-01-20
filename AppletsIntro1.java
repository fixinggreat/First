import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.*;

public class AppletsIntro1 extends Applet 
{
	
	private Graphics globalgraphics;
	
	
	
	public void paint(Graphics g)
	{
		
		this.setSize(new Dimension(800,600));
		 
		 globalgraphics=g.create();
		 
		 for(int x=0;x<5;x++)
			 OvalMaker();

	}
	
	public void OvalMaker()
	{
		
		int S=(int)(Math.random()*400);
		int T=(int)(Math.random()*400);
		
		int R=(int)(Math.random()*256);
	 	int G=(int)(Math.random()*256);
	 	int B=(int)(Math.random()*256);
	 	
		Color randomColor=new Color(R,G,B);
		globalgraphics.setColor(randomColor);
		globalgraphics.fillOval(S, T, S, T);
	
		
	}

}
