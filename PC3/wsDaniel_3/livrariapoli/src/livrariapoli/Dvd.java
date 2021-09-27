package livrariapoli;

import javax.swing.JOptionPane;

public class Dvd extends Produto {
	private String diretor;
	private String duracao;
	private String censura;
	
	public Dvd() {
		this("", "", 0, 0f, 0f, "", "", "");
	}
	public Dvd(String descricao, String genero, int estoque, float custo, float venda,
			String diretor, String duracao, String censura) {
		super(descricao, genero, estoque, custo, venda);
		this.diretor = diretor;
		this.duracao = duracao;
		this.censura = censura;
	}
	public String getDiretor() {
		return this.diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getDuracao() {
		return this.duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getCensura() {
		return this.censura;
	}
	public void setCensura(String censura) {
		this.censura = censura;
	}
	@Override
	public void Listar() {
		JOptionPane.showMessageDialog(null, "Cd: " +
				"\nDescrição: " + this.getDescricao() +
				"\nGenero: " + this.getGenero() +
				"\nEstoque: " + this.getEstoque() +
				"\nCusto: " + this.getCusto() +
				"\nVenda: " + this.getVenda() +
				"\nDiretor: " + this.getDiretor() +
				"\nDuracao: " + this.getDuracao() +
				"\nCensura: " + this.getCensura());
		
	}
	@Override
	public void Calcular() {
		this.setVenda(this.getCusto() * 1.3f);
		JOptionPane.showMessageDialog(null, "Custo: " +
				this.getCusto() + "\n30% - Venda: " + this.getVenda());
		
	}
	
	
}
