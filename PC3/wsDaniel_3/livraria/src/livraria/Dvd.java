package livraria;

import javax.swing.JOptionPane;

public class Dvd {
	public String diretor;
	public String duracao;
	public String censura;
	
	public Dvd(String string, String string2, int i, float f, String string3, String string4, String string5) {
		this("","","");
	}

	public Dvd(String diretor, String duracao, String censura) {
		this.diretor = diretor;
		this.duracao = duracao;
		this.censura = censura;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getCensura() {
		return censura;
	}

	public void setCensura(String censura) {
		this.censura = censura;
	}
	public void Listar() {
		JOptionPane.showMessageDialog(null, "DVD: " + 
		  "\ndiretor: " + this.getDiretor() +
		  "\nduracao: " + this.getDuracao() +
		  "\ncensura: " + this.getCensura());
	}
}
