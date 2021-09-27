package exercicio;
import javax.swing.JOptionPane;
public class Principal {//1
	public static void main(String[] args) {//2
		int op;
		Imposto imp = new Imposto();
		do {//3
			op = Integer.parseInt(JOptionPane.showInputDialog(
					null,"1-Cadastrar salário\n2-Calcular"
					+ "\n3-Listar"
					+ "\n4-Dependente"
					+ "\n0-Sair", "Selecione:", 1));
			switch(op) {//4
			case 1:
				
			 break;
			case 2:
				
			 break;
			case 3:
				
			 break;
		   default:
			   
			 break;	
			}//4
		}while(op!=0);//3
	}//2
}//1
