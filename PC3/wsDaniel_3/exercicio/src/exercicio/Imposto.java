package exercicio;

import javax.swing.JOptionPane;

public class Imposto {
	private float vinss;
	private float virpf;
	private float pinss;
	private float pirrpf;
	private float fgts;
	private float bruto;
	private float liq;
	private float liqinss;
	private float liqdep;
	private float sal;
	private int dep;
	
	public Imposto() {
		this(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0);
	}

	public Imposto(float vinss, float virpf, float pinss,
			float pirrpf, float fgts, float bruto, float liq,
			float liqinss, float liqdep, float sal, int dep){
		this.vinss = vinss;
		this.virpf = virpf;
		this.pinss = pinss;
		this.pirrpf = pirrpf;
		this.fgts = fgts;
		this.bruto = bruto;
		this.liq = liq;
		this.liqinss = liqinss;
		this.liqdep = liqdep;
		this.sal = sal;
		this.dep = dep;
	}

	public float getVinss() {
		return vinss;
	}

	public void setVinss(float vinss) {
		this.vinss = vinss;
	}

	public float getVirpf() {
		return virpf;
	}

	public void setVirpf(float virpf) {
		this.virpf = virpf;
	}

	public float getPinss() {
		return pinss;
	}

	public void setPinss(float pinss) {
		this.pinss = pinss;
	}

	public float getPirrpf() {
		return pirrpf;
	}

	public void setPirrpf(float pirrpf) {
		this.pirrpf = pirrpf;
	}

	public float getFgts() {
		return fgts;
	}

	public void setFgts(float fgts) {
		this.fgts = fgts;
	}

	public float getBruto() {
		return bruto;
	}

	public void setBruto(float bruto) {
		this.bruto = bruto;
	}

	public float getLiq() {
		return liq;
	}

	public void setLiq(float liq) {
		this.liq = liq;
	}

	public float getLiqinss() {
		return liqinss;
	}

	public void setLiqinss(float liqinss) {
		this.liqinss = liqinss;
	}

	public float getLiqdep() {
		return liqdep;
	}

	public void setLiqdep(float liqdep) {
		this.liqdep = liqdep;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public int getDep() {
		return dep;
	}

	public void setDep(int dep) {
		this.dep = dep;
	}
	
	public void Cadastrar(float sal) {
		this.setBruto(sal);
		this.setDep(dep);
	}
	
	public void Calc() {
		this.getFgts();
		JOptionPane.showMessageDialog(null, "Calculado");
	}
	
	public void Fgts() {
		this.setFgts(this.getBruto() * 0.08f);
	}
	public void Listar() {
	JOptionPane.showMessageDialog(null,
			"Salário Bruto: " + this.getBruto() +
			"\nFgts: " + this.getFgts() +
			"\nInss: " + this.getPinss() + "%, valor: " +
			this.getVinss() + "\nSalário Líquido sem "
			+ "Inss: " + this.getLiqinss() +
			"\nSalário Líquido desconto " + this.getDep() +
			" Dependentes: " + this.getLiqdep() +
			"\nirpf: " + this.getPirrpf() + "%, valor: " +
			this.getVirpf() + "\nSalário Líquido: " +
			this.getLiq());
	
	/*public void inss() {
	 if(sal <= 1693.72) {	
	 */
	}
   }
	
