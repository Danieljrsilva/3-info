import javax.swing.JOptionPane;

public class BissextoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub						
		int Ano, Aux;
		String res;
						
		do {
			Ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um ano desejado: "));
						
			Aux = Ano;	
			if(Ano % 100 == 0) {
     		  Aux = Ano/100;
		    }
		    if(Aux % 4 == 0) {
		      res = "sim é ";
	        }else
		      res = "nao é ";
							
			JOptionPane.showMessageDialog(null, "O Ano " + Ano  + "\n" + res + " Bissexto ");
						
		}while(Aux!=0);	
	}
}

			

	


