import java.text.DecimalFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
public class Revisao {//1
	public static void main(String[] args) {//2
		
		String nome, situ;
		float alt, peso, imc;
		int anonasc, anoatual, dif;
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		
		DecimalFormat dec = new DecimalFormat("0.00");
		
		
		nome = JOptionPane.showInputDialog(
				null, "digite seu nome");
		anonasc = Integer.parseInt(JOptionPane.showInputDialog(
				null, "digite ano de nascimento"));
		anoatual = Integer.parseInt(JOptionPane.showInputDialog(
				null, "digite o ano atual"));
		peso = Float.parseFloat(JOptionPane.showInputDialog(
				null, "digite seu peso"));
		alt = Float.parseFloat(JOptionPane.showInputDialog(
				null, "digite sua altura"));
			
			
		dif = year - anonasc;
		imc = peso/(alt * alt);
		//imc = Math.pow(alt, 2);
		
		if (imc > 40) {
		  situ = "mórbido";	
		}else if (imc > 35) {
		  situ = "muito gordo";	   	
		}else if (imc > 30) {
		  situ = "gordo";		
		}else if (imc > 25) {
		  situ = "sobrepeso";		
		}else if (imc > 18.5) {
		  situ = "normal";	
		}else if (imc > 17) {
	   	  situ = "muito magro";	
		}else {
		  situ = "múmia";
		}
		
		JOptionPane.showMessageDialog(null, "ola: " + nome + 
				" \nestamos em: " + anoatual +
				" \nVoce pesa: " + peso +" \nimc " + imc + " \nsituação " + situ +
				" \ntem: " + alt + " de altura" + dec.format(imc) +" \nvoce nasceu em: " + anonasc +
				" \nvoce tem: " + dif + " anos ");
	}//2
}//1
