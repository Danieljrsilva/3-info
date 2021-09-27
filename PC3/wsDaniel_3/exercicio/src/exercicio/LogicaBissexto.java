package exercicio;

import javax.swing.JOptionPane;

public class LogicaBissexto {//1

	public static void main(String[] args) {//2
		// TODO Auto-generated method stub
		String  resp;
		int Ano;
		
		Ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um ano: "));
		
	    if ( ( Ano % 4 == 0 && Ano % 100 != 0 ) || ( Ano % 400 == 0 ) ){
          resp=" Esse ano é bissexto";
	    }else{
          resp="Não é um ano bissexto";
        }
	    
	    JOptionPane.showMessageDialog(null, " Ano " + Ano  +  resp + " Bissexto ");
	    

	}//2

}//1
