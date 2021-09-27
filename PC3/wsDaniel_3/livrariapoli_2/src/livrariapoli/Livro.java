package livrariapoli;

import javax.swing.JOptionPane;

public class Livro extends Produto {
	private String autor;
	private String editora;
	private String edicao;

	public Livro() {
		this("", "", 0, 0f, 0f, "", "", "");
	}

	public Livro(String descricao, String genero, int estoque, float custo, float venda,
			String autor, String editora, String edicao) {
		super(descricao, genero, estoque, custo, venda);
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return this.editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getEdicao() {
		return this.edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	@Override
	public void Listar() {
		JOptionPane.showMessageDialog(null, "Livro: " +
				"\nDescri��o: " + this.getDescricao() +
				"\nGenero: " + this.getGenero() +
				"\nEstoque: " + this.getEstoque() +
				"\nCusto: " + this.getCusto() +
				"\nVenda: " + this.getVenda() +
				"\nAutor: " + this.getAutor() +
				"\nEditora: " + this.getEditora() +
				"\nEdi��o: " + this.getEdicao());
	}

	@Override
	public void Calcular() {
		this.setVenda(this.getCusto() * 1.3f);
		JOptionPane.showMessageDialog(null, "Custo: " +
				this.getCusto() + "\n30% - Venda: " + this.getVenda());
	}

}
