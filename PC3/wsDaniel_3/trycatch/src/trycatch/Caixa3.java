package trycatch;

import javax.swing.JOptionPane;

public class Caixa3 {
	private double saldo;
	
	public Caixa3() {
	  this(0d);
	}

	public Caixa3(double saldo) {
      this.saldo = saldo;
	}

	public double getSaldo() {
	  return this.saldo;
	}

	public void setSaldo(double saldo) {
	  this.saldo = saldo;
	}
	
	//Trata erro se usuario digitar algo dif de numeros
	public void Entrar() {
	  try {
		 double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da entrada: "));
		 if (valor == 0 || valor < 0) {
			throw new IllegalArgumentException();
		 }
		 this.setSaldo(this.getSaldo() + valor);
	  }catch(IllegalArgumentException erro) {
		  JOptionPane.showMessageDialog(null,"A Movimentação não pode zero nem negativo! ", "Tipo invalido" ,0);
	  }finally {
		 JOptionPane.showMessageDialog(null,"saldo: " +this.getSaldo(),"Finally", 0);
	  }
	}

}
