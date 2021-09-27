package trycatch;

import javax.swing.JOptionPane;

public class Caixa4 {
	private double saldo;
	
	public Caixa4() {
	  this(0d);
	}

	public Caixa4(double saldo) {
      this.saldo = saldo;
	}

	public double getSaldo() {
	  return this.saldo;
	}

	public void setSaldo(double saldo) {
	  this.saldo = saldo;
	}
	
	//Trata erro se usuario digitar algo dif de numeros
	public void Entrar() throws Zero, Negativo{
	  try {
		 double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da entrada: "));
		 if (valor == 0) {
			throw new Zero();
		 }
		 if(valor < 0) {
			 throw new Negativo();
		 }
		 this.setSaldo(this.getSaldo() + valor);
	  }catch(IllegalArgumentException  erro) {
		  //Apresenta mensagem personalizada
		  JOptionPane.showMessageDialog(null,"Digite apenas números ", "Tipo invalido" ,0);
	  }finally {
		 JOptionPane.showMessageDialog(null,"saldo: " +this.getSaldo(),"Finally", 0);
	  }
	}

}



