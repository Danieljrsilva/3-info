package trycatch;

import javax.swing.JOptionPane;

public class Principal {//1

	public static void main(String[] args) {//2
	  int op, dep;
	  float sal;
	  Imposto imp = new Imposto();
	  do {//3
		 op = Integer.parseInt(JOptionPane.showInputDialog(null, "1-cadastrar salario\n2-calcular" + "\n3-listar" + "\n0-sair" , "Selecione:" , 1));
		 switch(op) {//4
		 case 1:
			sal = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite salario bruto: "));
			dep = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantidade de dependentes: "));
		   imp.Cadastrar(sal, dep);
		   break;
		 case 2:
		   imp.Cal();	
		   break;
		 case 3:
		   imp.Listar();	
		   break; 
		 default:
			 JOptionPane.showInputDialog(null, "opessão invalida ");
		   break;
		 }//4
	  }while(op != 0);//3
   }//2
}//1
