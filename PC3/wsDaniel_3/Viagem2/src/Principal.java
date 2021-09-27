import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Percurso perc = new Percurso();
		Custos cust = new Custos();
		int op;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(null,
					"\n1 - Cadastrar\n2 - Listar\n3 - Calcular"+
					"\n0 - Sair\nDigite uma opção: "));
			switch(op) {
			case 1:
				perc.cadastrar();
				break;
			case 2:
				perc.listar(cust);
				break;
			case 3:
				cust.calcular(perc);
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Saindoo ......");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida! ");
				break;
			}
		}while(op!=0);

	}

}
