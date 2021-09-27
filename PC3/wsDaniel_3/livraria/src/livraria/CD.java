package livraria;

import javax.swing.JOptionPane;

public class CD {
	private String artista;
	private String gravadora;
	private String paisOrigem;
	
	public CD(String string, String string2, int i, float f, String string3, String string4, String string5) {
		this("","","");
	}

	public CD(String artista, String gravadora, String paisOrigem) {
		this.artista = artista;
		this.gravadora = gravadora;
		this.paisOrigem = paisOrigem;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public void Listar() {
		JOptionPane.showMessageDialog(null, "CD: " + 
		  "\nartista: " + this.getArtista() +
		  "\ngravadora: " + this.getGravadora() +
		  "\nPais de Origem: " + this.getPaisOrigem());
	}
}
