import javax.swing.JOptionPane;

public class percurso {//1- inicio da classe de modelagem
	private float km, comb, ped;//atributos encapsulados
	
	public percurso() {
		this(0f, 0f, 0f);
	}

	public percurso(float km, float comb, float ped) {
		this.km = km;
		this.comb = comb;
		this.ped = ped;
	}

	public float getKm() {
		return this.km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public float getComb() {
		return this.comb;
	}

	public void setComb(float comb) {
		this.comb = comb;
	}

	public float getPed() {
		return this.ped;
	}

	public void setPed(float ped) {
		this.ped = ped;
	}
	
	public void cadastrar() {
		this.setComb(Float.parseFloat(
				JOptionPane.showInputDialog(null,
						"digite o valor de combustivel")));
		this.setPed(Float.parseFloat(
				JOptionPane.showInputDialog(null,
						"digite o valor do pedagio")));
		this.setKm(Float.parseFloat(
				JOptionPane.showInputDialog(null,
						"digite a km percorrida")));		
	}
	
	public void listar() {
		JOptionPane.showMessageDialog(null,
				"km percorrida: " + this.getKm() +
				"valor do combustivel: " + this.getComb() +
				"valor do pedagio: " + this.getPed());
	}
	
}
