package array_;

import javax.swing.JOptionPane;

public class Arrayby_aluno {

	public static void main(String[] args) {
		float div = 0;
		int qt;
		
		qt = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos calculos vo�e quer fazer : "));
		
		String marca[] = new String[qt];
		float km1 [] = new float[qt];
		int lit1[] = new int[qt];
		String mostrar = "";
		int i;
		for (i = 0; i < qt; i++) {//3
			marca[i] = JOptionPane.showInputDialog(null, "Digite a marca do veiculo: ");
		    km1[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite quantos quilometros vo�� andou: "));
		    lit1[i] =Integer.parseInt(JOptionPane.showInputDialog("Digite quantos litros vo�� abasteceu: "));
			mostrar += "\nveiculo: " + (i+1) + ": " + marca[i] + ", quilometragem: " + km1[i] + ", litros: " + lit1[i];
			div = km1[i]/lit1[i];
			
		}//3
		
		JOptionPane.showMessageDialog(null, "Consumo m�dio do veiculo � : " + div + "\n" + mostrar);
	    
		

	}

}
