package livrariapoli;

import javax.swing.JOptionPane;

public class Principal {//1

	public static void main(String[] args) {//2
		Livro liv1 = new Livro("inferno", "a��o", 10, 79.9f , 0f, "dan brown", "arqueiro", "7�");
		Cd cd1 =  new Cd("Powerslave", "Rock", 15, 25.0f , 0f, "Iron Maiden", "Universal Music", "Brasil");
	    Dvd dvd1 = new Dvd("Outro lado da porta", "Musical", 15, 29.9f, 0f, "Robert Brandon", "2 horas", "Livre");
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
						break;
					default:
						op1=5;
						break;
					}//6
				}while(op1 != 5);//5
			break;
			}//4
			switch(op) {//4
			case 1://inicio do livro
				do {//5
					op1 = JOptionPane.showOptionDialog(null, "escolha" + " a opcao desejada: ", "menu principal",1, -1, null, opt1, opt1);
					
					switch(op1) {//6
					case 0:
						cd1.Listar();
						break;
					case 1:
						ctr.Comprar(cd1);
						break;
					case 2:
						ctr.Vender(cd1);
						break;
					case 3:
						ctr.Encomendar(cd1);
						break;
					case 4:
						cd1.Calcular();
						break;
					case 5:
						break;
					default:
						op1=5;
						break;
					}//6
				}while(op1 != 5);//5
			break;
			}//4
			switch(op) {//4
			case 2://inicio do livro
				do {//5
					op1 = JOptionPane.showOptionDialog(null, "escolha" + " a opcao desejada: ", "menu principal",1, -1, null, opt1, opt1);
					
					switch(op1) {//6
					case 0:
						dvd1.Listar();
						break;
					case 1:
						ctr.Comprar(dvd1);
						break;
					case 2:
						ctr.Vender(dvd1);
						break;
					case 3:
						ctr.Encomendar(dvd1);
						break;
					case 4:
						dvd1.Calcular();
						break;
					case 5:
						break;
					default:
						op1=5;
						break;
					}//6
				}while(op1 != 5);//5
			break;
			}//4
		}while(op != 3);//3

	}//2

}//1
