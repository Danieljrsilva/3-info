package exercicio;
import javax.swing.JOptionPane;
public class Semana {
	public static void main(String[] args) {
	int dia;
		String diaext ="" ;
		dia = Integer.parseInt(
				JOptionPane.showInputDialog(
						"digite o dia"));
		if(dia == 1) {//
			diaext = "domingo";
		}
		if(dia == 2) {//
			diaext = "segunda";
		}
		if(dia == 3) {//
			diaext = "terca";
		}
		if(dia == 4) {//
			diaext = "quarta";
		}
		if(dia == 5) {//
			diaext = "quinta";
		}
		if(dia == 6) {//
			diaext = "sexta";
		}
		if(dia == 1) {//
			diaext = "sabado";
			} //2
			JOptionPane.showMessageDialog(null,
					"dia: " + dia + "\ndia da semana: " + diaext);
		}//1
		
	}


