package array_;
import javax.swing.JOptionPane;

public class Array {//1

	public static void main(String[] args) {//2
		int qt,soma;
		
		qt = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a qtde de alunos: "));
		
		String nome[] = new String[qt];
		String idade[] = new String[qt];
		String mostrar = "";
		int i,i2 = 0;
		for (i = 0; i < 3; i++) {//3
			nome[i] = JOptionPane.showInputDialog(null, "Digite o nome");
		    idade[i2] = JOptionPane.showInputDialog("Digite a idade");
			mostrar += "\naluno: " + (i+1) + ": " + nome[i] + "\nidade: " + idade[i2];
			
			
		}//3
	    soma = (i2 + i2)/2;
		JOptionPane.showMessageDialog(null, mostrar , "lista de alunos ", i+i2);
		
	}//2	

}//1
