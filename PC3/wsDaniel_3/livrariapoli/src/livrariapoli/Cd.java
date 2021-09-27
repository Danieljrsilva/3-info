package livrariapoli;

import javax.swing.JOptionPane;

public class Cd extends Produto{
	private String artista;
	private String gravadora;
	private String paisOrigem;
		
	public Cd() {
		this("", "", 0, 0f, 0f, "", "", "");
	}
	public Cd(String descricao, String genero, int estoque, float custo, float venda,
			String artista, String gravadora, String paisOrigem) {
		super(descricao, genero, estoque, custo, venda);
		this.artista = artista;
		this.gravadora = gravadora;
		this.paisOrigem = paisOrigem;
	}
	
	public String getArtista() {
		return this.artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGravadora() {
		return this.gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public String getPaisOrigem() {
		return this.paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	
	@Override
	public void Listar() {
		JOptionPane.showMessageDialog(null, "Cd: " +
				"\nDescrição: " + this.getDescricao() +
				"\nGenero: " + this.getGenero() +
				"\nEstoque: " + this.getEstoque() +
				"\nCusto: " + this.getCusto() +
				"\nVenda: " + this.getVenda() +
				"\nArtista: " + this.getArtista() +
				"\nGravadora: " + this.getGravadora() +
				"\nPaisOrigem: " + this.getPaisOrigem());
		
	}
	@Override
	public void Calcular() {
		this.setVenda(this.getCusto() * 1.3f);
		JOptionPane.showMessageDialog(null, "Custo: " +
				this.getCusto() + "\n30% - Venda: " + this.getVenda());		
	}
	
	
	
}
