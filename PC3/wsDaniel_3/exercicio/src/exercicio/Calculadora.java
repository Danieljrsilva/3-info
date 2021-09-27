package exercicio;
import javax.swing.JOptionPane;
public class Calculadora {//1

	public static void main(String[] args) {//2
		// TODO Auto-generated method stub
		int op;
		float num1, num2, tot;
		  do {//3
		    op = Integer.parseInt(JOptionPane.showInputDialog(null,"digite:\n1-soma\n2-subtracao\n3-multiplicacao\n4-divizao\n0 - sair", "menu",0));	
			switch(op) {//4
			case 1:
			  num1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um numero para somar" ));
			  num2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um numero para somar" ));
			  tot = num1 + num2;
			  JOptionPane.showMessageDialog(null, "soma: " + tot);
			  break;
			case 2:
			  num1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um numero para subtrair" ));
			  num2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um numero para subtrair" ));
			  tot = num1 - num2;
			  break;
			case 3:
			  num1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um numero para multiplicar" ));
			  num2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um numero para multiplicar" ));
			  tot = num1 * num2;
			  break;
			case 4:
			  num1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um numero para dividir" ));
			  num2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite um numero para dividir" ));
			  tot = num1 / num2;
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

	

