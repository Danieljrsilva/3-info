import javax.swing.JOptionPane;

public class primeiro {

	public static void main(String[] args) {
		float consini,consfin,tot;
		
		
		consini=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite quanto vc gastou inicial de produto na piscina"));
		consfin=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite quanto vc gastou final de produto na piscina"));
		
		tot=consini+consfin;
		
		if (tot > 1000) {
			JOptionPane.showMessageDialog(null, "Vo�� estourou seu or�amento por semana");
		}
		else if (tot < 1000) {
			JOptionPane.showMessageDialog(null, "Vo�� esta dentro do seu or�amento semanal");
		}
		else if(tot == 1000){
			JOptionPane.showMessageDialog(null, "Vo�� esta no limite do seu or�amento semanal");
		}
		
		JOptionPane.showMessageDialog(null, 
				"consini: " + consini + "\nconsfin: " + consfin + "\ntotal" + tot);
		
		

	}

}
