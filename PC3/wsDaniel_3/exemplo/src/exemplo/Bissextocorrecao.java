package exemplo;

import javax.swing.JOptionPane;

public class Bissextocorrecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Ano, A4, A400, A100;
		String res;
		
		do {//3
			Ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um ano desejado: \n0 para sair "));
			A4 = Ano % 4;
			A400 = Ano % 400;
			A100 = Ano % 100;
			
			if ((A4 == 0 && A100 != 0) || (A400 == 0)) {
				res = " Sim ";
			}else {
				res = " Não ";
			}
			
			JOptionPane.showMessageDialog(null, "O Ano " + Ano  + "\n" + res + " Bissexto ");
			
		}while(Ano != 0);//3

	}

}
