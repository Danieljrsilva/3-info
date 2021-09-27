import javax.swing.JOptionPane;

public class Extenso {

	public static void main(String[] args) {
		int qt,v,d;
		float med;
		qt = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número : "));
		
		String v1 [] = {"","um","dois","três","quatro","cinco","seis","sete","oito","nove","dez"};
		String d1 [] = {"","dez","vinte","trinta","quarenta","cinquenta","sessenta","setenta","oitenta","noventa","cem"};
	
		String mostrar = "";
		int i;
		for (i = 0; i < qt; i++) {//3
			nome[i] = JOptionPane.showInputDialog(null, "Digite o nome");
		    idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade "));
		    nota[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite primeira nota "));
		    nota[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite segunda nota "));
			mostrar += "\naluno: " + (i+1) + ": " + nome[i] + ", idade: " + idade[i] + ", nota: " + nota[i];
			soma += idade[i];
			
			
		}//3
	    
		JOptionPane.showMessageDialog(null, "media idades: " + med + "\n" + mostrar);
		
	}//2	

}
