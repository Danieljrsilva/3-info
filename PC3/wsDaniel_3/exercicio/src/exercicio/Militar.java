package exercicio;



import javax.swing.JOptionPane;

public class Militar {//1

	public static void main(String[] args) {//2
		// TODO Auto-generated method stub
		
		String nome, situ;
		int idd ;
		float peso, imc, alt;
		
		
		nome = JOptionPane.showInputDialog(null,"Digite seu nome_______");
	    idd = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu idade: "));
	    peso = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite seu peso: "));
	    alt = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite sua altura: "));
	    
	    imc = peso/(alt*alt); 
	    
	    if (idd < 18) {
		  situ = "Reprovado";	
		}else if (idd > 39) {
		  situ = "Reprovado";	   	
		}else if (peso < 50) {
		  situ = "Muito Magro";		
		}else if (peso > 100) {
		  situ = "Muito Gordo";		
		}else if (alt < 1.5) {
		  situ = "Muito Baixo";	
		}else if (alt > 2.1) {
	   	  situ = "Girafa";	
		}else  {
		  situ = "Voçê esta apto para sevir boa sorte";
		} 
	    
	    JOptionPane.showMessageDialog(null, "ola: " + nome + "Voçê tem: " + idd +
	    		"\nPesa: " + peso + "\nTem: " + alt + 
	    		 " \nSeu indice de massa corporal é: " +  imc + "\n" + situ);
			
			
	    
	    

	}//2

}//1
