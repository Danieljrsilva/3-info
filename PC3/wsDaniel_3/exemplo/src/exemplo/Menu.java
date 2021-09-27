package exemplo;
import javax.swing.JOptionPane;
public class Menu {//1

	public static void main(String[] args) {//2
	  int op;
	  do {//3
	    op = Integer.parseInt(JOptionPane.showInputDialog(null,"digite:\n1\n2\n3\n0 - sair", "menu",0));	
		switch(op) {//4
		case 1:
		  JOptionPane.showMessageDialog(null,"Voçê digitou 1" );
		  break;
		case 2:
		  JOptionPane.showMessageDialog(null,"Voçê digitou 2" );
		  break;
		case 3:
		  JOptionPane.showMessageDialog(null,"Voçê digitou 3" );
		  break;
		case 0:
		  JOptionPane.showMessageDialog(null,"Voçê digitou 0 para sair " );
		  break;
		default:
		  JOptionPane.showMessageDialog(null,"Voçê digitou um numero invàlido " );
		  break;
      }//4
	}while(op!=0);//3
  }//2
}//1
