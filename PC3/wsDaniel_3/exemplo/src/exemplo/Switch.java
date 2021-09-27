package exemplo;

import javax.swing.JOptionPane;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int dia;
	  String diaext;
			
      dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia"));
  	    switch (dia) {
  	    case 1:
		  diaext = "Segunda";
		  break;
  	    case 2:
  	   	  diaext = "terca";
  	   	  break;
  	    case 3:
  	   	  diaext = "Quarta";
		  break;
    	case 4:
	      diaext = "Quinta";
		  break;
  	    case 5:
	   	  diaext = "Sexta";
		  break;
  	    case 6:
	   	  diaext = "Sabado";
		  break;
  	    case 7:
	   	  diaext = "Domingo";
		  break;
	    default: 
		  diaext = "dia invalido";
		  break;
		}
		JOptionPane.showMessageDialog(null, " dia: " + dia + "\ndia da semana: " + diaext);
	}

}
