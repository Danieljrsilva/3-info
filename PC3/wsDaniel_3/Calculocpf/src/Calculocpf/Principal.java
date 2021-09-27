package Calculocpf;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		cpf_2 cpf1 = new cpf_2();
		String cpf = JOptionPane.showInputDialog(null,
				"Digite o cpf \nformato (xxxxxxxxxxx - sem pontos e traços)");
		cpf1.Testacpf_2(cpf);

	}

}
