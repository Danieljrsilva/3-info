import javax.swing.JOptionPane;

public class Principal2 {//1

	public static void main(String[] args) {//2
		caixa cx = new caixa();
		int op;
		do {//3
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite: " +"\n1-entrar\n2-retirar\n3-saldo\n0-sair "));
			switch(op) {//4
			case 1://caso vlr op 1 executa o metodo entrar
				cx.entrar();				
				break;
			case 2://caso vlr op 2 executa o metodo retirar
				cx.retirar();
				break;
			case 3://caso vlr op 3 mostra o saldo	
				JOptionPane.showMessageDialog(null,"saldo: " + cx.getSaldo());
				break;
			case 0://caso vlr op 0 mostra msg sair
				JOptionPane.showMessageDialog(null,"sair");
				break;
			default://se digitar qualquer op��o invalida
				JOptionPane.showMessageDialog(null,"Op��o invalida");
				break;
			}//4
		}while(op!=0);//3

	}//2

}//1
