package livrariapoli;

import javax.swing.JOptionPane;

public class Gerenciador {//1
	public void Comprar(Produto prod) {//2 polimorfismo passagem de qq
		int qtd = Integer.parseInt(// produto - livri cd dvd
		JOptionPane.showInputDialog(null, "Digite a qtd comprada: "));
		JOptionPane.showMessageDialog(null, "Estoque anterior de " +
				prod.getClass().getSimpleName() + ": " + prod.getEstoque() +
				"\nQtd comprada: " + qtd + "\nQtd atual: " +
				(prod.getEstoque() + qtd));
		prod.setEstoque(prod.getEstoque() + qtd);
	}//2
	
	public void Vender(Produto prod) {//3 
		int qtd = Integer.parseInt(
		JOptionPane.showInputDialog(null, "Digite a qtd vendida: "));
		JOptionPane.showMessageDialog(null, "Estoque anterior de " +
				prod.getClass().getSimpleName() + ": " + prod.getEstoque() +
				"\nQtd vendida: " + qtd + "\nQtd atual: " +
				(prod.getEstoque() - qtd));
		prod.setEstoque(prod.getEstoque() - qtd);
	}//3
	
	public void Encomendar(Produto prod) {//4
		int qtd = Integer.parseInt(
		JOptionPane.showInputDialog(null, "Digite a qtd de " +
					prod.getClass().getSimpleName() + " desejada: "));
		if(qtd <= prod.getEstoque()) {
			JOptionPane.showMessageDialog(null,
					"Encomenda do " + prod.getClass().getSimpleName() +
					" - " + prod.getDescricao() + " realizada");
		}else {//5
			JOptionPane.showMessageDialog(null,
					"Encomenda do " + prod.getClass().getSimpleName() +
					" - " + prod.getDescricao() + "realizando pedido!");
		}//5
	}//4
}//1
