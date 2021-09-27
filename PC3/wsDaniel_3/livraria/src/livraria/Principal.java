package livraria;

import javax.swing.JOptionPane;

public class Principal {//1

	public static void main(String[] args) {//2
	  Livro liv1 = new Livro ("inferno", "ação", 10, 79.9f,
			  "dan brown", "arqueiro", "7ª");
	  CD cd1 = new CD ("Powerslave", "rock", 15, 25.0f,
			  "Iron maiden", "Universal Music", "Brasil");
	  Dvd dvd1 = new Dvd ("Lado da Porta", "Musical", 15, 25.0f,
			  "Iron maiden", "Universal Music", "Brasil");
	  int op, op1 = 0, qtde = 0;
	  do {//3
		  op = Integer.parseInt(JOptionPane.showInputDialog(null,
				  "Digite a opção desejada: \n1-livro\n2-cd"
				  + "\n3-dvd\n0-sair", "menu principal", 1));
		  switch(op) {//4
		  case 1:
			do {//5 inicio livro
			   op = Integer.parseInt(JOptionPane.showInputDialog(null,
				  "Digite a opção desejada: \n1-comprar\n2-vender"
				  + "\n3-listar\n0-sair", "menu livro", 1));
			   switch(op1) {//6
			   case 1:
				  qtde = Integer.parseInt(JOptionPane.showInputDialog(
						 "digite a quantidade comprada"));
				  liv1.Comprar(qtde);	  
				  break;
			   case 2:
				  qtde = Integer.parseInt(JOptionPane.showInputDialog(
						 "digite a quantidade vendida"));
				  liv1.Vender(qtde);	  
				  break;
			   case 3:
				  liv1.Listar();	  
				  break;
			   case 0:
					  
				  break;
			   default:
			     JOptionPane.showMessageDialog(null, "opção invalida");
			      break;
			   }//6
	        }while(op !=0);//5
  
			 break;
		  case 2:
			  
			 break;
		  case 3:
			  
			 break;
		  case 0:
			  
			 break;
		  default:
		    JOptionPane.showMessageDialog(null, "opção invalida");
		     break;
		  }//4
	  }while(op !=0);

	}//2
}//1
