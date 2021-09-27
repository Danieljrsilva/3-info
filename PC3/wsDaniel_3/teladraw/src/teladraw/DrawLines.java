package teladraw;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawLines extends JPanel{
	public  void paintComponent (Graphics g) {
	super.paintComponent(g);
	Color cor = new Color (255,255,0);
	//                   x,y,x,y
	g.drawLine(10, 10, 80, 10);
	g.drawLine(10, 10, 10, 80);
	g.drawLine(10, 80, 80, 80);
	g.drawLine(80, 10, 80, 80);
	//g.drawLine(50,50,80,20);
	
	g.setColor(cor);
	g.drawRect(100, 10, 70, 70);
	
	
	
	}
}	
	
