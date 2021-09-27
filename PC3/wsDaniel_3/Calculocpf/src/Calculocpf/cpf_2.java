package Calculocpf;

import javax.swing.JOptionPane;

public class cpf_2 {
	String cpf;

	public cpf_2() {
		this("");		
	}
	public cpf_2(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void Testacpf_2(String cpf) {
		//conversão
		int a = Integer.parseInt(cpf.substring(0,1));
		int b = Integer.parseInt(cpf.substring(1,2));
		int c = Integer.parseInt(cpf.substring(2,3));
		int d = Integer.parseInt(cpf.substring(3,4));
		int e = Integer.parseInt(cpf.substring(4,5));
		int f = Integer.parseInt(cpf.substring(5,6));
		int g = Integer.parseInt(cpf.substring(6,7));
		int h = Integer.parseInt(cpf.substring(7,8));
		int i = Integer.parseInt(cpf.substring(8,9));
		int j = Integer.parseInt(cpf.substring(9,10));
		int k = Integer.parseInt(cpf.substring(10,11));
		
		int n, s1=0,s2=0,r, d1, d2;
		String res;
		for (int x=0; x<9; x++) {
		    n = Integer.parseInt(cpf.substring(x, x+1));
		    s1 += n * (10 - x);
		    s2 += n * (11 - x);
		    // JOptionPane.showMessageDialog(null, "s1 " + s1 + "s2 " + s2);
		}
		//t1 = a * 10 + b * 9 + c * 8 + d * 7 + e * 6 + f * 5 + g * 4 + h * 3 + i * 2;
		
		r = s1 % 11;
		
		if(r > 1) {
			d1 = 11 - r;
		}else {
			d1 = 0;
		} 
		
		s2 += d1*2;
		r = s2 % 11;
		
		if(r > 1) {
			d2 = 11 - r;
		}else {
			d2 = 0;
		}
		res ="invalido";
		if (d1 == j && d2 == k) {
			res = "valido";
		}
		JOptionPane.showMessageDialog(null, "\nSeu Cpf é: "
				+ a + b + c + "." + d + e + f + "." +
				g + h + i + "-" + d1 + d2 + "\n" + res);
	}
	
}
