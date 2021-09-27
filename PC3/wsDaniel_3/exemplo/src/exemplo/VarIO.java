package exemplo;

import javax.swing.JOptionPane;

public class VarIO {//1

	public static void main(String[] args) {//2
		//String = Caractere
		        String nome;
		        //int = inteiro
				int idade;
			    nome = JOptionPane.showInputDialog("digite seu nome");
			    idade = Integer.parseInt(JOptionPane.showInputDialog("digite seu idade"));
			    JOptionPane.showMessageDialog(null, "nome: " + nome + "\nidade: " + idade);
			} //2
			
		}//1
	


