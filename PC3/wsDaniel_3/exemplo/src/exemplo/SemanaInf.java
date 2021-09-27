package exemplo;
import javax.swing.JOptionPane;
public class SemanaInf {
	public static void main(String[] args) {
	int dia;
		String diaext ="" ;
		dia = Integer.parseInt(
				JOptionPane.showInputDialog(
						"digite o dia"));
		if(dia == 1) {
			diaext = "domingo";
		}else if(dia == 2) {
	        diaext = "segunda";
		}else if(dia == 3) {
			diaext = "terca";
		}else if(dia == 4) {
			diaext = "quarta";
		}else if(dia == 5) {
			diaext = "quinta";
		}else if(dia == 6) {
			diaext = "sexta";
		}else if(dia == 7) {
			diaext = "sabado";
		}else {
			diaext = "dia invalido";
		}
		JOptionPane.showMessageDialog(null, 
			"dia: " + dia + "\ndia da semana: " + diaext);
	}
}
