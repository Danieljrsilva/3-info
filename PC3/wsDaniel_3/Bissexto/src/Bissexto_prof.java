import javax.swing.JOptionPane;

public class Bissexto_prof {//1

	public static void main(String[] args) {//2
		// TODO Auto-generated method stub
		
		int Ano, A4, A400, A100;
		String res;
		
		do {//3
			Ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um ano para ver-mos se é um ano bissexto: "));
			A4 = Ano % 4;
			A400 = Ano % 400;
			A100 = Ano % 100;
			
			if ((A4 == 0 && A100 != 0) || (A400 == 0)) {
				res = " Com certeza é un ano bissexto ";
			}else {
				res = " Não meu amigo não é um ano bissexto ";
			} 
			
			JOptionPane.showMessageDialog(null, " Ano " + Ano  +  res + " Bissexto ");
			
		}while(Ano != 0);//3

	}//2

}//1
