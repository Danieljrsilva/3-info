package desenho;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DesenhoLinha extends JPanel{
	public void paintComponent( Graphics g ) {
	super.paintComponent( g );
	Color cor = new Color(0,0,0);
	//               x , y , x , y
	g.drawLine(10, 10, 80, 10);
	g.drawLine(80, 10, 10, 80);
	g.drawLine(10, 10, 10, 80);
	g.drawLine(10, 10, 80, 80);
	
	g.setColor(cor);
	g.drawRect(100, 10, 70, 70);
	
	g.setColor(Color.blue);
	g.fillRect(120, 10, 10, 10);
	
	g.setColor(Color.blue);
	g.fillRect(140, 10, 10, 10);
	
	g.setColor(Color.yellow);
	g.fillRect(120, 60, 10, 10);
	
	g.setColor(Color.yellow);
	g.fillRect(130, 60, 10, 10);
	
	g.setColor(Color.yellow);
	g.fillRect(140, 60, 10, 10);
	
	g.setColor(Color.yellow);
	g.fillRect(110, 50, 10, 10);
	
	g.setColor(Color.yellow);
	g.fillRect(150, 50, 10, 10);
	
	g.setColor(cor);
	g.fillOval(10, 90, 40, 40);
	
	g.setColor(Color.CYAN);
	g.fillOval(15, 95, 30, 30);
	
	g.setColor(cor);
	g.fillOval(60, 90, 40, 40);
	
	g.setColor(Color.CYAN);
	g.fillOval(65, 95, 30, 30);
	
	
	
	}

}
