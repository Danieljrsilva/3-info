package trycath;

import javax.swing.JOptionPane;

public class Principal {//1

	public static void main(String[] args) {//2
	  Pessoa pes = new Pessoa();
	  
	  int op;
	  do {//3
		 op = Integer.parseInt(JOptionPane.showInputDialog(null, "digite: " + "\n1-listar\n2-cadastrar " + 
	                                                                         "\n0 - sair 0", "menu" , 1));
		 switch(op) {//4
		 case 1:
			pes.listar();
		   break;
		 case 2:
			pes.Cadastrar();
		   break;
		 case 3:
			pes.Cadastrar();
		   break;  
		 case 0:
		   break;
		 default:
		   JOptionPane.showInputDialog(null, "opção invalida");
		 }//4
	  }while(op != 0);//3
   }//2
}//1
