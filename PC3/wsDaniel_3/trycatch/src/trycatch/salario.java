package trycatch;

import javax.swing.JOptionPane;

public class salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario, descA, descB;
		
		try {
		salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu salário: "));
			if ()
		}catch(IllegalArgumentException erro){
		 //Apresenta mensagem personalizada
		   JOptionPane.showMessageDialog(null,
				"Digite apenas números","Tipo invalido", 0);
		   //Apresenta msg gerada exception NumberFormatException
		   JOptionPane.showMessageDialog(null, erro.getMessage());
		   //Recupera a listagem da pilha de erro gerada
		   JOptionPane.showMessageDialog(null,erro.getStackTrace());
		   //Apresenta console a listagem da pilha de erro gerada
		   erro.printStackTrace();
	    }finally {
		   JOptionPane.showMessageDialog(null,"Mensagem do Finally do método entrada" ,
					                                 "Finally - por aqui sempre passa" ,0);
			
		}
	}

}
