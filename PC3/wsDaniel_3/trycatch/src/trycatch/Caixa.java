package trycatch;
import javax.swing.JOptionPane;

	public class Caixa {
		private double saldo;

		public Caixa() {
			
		}

		public Caixa(double saldo) {
			this.saldo = saldo;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public void Entrar() {
			//aki onde vai o possivel erro
		   try {//Trata erro se usuario digite algo dif de nros
			 this.setSaldo(this.getSaldo() + Double.parseDouble(JOptionPane.showInputDialog(null,
					 "Digite o valor da entrada: ")));
		   }catch(NumberFormatException erro) {//captura erro
			   //Apresenta mensagem personalizada
			   JOptionPane.showMessageDialog(null,
					"Digite apenas números","Tipo invalido", 0);
		   }finally {
			   JOptionPane.showMessageDialog(null,"Mensagem do Finally do método entrada" ,
					   "Finally - por aqui sempre passa" ,0);
		   }
		}
		
		//try -> onde é colocado o erro onde vai o JOptionpane
		
		   
	    public void Retirar() {
		   try {//Trata erro se usuario digite algo dif de nros
			 this.setSaldo(this.getSaldo() + Double.parseDouble(JOptionPane.showInputDialog(null,
					 "Digite o valor da retirada: ")));
		   }catch(NumberFormatException erro) {//captura erro
			   //Apresenta mensagem personalizada
			   JOptionPane.showMessageDialog(null,
					"Digite apenas números","Tipo invalido", 0);
		   }/*finally {
			   JOptionPane.showMessageDialog(null,"Mensagem do Finally do método entrada" ,
					   "Finally - por aqui sempre passa" ,0); 
		   }*/
	   }
}


