package livraria2;

import javax.swing.JOptionPane;

public class Livro extends Produto {
    private String autor;
    private String editora;
    private String edicao;
    public Livro() {
		  this("", "", 0, 0f, 0f, "", "", "");
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


	public Livro(String descricao, String genero, int estoque, float custo, float venda, 
			String autor, String editora, String edicao) {
		super(descricao, genero, estoque, custo, venda);
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Listar() {
		// TODO Auto-generated method stub
  JOptionPane.showMessageDialog(null, "Livro: " + 
		"\nDescrição: " + this.getDescricao() + 
		"\nGenero: " + this.getGenero() + 
		"\nEstoque: " + this.getEstoque() + 
		"\nCusto: " + this.getCusto() + 
		"\nVenda: " + this.getVenda() +
		"\nAutor: " + this.getAutor() +
		"\nEditora: " + this.getEditora() +
		"\nEdição: " + this.getEdicao());
	}

	@Override
	public void Calcular() {
		// TODO Auto-generated method stub
    this.setVenda(this.getCusto() * 1.3f);
    JOptionPane.showMessageDialog(null, "Custo: " + this.getCusto() + "\n30% - Venda: " + this.getVenda());
	}

}
