package exemplo;

import javax.swing.JOptionPane;

public class Soma {//1 - classe executavel
	
	public static void main(String[] args) {//2 - metodo
		//int = inteiro
		int idade1, idade2, media;
		
	    idade1 = Integer.parseInt(JOptionPane.showInputDialog("digite seu idade"));
	    idade2 = Integer.parseInt(JOptionPane.showInputDialog("digite seu idade"));
	    media = idade1+idade2;
	    JOptionPane.showMessageDialog(null, "A soma é: " + media);
	   
	} //2
	
}//1

	

	


