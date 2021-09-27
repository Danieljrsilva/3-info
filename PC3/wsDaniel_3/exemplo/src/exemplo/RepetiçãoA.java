package exemplo;
import javax.swing.JOptionPane;
public class RepetiçãoA {//1
	
	//faca enquanto

	public static void main(String[] args) {//2
		// TODO Auto-generated method stub
	int opcao, i=0;
	String tudo="";
	do {//3
		opcao = Integer.parseInt(JOptionPane.showInputDialog("digite 0 - sair"));
				
		
	}while(opcao !=0);//3
	
	do {//4
	//acumulador
	  i++;// i=i + 1;	
	  JOptionPane.showMessageDialog(null, "\nnro: " + i);		
		
	}while(i < 10);//4
	i = 0;
	while(i < 10) {//5
	  i++;// i=i + 1;
	  tudo += "\nnro: " + i; //+= -> acumulador que devolve o valor
	  JOptionPane.showMessageDialog(null, tudo);
	}//5  
    for(i=1; i <=10; i++) {//6
     tudo += "\nnro: " + i;
		  
    }//6
	JOptionPane.showMessageDialog(null, tudo);
	
	for(i=15; i <=50; i++) {//7
	     tudo += "\nnro: " + i;
			  
    }//7
	JOptionPane.showMessageDialog(null, tudo);
	
	
	
	}//2

}
