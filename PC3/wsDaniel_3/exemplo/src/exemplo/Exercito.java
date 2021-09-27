package exemplo;

import javax.swing.JOptionPane;

public class Exercito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op, idd;
		float peso, alt, imc;
		String nome, situ, fim;
		do {
		  situ = "";
		  fim = "";
	      nome = JOptionPane.showInputDialog(null,"Digite seu nome_______");
		  idd = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu idade: "));
		  peso = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite seu peso: "));
		  alt = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite sua altura: "));
		  
		  imc = peso / (alt * alt);
		  
		  if (idd < 18) {
			situ += " -novo- ";  
		  }else if (idd > 38) {
			situ += " -velho- ";  
		  }
		  
		  if (peso < 50) {
			situ += " -magro- ";  
		  }else if (peso > 100) {
			situ += " -gordo- ";  
		  }
		  
		  if (alt < 1.5) {
			situ += " -baixo- ";  
		  }else if (alt > 2.1) {
			situ += " -alto- ";  
		  }
		  
		  if (imc < 20) {
			situ += " - imc baixo- ";  
		  }else if (idd > 30) {
			situ += " - imc alto- ";  
		  }
		  
		  fim = "candidato " + nome;
		  if (situ.equals("")) {
			fim += " aprovado";  
		  }else {
			fim += " reprovado porque " + situ;  
		  }
		  
		  JOptionPane.showMessageDialog(null, fim);
		  
			
		  op = Integer.parseInt(JOptionPane.showInputDialog(null,"digite:\n1-verifica\n0 - sair", "menu" , 1));	
   	    
		}while (op != 0);

	}

}
