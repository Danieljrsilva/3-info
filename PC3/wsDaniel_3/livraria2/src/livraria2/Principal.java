package livraria2;

import javax.swing.JOptionPane;

import livraria2.Livro;

public class Principal {//1
		public static void main(String[] args) {//2
		    Livro liv1 = new Livro("inferno", "ação", 10, 79.9f, 0f, "dan brown", "arqueiro", "7ª");
		    Cd cd1 =  new Cd("Powerslave", "Rock", 15, 25.0f , 0f, "Iron Maiden", "Universal Music", "Brasil");
		    Dvd dvd1 = new Dvd("Outro lado da porta", "Musical", 15, 29.9f, 0f, "Robert Brandon", "2 horas", "Livre");
		    int op, op1, qtde;
		    float dolar;
		    do {//3
		    	op = Integer.parseInt(JOptionPane.showInputDialog(null,
		    			"digite a opçao desejada:\n1-Livro\n2-CD" + "\n3-DVD\n0-Sair", "Menu Principal", 1));
		    switch(op) {//4
		    case 1://inicio do livro
		    	 do {//5
		    	    	op1 = Integer.parseInt(JOptionPane.showInputDialog(null,
		    	    			"digite a opçao desejada:\n1-Comprar\n2-Vender" + "\n3-Listar\n4-Calcular" + "\n0-Sair", "Menu Livro", 1));
		    	    switch(op1) {//6
		    	    case 1:
		    	    	qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada"));
		    	    	liv1.Comprar(qtde);
		  
		    	    	break;
		    	    	
		    	    case 2:
		    	    	qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida"));
		    	    	liv1.Vender(qtde);
		    	    	break;
		    	    	
		    	    case 3:
		    	    	liv1.Listar();
		    	    	break;
		    	    case 4:
		    	    	liv1.Calcular();
		    	    	break;
		    	    	
		    	    case 0:
		    	    	
		    	    	break;
		    	    	
		    	    	default:
		    	    		JOptionPane.showMessageDialog(null, "Opção invalida!!!!");
		    	    		break;
		    	          }//6
		    	       }while(op1 != 0);//5
		    	break;//fim do livro
		    	
		    case 2://inicio do CD
		    	 do {//7
		    	    	op1 = Integer.parseInt(JOptionPane.showInputDialog(null,
		    	    			"digite a opçao desejada:\n1-Comprar\n2-Vender\n3-Listar\n4-Calcular" + "\n0-Sair", "CD", 1));
		    	    switch(op1) {//8
		    	    case 1:
		    	    	qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada"));
		    	    	cd1.Comprar(qtde);
		  
		    	    	break;
		    	    	
		    	    case 2:
		    	    	qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida"));
		    	    	cd1.Vender(qtde);
		    	    	break;
		    	    	
		    	    case 3:
		    	    	cd1.Listar();
		    	    	break;
		    	    case 4:
		    	    	cd1.Calcular();
		    	    	break;
		    	    	
		    	    case 0:
		    	    	
		    	    	break;
		    	    	
		    	    	default:
		    	    		JOptionPane.showMessageDialog(null, "Opção invalida!!!!");
		    	    		break;
		    	          }//8
		    	       }while(op1 != 0);//7
		    	break;//fim do CD
		    	
		    case 3://inicio do DVD
		    	 do {//9
		    	    	op1 = Integer.parseInt(JOptionPane.showInputDialog(null,
		    	    			"digite a opçao desejada:\n1-Comprar\n2-Vender\n3-Listar\n4-Calcular" + "\n5-Calcular dolar" 
		    	    	+ "\n0-Sair", "DVD", 1));
		    	    switch(op1) {//10
		    	    case 1:
		    	    	qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada"));
		    	    	dvd1.Comprar(qtde);
		  
		    	    	break;
		    	    	
		    	    case 2:
		    	    	qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida"));
		    	    	dvd1.Vender(qtde);
		    	    	break;
		    	    	
		    	    case 3:
		    	    	dvd1.Listar();
		    	    	break;
		    	    case 4:
		    	    	dvd1.Calcular();
		    	    	break;
		    	    case 5:
		    	    	dolar = Float.parseFloat(JOptionPane.showInputDialog("Digite a cotação do dolar"));
		    	    	dvd1.Calcular(dolar);
		    	    	break;	
		    	    case 0:
		    	    	break;
		    	    	default:
		    	    		JOptionPane.showMessageDialog(null, "Opção invalida!!!!");
		    	    		break;
		    	          }//10
		    	       }while(op1 != 0);//9
		    	break;//fim do DVD
		    case 0:
		    	break;
		    	default:
		    		JOptionPane.showMessageDialog(null, "Opção invalida!!!!");
		    		break;
		          }//4
		       }while(op != 0);//3
			}//2
		}//1
