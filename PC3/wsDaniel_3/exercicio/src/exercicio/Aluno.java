package exercicio;

import javax.swing.JOptionPane;

public class Aluno {//1

	public static void main(String[] args) {//2
		// TODO Auto-generated method stub
		float nota1, nota2, media;
		//String = caractere 
		String situ, nome;
		nome = JOptionPane.showInputDialog("Digite seu nome");
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1° nota"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite 2° nota"));
		media = (nota1+nota2) / 2;
		
		//1 solução
		if (media > 7) {//3
		   situ = "Aprovado"; 
		}//3
		if (media > 5) {//4
		   situ = "recuperação";
		}//4
		if (media > 3) {//5
		   situ = "reprovado";
		}//5
		if (media <= 3) {//6
		   situ = "Expulso";
		}//6
		
		//2 solução
		if (media > 7) {
		   situ = "Aprovado"; 
		}else if(media > 5) {
		  situ = "Recuperação";	
		}else if(media > 3) {
		  situ = "Reprovado";	
		}else {
		  situ = "Expulso";	
		}
		//3 solução
		if(media > 7) {//1
		  situ = "Aprovado";	
		}else {//1
		  if(media > 5) {//2
			situ = "Recuperação";  
		  }else {//2
			if(media > 3) {//3
			  situ = "Reprovado";	
			}else {//3
			  situ = "Expulso";	
			}//3
		  }//2
		}//1
		
	   
  		JOptionPane.showMessageDialog(null, "o aluno: " + nome + "\nesta: " + situ + "\ncom media: " + media);
	}//2

}//1
