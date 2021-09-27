import javax.swing.JOptionPane;

public class Custos {
	private float totpercurso,totcomb,consumo,total,totpedag;
	public Custos() {
		this(0f,0f,0f,0f,0f);
	}
	public Custos(float totpercurso, float totcomb, float total, float totpedag, float consumo) {
		this.totpercurso = totpercurso;
		this.totcomb = totcomb;
		this.total = total;
		this.totpedag = totpedag;
		this.consumo = consumo;
	}
	public float getTotpercurso() {
		return this.totpercurso;
	}
	public void setTotpercurso(float totpercurso) {
		this.totpercurso = totpercurso;
	}
	public float getTotcomb() {
		return this.totcomb;
	}
	public void setTotcomb(float totcomb) {
		this.totcomb = totcomb;
	}
	public float getTotal() {
		return this.total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public float getTotpedag() {
		return this.totpedag;
	}
	public void setTotpedag(float totpedag) {
		this.totpedag = totpedag;
	}
	public float getConsumo() {
		return this.consumo;
	}
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}
	public void calcular(Percurso perc) {
		this.setTotpercurso(perc.getKmfim() - perc.getKmini());
		this.setTotcomb(perc.getVlrlitro() * perc.getQtlitro());
		this.setTotpedag(perc.getQtpedag() * perc.getVlrpedag());
		this.setConsumo(this.getTotpercurso() / perc.getQtlitro());
		this.setTotal(this.getTotpedag() + this.getTotcomb());
		JOptionPane.showMessageDialog(null,
				"Calculado!!! ");
		
	}
		
}
