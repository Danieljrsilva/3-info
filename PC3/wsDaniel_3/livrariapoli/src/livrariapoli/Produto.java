package livrariapoli;

//import javax.swing.JOptionPane;

public abstract class Produto {
	protected String descricao;
	protected String genero;
	protected int estoque;
	protected float custo;
	protected float venda;
	
	public Produto() {
		this("","", 0, 0f, 0f);
	}

	public Produto(String descricao, String genero, int estoque, float custo, float venda) {
		this.descricao = descricao;
		this.genero = genero;
		this.estoque = estoque;
		this.custo = custo;
		this.venda = venda;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEstoque() {
		return this.estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public float getCusto() {
		return this.custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	public float getVenda() {
		return this.venda;
	}

	public void setVenda(float venda) {
		this.venda = venda;
	}
	
	//public void Comprar(int qtp) {
		//JOptionPane.showMessageDialog(null, "estoque anterior: " +
			//	this.getEstoque() + "\nqtde comprada : " + qtp +
				//"\nestoque atual: " + (this.getEstoque() + qtp));
		//this.setEstoque(this.getEstoque() + qtp);
	//}
	
	//public void Vender(int qtp) {
		//JOptionPane.showMessageDialog(null, "estoque anterior: " +
			//	this.getEstoque() + "\nqtde vendida : " + qtp +
				//"\nestoque atual: " + (this.getEstoque() - qtp));
		//this.setEstoque(this.getEstoque() - qtp);
	//}
	
	public abstract void Listar();
	public abstract void Calcular();	
	
}
