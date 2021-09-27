package exemplo;

import javax.swing.JOptionPane;

public class Media {//1
	
	public static void main(String[] args) {//2
		//int = inteiro
		int idade1, idade2, idade3, media;
		
	    idade1 = Integer.parseInt(JOptionPane.showInputDialog("digite 1° idade"));
	    idade2 = Integer.parseInt(JOptionPane.showInputDialog("digite 2° idade"));
	    idade3 = Integer.parseInt(JOptionPane.showInputDialog("digite 3° idade"));
	    media = (idade1+idade2+idade3) / 3;
	    JOptionPane.showMessageDialog(null, "media: " + media);
	   
	} //2
	
}//1



