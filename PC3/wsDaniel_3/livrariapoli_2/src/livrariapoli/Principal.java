package livrariapoli;

import javax.swing.JOptionPane;

public class Principal {//1

	public static void main(String[] args) {//2
		Livro liv1 = new Livro("inferno", "a��o", 10, 79.9f , 0f, "dan brown", "arqueiro", "7�");
		Gerenciador ctr = new Gerenciador();
		int qtd, op, op1;
		String opt[] = {"livro", "cd", "dvd", "sair"};
		String opt1[] = {"listar", "comprar", "vender", "encomendar" ,"calcular", "voltar"};
		float dolar;
		do {//3
			op = JOptionPane.showOptionDialog(null, "escolha a opcao", "menu principal",1, -1, null, opt, opt );
					
			switch(op) {//4
			case 0://inicio do livro
				do {//5
					op1 = JOptionPane.showOptionDialog(null, "escolha" + " a opcao desejada: ", "menu principal",1, -1, null, opt1, opt1);
					
					switch(op1) {//6
					case 0:
						liv1.Listar();
						break;
					case 1:
						ctr.Comprar(liv1);
						break;
					case 2:
						ctr.Vender(liv1);
						break;
					case 3:
						ctr.Encomendar(liv1);
						break;
					case 4:
						liv1.Calcular();
						break;
					case 5:
						JOptionPane.showMessageDialog(null, "sair");
						break;
					default:
						JOptionPane.showMessageDialog(null, "op��o invalida");
						break;
					}//6
				}while(op1 != 5);//5
			break;
			}//4
		}while(op != 3);//3

	}//2

}//1
