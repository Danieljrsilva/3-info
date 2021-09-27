import javax.swing.JOptionPane;

public class custos {
	private float total;
	
	
	public custos() {
		this(0f);
	}

	public custos(float total) {
		this.total = total;
	}

	public float gettotal() {
		return this.total;
	}

	public void settotal(float total) {
		this.total = total;
	}
	
	public void calcular(percurso p) {
		this.settotal(p.getKm() * p.getComb() + p.getPed());
		JOptionPane.showMessageDialog(null,
				"total: " + this.gettotal());
	}
}
