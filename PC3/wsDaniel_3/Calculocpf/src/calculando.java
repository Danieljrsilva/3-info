import javax.swing.JOptionPane;

public class calculando {

	public static void main(String[] args) {
		int a, b, c, d, e, f, g, h, i, j, k;
		int t1,t2, r1, r2 ;
		
		
		
		/*n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro n1 : "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro n2 : "));
		n3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro n3 : "));	
		n4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro n4 : "));
		n5 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro n5 : "));
		n6 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro n6 : "));
		n7 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro n7 : "));
		n8 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro n8 : "));
		n9 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro n9 : "));*/
		a=3;b=1;c=7;d=2;e=4;f=9;g=6;h=7;i=8;
		
		t1 = a * 10 + b * 9 + c * 8 + d * 7 + e * 6 + f * 5 + g * 4 + h * 3 + i * 2 ;
	
		r1 = t1 % 11;
		
		if(r1 > 1) {
			j = 11 - r1;
		}else {
			j = 0;
		}
		
		t2 = a * 11 + b * 10 + c * 9 + d * 8 + e * 7 + f * 6 + g * 5 + h * 4 + i * 3 + j * 2 ;
		
		r2 = t2 % 11;
		
		if(r2 > 1) {
			k = 11 - r2;
		}else {
			k = 0;
		}
		 
		 
		JOptionPane.showMessageDialog(null, "A 1� soma  " + t1 + "\nresto1: " + r1 + " \nseu cpf � " + a + b + c + 
				"." + d + e + f +
				"." + g + h + i + 
				"-" + j);		
		
		 
		JOptionPane.showMessageDialog(null, "A 2� soma  " + t2 + "\nresto2: " + r2 + " \nseu cpf � " + a + b + c + 
				"." + d + e + f +
				"." + g + h + i + 
				"-" + j + k);		
		
		
		 
	}

}
