package trycatch;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Imposto {
	
	DecimalFormat dec = new DecimalFormat("0.00");
	
	private float vinss;
	private float virpf;
	private float pinss;
	private float pirpf;
	private float dirpf;
	private float fgts;
	private float bruto;
	private float liq;
	private float liqinss;
	private float liqdep;
	private int dep;

	
	
	public Imposto() {
		this(0f ,0f ,0f ,0f ,0f ,0f ,0f ,0f ,0f ,0f, 0);
	}
	public Imposto(float vinss, float virpf, float pinss,
			float pirpf, float dirpf, float fgts, float bruto, float liq,
			float liqinss, float liqdep, int dep) {
		this.vinss = vinss;
		this.virpf = virpf;
		this.pinss = pinss;
		this.pirpf = pirpf;
		this.dirpf = dirpf;
		this.fgts = fgts;
		this.bruto = bruto;
		this.liq = liq;
		this.liqinss = liqinss;
		this.liqdep = liqdep;
		this.dep = dep;
	}
	public Imposto(float f, float g, float h, float i, float j, float k, float l, float m, float n, float o, float p,
			int q) {
		// TODO Auto-generated constructor stub
	}
	public float getVinss() {
		return this.vinss;
	}
	public void setVinss(float vinss) {
		this.vinss = vinss;
	}
	public float getVirpf() {
		return this.virpf;
	}
	public void setVirpf(float virpf) {
		this.virpf = virpf;
	}
	public float getPinss() {
		return this.pinss;
	}
	public void setPinss(float pinss) {
		this.pinss = pinss;
	}
	public float getPirpf() {
		return this.pirpf;
	}
	public void setPirpf(float pirpf) {
		this.pirpf = pirpf;
	}
	public float getFgts() {
		return this.fgts;
	}
	public void setFgts(float fgts) {
		this.fgts = fgts;
	}
	public float getDirpf() {
		return this.dirpf;
	}
	public void setDirpf(float dirpf) {
		this.dirpf = dirpf;
	}
	public float getBruto() {
		return this.bruto;
	}
	public void setBruto(float bruto) {
		this.bruto = bruto;
	}
	public float getLiq() {
		return this.liq;
	}
	public void setLiq(float liq) {
		this.liq = liq;
	}
	public float getLiqinss() {
		return this.liqinss;
	}
	public void setLiqinss(float liqinss) {
		this.liqinss = liqinss;
	}
	public float getLiqdep() {
		return this.liqdep;
	}
	public void setLiqdep(float liqdep) {
		this.liqdep = liqdep;
	}
	public float getDep() {
		return this.dep;
	}
	public void setDep(int dep) {
		this.dep = dep;
	}
	public void Cal() {
	this.fgts();
		JOptionPane.showMessageDialog(null, "calulado");
	}	
	public void Listar() {
		JOptionPane.showMessageDialog(null,
				" bruto: "  + 
				dec.format(this.getBruto()) +
				" - fgts: " +
				dec.format(this.getFgts())  +
				"\ninss: "  +
				dec.format(this.getPinss() * 100f) +
				"\n%, valor: "  +
				dec.format(this.getVinss()) +
				"\nliquido s/inss "  + 
				dec.format(this.getLiqinss()) +
				"\nliquido " + this.getDep() +
				" dependente(s): " + 
				dec.format(this.getLiqdep()) +
				"\nirpf: " + 
				dec.format(this.getPirpf() * 100f) + 
				"%, valor: "                 +
				dec.format(this.getVirpf())  + 
				", \nparcela dedutivel: " + 
				dec.format(this.getDirpf()) +
				"\nliquido: " + 
				dec.format(this.getLiq()));
	}
	
	public void Cadastrar(float sal, int dep) {
		this.setBruto(sal);
		this.setDep(dep);
	}
	
	public void Calc() {
		this.fgts();
		this.Inss();
		this.Irpf();
		JOptionPane.showMessageDialog(null, "calculado");
	}
	
	public void fgts() {
		this.setFgts((float) (this.getBruto() * 0.08));
	}
	
	public void Inss() {
		if(this.getBruto() < 1693.73) {
			this.setPinss(0.08f);
		}else if (this.getBruto() < 2822.91) {
			this.setPinss(0.09f);
		}else if (this.getBruto() < 5645.81) {
			this.setPinss(0.11f);
		}else {
			this.setPinss(0);
		}
		
		if (this.getPinss() != 0 ) {
			this.setVinss(this.getBruto() * this.getPinss());
		}else {
			this.setVinss(621.04f);
		}
		
		this.setLiqinss(this.getBruto() - this.getVinss());
	}
	
	public void Irpf() {
		this.setLiqdep(this.getLiqinss() - this.getDep() * 189.59f);
		if(this.getLiqdep() < 1903.99f) {
			this.setPirpf(0f);
			this.setDirpf(0f);
		}else if(this.getLiqdep() < 2826.66) {
			this.setPirpf(0.075f);
			this.setDirpf(142.8f);
		}else if(this.getLiqdep() < 3751.06f) {
			this.setPirpf(0.15f);
			this.setDirpf(354.8f);
		}else if(this.getLiqdep() < 4664.69) {
			this.setPirpf(0.225f);
			this.setDirpf(636.13f);
		}else {
			this.setPirpf(0.275f);
			this.setDirpf(869.36f);
		}
		this.setVirpf(this.getLiqdep() * this.getPirpf() - this.getDirpf());
		this.setLiq(this.getLiqinss() - this.getVirpf());
	}
}
