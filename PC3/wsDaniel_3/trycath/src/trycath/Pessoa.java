package trycath;
import javax.swing.JOptionPane;

public class Pessoa {
	private String nome;
	private int idade;
	private float peso;
	private boolean maior;
	
	public Pessoa() {
	  this("", 0 ,0f ,false);
	}
	public Pessoa(String nome, int idade, float peso, boolean maior) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.maior = maior;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return this.peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public boolean isMaior() {
		return this.maior;
	}
	public void setMaior(boolean maior) {
		this.maior = maior;
	}
	
	public void listar() {
	  JOptionPane.showMessageDialog(null, "nome: " + this.getNome() +
			  "idade: " + this.getIdade() +
			  "peso: " + this.getPeso() +
			  "maior: " + this.isMaior());
	}
	
	public void Cadastrar() {
	  this.setNome(JOptionPane.showInputDialog(null,"digite seu nome"));
	  this.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"digite sua idade")));
	  this.setPeso(Float.parseFloat(JOptionPane.showInputDialog(null,"digite seu Peso")));
	  this.setMaior(Boolean.parseBoolean(JOptionPane.showInputDialog(null,"Voçe é maior?")));
	}
	
	
	
	

}
