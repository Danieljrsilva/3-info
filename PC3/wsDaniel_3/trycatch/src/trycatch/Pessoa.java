package trycatch;

public class Pessoa {
	private String pessoa;
	
	String nome;
	int idade;
	float peso;
	boolean maior;
	
	public Pessoa() {
		
	}

	public Pessoa(String pessoa, String nome, int idade, float peso, boolean maior) {
		this.pessoa = pessoa;
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.maior = maior;
	}

	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public boolean isMaior() {
		return maior;
	}

	public void setMaior(boolean maior) {
		this.maior = maior;
	}

	public void listar() {
		// TODO Auto-generated method stub
		
	}

	public void Cadastrar() {
		// TODO Auto-generated method stub
		
	}

	
}
