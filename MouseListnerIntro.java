import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class MouseListnerIntro extends Applet 
implements MouseListener{
 private Graphics globalgraphics;
 
 public void init()
 {
	 this.addMouseListener(this);
 }
 
 public void paint(Graphics g)
 {
	 this.setSize(new Dimension(800,600));
	 
		 globalgraphics=g.create();
	 
 }
 	public void DrawDot(int x,int y, int width, int height)
 	{
 		int R=(int)(Math.random()*256);
 		int G=(int)(Math.random()*256);
 		int B=(int)(Math.random()*256);
 		
 		Color randomColor=new Color(R,G,B);
 		globalgraphics.setColor(randomColor);
 		globalgraphics.fillRect(x, y, width, height);
 		
 	}	
 		public void DrawCicle(int x,int y, int width, int height)
 	 	{
 	 		int R=(int)(Math.random()*256);
 	 		int G=(int)(Math.random()*256);
 	 		int B=(int)(Math.random()*256);
 	 		
 	 		Color randomColor=new Color(R,G,B);
 	 		globalgraphics.setColor(randomColor);
 	 		globalgraphics.fillOval(x, y, width, height);

 		
 	}
 	
 	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("Mouse has entered");
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("Mouse has exit");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		boolean isControl=e.isControlDown();
		
		int MouseX=e.getX();
		int MouseY=e.getY();
		
		if(isControl)
		DrawDot(MouseX,MouseY, 30, 30);
		
		else if(e.isAltDown())
		DrawCicle(MouseX,MouseY,30,30);
		
		
		else
			DrawDot(MouseX,MouseY,10,10);
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		
	}

}
