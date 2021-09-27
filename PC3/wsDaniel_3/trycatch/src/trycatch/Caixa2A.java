package trycatch;

import javax.swing.JOptionPane;

public class Caixa2A {
	private double saldo;

	public Caixa2A() {
	  this(0d);
	}

	public Caixa2A(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Trata erro se usuario digite algo dif de numeros
	public void Entrar() {
	   try {
		 this.setSaldo(this.getSaldo() + Double.parseDouble(JOptionPane.showInputDialog(null,
				 "Digite o valor da entrada: ")));
	   /*Se usuario digitar caracteres o Java irá
	    gerar um erro de tipo de dado invalido */
	   }catch(NumberFormatException erro) {
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
