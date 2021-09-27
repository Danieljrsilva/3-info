import javax.swing.JOptionPane;

public class caixa {//1	
	private double saldo;

	public caixa() {
		this(0f);
	}

	public caixa(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void entrar(){
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de entrada: "));
		this.setSaldo(this.getSaldo() + valor);
	}
	public void retirar(){
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de retirada: "));
		this.setSaldo(this.getSaldo() - valor);
	}
	
}//1
