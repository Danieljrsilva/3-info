package aluno;

import javax.swing.JOptionPane;

public class Usando_recursos {

	public static void main(String[] args) {
	   int op,n1,n2,tot1 = 0,tot2 = 0,tot3 = 0,tot4 = 0;
	   	   
		do {//3
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "1- soma\n2- subtra��o"+ "\n3- Diviz�o \n4- multiplica��o \n5-super calculo\"\n0-sair", "Selecione: ", 1));
																
			switch(op) {//4
			case 1:
				n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero para somar: "));
				n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo n�mero para somar: "));
				tot1 = n1+n2;
				JOptionPane.showMessageDialog(null,"Total da soma �: "+ tot1);
				break;
			case 2:
				n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero para subtrair: "));
				n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo n�mero para subtrair: "));
				tot2 = n1-n2;
				JOptionPane.showMessageDialog(null,"Total da subtra��o �: "+ tot2);
				break;
			case 3:	
				n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero para fazer a diviz�o: "));
				n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo n�mero para fazer a diviz�o: "));
				tot3 = n1/n2;
				JOptionPane.showMessageDialog(null,"Total da diviz�o �: "+ tot3);
				break;
			case 4:	
				n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um n�mero para fazer a multiplica��o: "));
				n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo n�mero para fazer a multiplica��o: "));
				tot4 = n1*n2;
				JOptionPane.showMessageDialog(null,"Total da multiplica��o �: "+ tot4);
				break;
			case 5:
				int qt,sm = 0,sb = 0,dv = 0,mt = 0;
				float med;
				qt = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a qtde de calculos: "));
				
				String nome[] = new String[qt];
				int somar[] = new int[qt];
				int sub[] = new int[qt];
				int div[] = new int[qt];
				int mult[] = new int[qt];
				String mostrar = "";
				int i;
				for (i = 0; i < qt; i++) {//3
					nome[i] = JOptionPane.showInputDialog(null, "Digite seu nome: ");
				    somar[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero: "));
				    sub[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero: "));
				    div[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero: "));
				    mult[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero: "));
					mostrar += "\nNome: " + (i+1) + ": " + nome[i] + ", soma: " + somar[i] +
					", subtra��o: " + sub[i] + ", Diviz�o: " + div[i] + ", Multiplica��o: " + mult[i];
					sm += somar[i] + somar[i];
					sb += sub[i] - sub[i];
					dv += div[i] / div[i];
					mt += mult[i] * mult[i];
					
					
				}//3
				
				JOptionPane.showMessageDialog(null, "mostrando os calculos: " + "\n" + mostrar + "\nSoma: " + sm +
						"\nSubtra��o: " + sb + "\nDiviz�o: " + dv + "\nMultiplica��o: " + mt);
				
				break;
			default:
				
				break;
			}
		}while(op!=0);
		JOptionPane.showMessageDialog(null,"O resultado do primeiro calculo �: "+ tot1 + 
				"\nSegundo: "+ tot2 + "\nterceiro: "+ tot3 + "\nquarto: " + tot4);
	}

}
