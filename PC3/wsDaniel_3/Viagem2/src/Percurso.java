import javax.swing.JOptionPane;

public class Percurso {
	private float kmini,kmfim,vlrlitro,qtlitro,vlrpedag;
	private int qtpedag;
	private String Tcomb;
	public Percurso() {
		this(0f, 0f, 0f, 0f, 0f, 0,"");
	}

	public Percurso(float kmini, float kmfim, float vlrlitro, float qtlitro,
							float vlrpedag, int qtpedag, String Tcomb) {
		super();
		this.kmini = kmini;
		this.kmfim = kmfim;
		this.vlrlitro = vlrlitro;
		this.qtlitro = qtlitro;
		this.vlrpedag = vlrpedag;
		this.qtpedag = qtpedag;
		this.Tcomb = Tcomb;
	}

	public float getKmini() {
		return this.kmini;
	}

	public void setKmini(float kmini) {
		this.kmini = kmini;
	}

	public float getKmfim() {
		return this.kmfim;
	}

	public void setKmfim(float kmfim) {
		this.kmfim = kmfim;
	}

	public float getVlrlitro() {
		return this.vlrlitro;
	}

	public void setVlrlitro(float vlrlitro) {
		this.vlrlitro = vlrlitro;
	}

	public float getQtlitro() {
		return this.qtlitro;
	}

	public void setQtlitro(float qtlitro) {
		this.qtlitro = qtlitro;
	}

	public float getVlrpedag() {
		return this.vlrpedag;
	}

	public void setVlrpedag(float vlrpedag) {
		this.vlrpedag = vlrpedag;
	}

	public float getQtpedag() {
		return this.qtpedag;
	}

	public void setQtpedag(int qtpedag) {
		this.qtpedag = qtpedag;
	}
	
	public String getTcomb() {
		return this.Tcomb;
	}

	public void setTcomb(String tcomb) {
		this.Tcomb = tcomb;
	}

	public void cadastrar() {
		this.setKmini(Float.parseFloat(
				JOptionPane.showInputDialog(null,
						"digite o valor da Kilometragem inicial")));
		this.setKmfim(Float.parseFloat(
				JOptionPane.showInputDialog(null,
						"digite o valor da kilometragem final")));
		this.setVlrlitro(Float.parseFloat(
				JOptionPane.showInputDialog(null,
						"digite o valor de litros de gasolina")));
		this.setQtlitro(Float.parseFloat(
				JOptionPane.showInputDialog(null,
						"digite a quantidade de litros")));
		this.setVlrpedag(Float.parseFloat(
				JOptionPane.showInputDialog(null,
						"digite o valor do pedagio")));
		this.setQtpedag(Integer.parseInt(
				JOptionPane.showInputDialog(null,
						"digite a quantidade de pedagios")));
		this.setTcomb(JOptionPane.showInputDialog(null,
						"digite a quantidade de pedagios"));
				
	}

	public void listar(Custos cust) {
		JOptionPane.showMessageDialog(null,
				"\nkm inicial: " + this.getKmini() +
				"\nKm final: " + this.getKmfim() +
				"\nValor de litros: " + this.getVlrlitro() +
				"\n Tipo de combustivel é : " + this.getTcomb() +
				"\nQuantidade de Litros: " + this.getQtlitro() +
				"\nValor do pedagio: " + this.getVlrpedag() +
				"\nQuantidade de pedagios: " + this.getQtpedag() +
				"\nTotal Percurso: " + cust.getTotpercurso() +
				"\nTotal Consumo do Carro : " + cust.getConsumo() +
				"\nTotal Combustivel: " + cust.getTotcomb() +
				"\nTotal Pedagios: " + cust.getTotpedag() +
				"\nTotal: " + cust.getTotal());		
	}
	
	
}
