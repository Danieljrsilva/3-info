package desenho;
import javax.swing.JFrame;
public class Linhas {
	public static void main(String[] args) {
		DesenhoLinha panel = new DesenhoLinha();
		/*DrawEscada esc = new DrawEscada();*/
		JFrame frame = new JFrame("linhas");
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setSize( 250, 250 );
		frame.setVisible( true );
		frame.add( panel );
		/*JFrame frame2 = new JFrame("linhas");
		frame2.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame2.setSize( 250, 250 );
		frame2.setVisible( true );
		frame2.add( panel );*/
	}
}
