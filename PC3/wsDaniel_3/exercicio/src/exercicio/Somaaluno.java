package exercicio;

import javax.swing.JOptionPane;

public class Somaaluno {//1

	public static void main(String[] args) {//2
		// TODO Auto-generated method stub
		int i, s=0, num1, num2;
		String tudo = "";
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1° numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 2° numero"));
		
		
		for(i=num1; i<=num2; i++) {//6
		  tudo += "\nnro: " + i;
		  s+=i;	
		}//6
		JOptionPane.showMessageDialog(null, tudo + "\nsoma: " + s);
		
  }//2
}//1
