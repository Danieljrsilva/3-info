import javax.swing.JOptionPane;

public class primeiro {

	public static void main(String[] args) {
		float consini,consfin,tot;
		
		
		consini=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite quanto vc gastou inicial de produto na piscina"));
		consfin=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite quanto vc gastou final de produto na piscina"));
		
		tot=consini+consfin;
		
		if (tot > 1000) {
			JOptionPane.showMessageDialog(null, "Voçê estourou seu orçamento por semana");
		}
		else if (tot < 1000) {
			JOptionPane.showMessageDialog(null, "Voçê esta dentro do seu orçamento semanal");
		}
		else if(tot == 1000){
			JOptionPane.showMessageDialog(null, "Voçê esta no limite do seu orçamento semanal");
		}
		
		JOptionPane.showMessageDialog(null, 
				"consini: " + consini + "\nconsfin: " + consfin + "\ntotal" + tot);
		
		

	}

}
