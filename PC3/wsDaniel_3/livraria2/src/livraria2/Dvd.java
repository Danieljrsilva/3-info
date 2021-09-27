package livraria2;

import javax.swing.JOptionPane;

public class Dvd extends Produto {
	 private String diretor;
	 private String duracao;
	 private String sensura;
	 
	 public Dvd(){
		 this("", "", 0, 0f, 0f, "", "", "");
			}

	 public Dvd(String descricao, String genero, int estoque, float custo, float venda, 
				String diretor, String duracao, String sensura) {
			super(descricao, genero, estoque, custo, venda);
			this.diretor = diretor;
			this.duracao = duracao;
			this.sensura = sensura;
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

	public String getSensura() {
		return this.sensura;
	}

	public void setSensura(String sensura) {
		this.sensura = sensura;
	}

	@Override
	public void Listar() {
		JOptionPane.showMessageDialog(null, "Livro: " + 
				"\nDescrição: " + this.getDescricao() + 
				"\nGenero: " + this.getGenero() + 
				"\nEstoque: " + this.getEstoque() + 
				"\nCusto: " + this.getCusto() + 
				"\nVenda: " + this.getVenda() +
				"\nDiretor: " + this.getDiretor() +
				"\nDuracao: " + this.getDuracao() +
				"\nSensura: " + this.getSensura());
	}

	@Override
	public void Calcular() {
    this.setVenda(this.getCusto() * 1.5f);
    JOptionPane.showMessageDialog(null, "Custo: " + this.getCusto() + "\n50% - Venda: " + this.getVenda());
	}
    
	public void Calcular(float dolar) {
	    this.setVenda(this.getCusto() * 1.5f * dolar);
	    JOptionPane.showMessageDialog(null, "Custo: " + this.getCusto() + "\n50% - Venda: " + this.getVenda());
		}
	
}
