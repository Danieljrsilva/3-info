package livraria;

import javax.swing.JOptionPane;

public class Livro extends Produto {
	private String autor;
	private String editora;
	private String edicao;

	public Livro() {
		this("","", 0, 0f, "", "", "");
	}

	public Livro(String descricao, String genero, int estoque, float custo,
			String autor, String editora, String edicao) {
		super(descricao, genero, estoque, custo);
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public void Listar() {
		JOptionPane.showMessageDialog(null, "Livro: " + 
		  "\ndescricao: " + this.getDescricao() +
		  "\ngenero: " + this.getGenero() +
		  "\nestoque: " + this.getEstoque() +
		  "\ncusto: " + this.getCusto() + 
		  "\nautor: " + this.getAutor() +
		  "\neditora: " + this.getEditora() +
		  "\nedição: " + this.getEdicao());
	}
}
