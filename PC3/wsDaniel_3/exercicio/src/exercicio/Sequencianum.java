package exercicio;
import javax.swing.JOptionPane;
public class Sequencianum {//1

	public static void main(String[] args) {//2
		// TODO Auto-generated method stub
		int i=1, j=1, fim;
		String tudo = "";
		
		 fim = Integer.parseInt(JOptionPane.showInputDialog("digite numero final "));
		 
		 do {
		   tudo += " " + j;
		   j += i;
		   i++;
		 }while (i <= fim);
		 JOptionPane.showMessageDialog(null, tudo);
		 
		
		
	
			
		

	}//2

}//1
