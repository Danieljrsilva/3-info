package exemplo;

import javax.swing.JOptionPane;

public class IfElse {//1
	
	public static void main(String[] args) {//2
		//float = Real
		float nota1, nota2, media;
		//String = caractere 
		String situ, nome;
		nome = JOptionPane.showInputDialog("Digite seu nome");
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1° nota"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite 2° nota"));
		media = (nota1+nota2) / 2;
		
		if (media > 5) {//3 condicional se
		   situ = "aprovado"; // faz quando verdadeiro
		}else {//3
		   situ = "reprovado"; // faz quando falso
		}//3
	   
  		JOptionPane.showMessageDialog(null, "o aluno: " + nome + "\nesta: " + situ + "\ncom media: " + media);
		
	} //2
	
}//1
		
	


