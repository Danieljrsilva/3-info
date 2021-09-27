import javax.swing.JOptionPane;

public class Caixa2 {
	private double saldo;

	public  Caixa2() {
		this(0f);
	}

	public Caixa2 (double saldo) {
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
}
