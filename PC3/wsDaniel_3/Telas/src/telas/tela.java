package telas;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class tela {//1 classe

	public static void main(String[] args) {//2 metodo principal
		javax.swing.SwingUtilities.invokeLater(//3 utilização cores diferentes
				new Runnable() {//4 metodo executavel
					public void run() {//5 metodo de execução
						//decoração da parte visual
						JDialog.setDefaultLookAndFeelDecorated(true);
						//declaração das variaveis utilizadas
						//array 5 posições
						String[] nro = {"um","dois","tres","quatro","cinco"};
						int p1;
						String p2,msg = "msgs", tit = "titulo";
						String msg0 = "Selecione um dos botoes";
						String msg1 = "acionou o botao: NO";
						String msg2 = "acionou o botao: YES";
						String msg3 = "acionou o botao: FECHAR";
						String tit1 = "opcoes";
						String tit2 = "saida";
						//tipos e parametros utilizados nas msgsbox
						//showConfirmDialog(comp, msg, titulo, opcao, saida, icone)
						//showInputDialog(comp, msg, titulo, saida, icone, lista, posicao)
						//showMessageDialog(comp, msg, titulo, saida, icone)
						//showOptionDialog(comp, msg, titulo, opcao, saida, icone, lista, foco)
						
						//definicao de constantes "simuladas"
						//SAIDA - tipo do icone mostrado na caixa de dialogo
						final int sai1 = JOptionPane.PLAIN_MESSAGE;
						final int sai2 = JOptionPane.ERROR_MESSAGE;
						final int sai3 = JOptionPane.INFORMATION_MESSAGE;
						final int sai4 = JOptionPane.WARNING_MESSAGE;
						final int sai5 = JOptionPane.QUESTION_MESSAGE;
						//OPCAO - tipos de botoes mostrados na caixa de dialog
						final int opt1= JOptionPane.DEFAULT_OPTION;
						final int opt2 = JOptionPane.YES_NO_OPTION;
						final int opt3 = JOptionPane.YES_NO_CANCEL_OPTION;
						final int opt4 = JOptionPane.OK_CANCEL_OPTION;
						
						//exemplo utilizando inputdialog
						p2 = JOptionPane.showInputDialog(null, msg, tit, -1);
						p2 = JOptionPane.showInputDialog(null, msg, tit, 0);
						p2 = JOptionPane.showInputDialog(null, msg, tit, 1);
						p2 = JOptionPane.showInputDialog(null, msg, tit, 2);
						p2 = JOptionPane.showInputDialog(null, msg, tit, 3);
						
						p2 = JOptionPane.showInputDialog(null, msg, tit, sai1);
						p2 = JOptionPane.showInputDialog(null, msg, tit, sai2);
						p2 = JOptionPane.showInputDialog(null, msg, tit, sai3);
						p2 = JOptionPane.showInputDialog(null, msg, tit, sai4);
						p2 = JOptionPane.showInputDialog(null, msg, tit, sai5);
						
						p2 = (String) JOptionPane.showInputDialog(null, msg, tit, -1, null, nro, nro[0]);
						p2 = (String) JOptionPane.showInputDialog(null, msg, tit, 0, null, nro, nro[0]);
						p2 = (String) JOptionPane.showInputDialog(null, msg, tit, 1, null, nro, nro[2]);
						p2 = (String) JOptionPane.showInputDialog(null, msg, tit, 2, null, nro, nro[3]);
						p2 = (String) JOptionPane.showInputDialog(null, msg, tit, 3, null, nro, nro[4]);
						
						//exemplo com metodo showOptionDialog
						p1 = JOptionPane.showOptionDialog(null, msg, tit, 1, -1, null, nro, "um");
						p1 = JOptionPane.showOptionDialog(null, msg, tit, 1, 0, null, nro, "dois");
						p1 = JOptionPane.showOptionDialog(null, msg, tit, 1, 1, null, nro, "tres");
						p1 = JOptionPane.showOptionDialog(null, msg, tit, 1, 2, null, nro, "quatro");
						p1 = JOptionPane.showOptionDialog(null, msg, tit, 1, 3, null, nro, "cinco");
						
						//exemplo com showConfirmDialog
						p1 = JOptionPane.showConfirmDialog(null, msg, tit, -1, 1, null);
						p1 = JOptionPane.showConfirmDialog(null, msg, tit, 0, 1, null);
						p1 = JOptionPane.showConfirmDialog(null, msg, tit, 1, 1, null);
						p1 = JOptionPane.showConfirmDialog(null, msg, tit, 2, 1, null);
						
						p1 = JOptionPane.showConfirmDialog(null, msg, tit, opt1, 2, null);
						p1 = JOptionPane.showConfirmDialog(null, msg, tit, opt2, 2, null);
						p1 = JOptionPane.showConfirmDialog(null, msg, tit, opt3, 2, null);
						p1 = JOptionPane.showConfirmDialog(null, msg, tit, opt4, 2, null);
						
						//exemplo com showMessageDialog
						JOptionPane.showMessageDialog(null, msg, tit, -1, null);
						JOptionPane.showMessageDialog(null, msg, tit, 0, null);
						JOptionPane.showMessageDialog(null, msg, tit, 1, null);
						JOptionPane.showMessageDialog(null, msg, tit, 2, null);
						
						p1 = JOptionPane.showConfirmDialog(null, msg0, tit1, 0, 1);
						
						if(p1 == JOptionPane.NO_OPTION) {
							JOptionPane.showMessageDialog(null, msg1, tit2, 2);
						}
						if (p1 == JOptionPane.OK_OPTION) {
							JOptionPane.showMessageDialog(null, msg2, tit2, 2);
						}
						if(p1 == JOptionPane.CLOSED_OPTION) {
							JOptionPane.showMessageDialog(null, msg3, tit2, 0);
						}
						
				
						
						
				}//5 fim do metodo run
			}//4 fim metodo runnable
		);//3 fim do metodo invoke	
	}//2 fim metodo main
}//1 fim da classe
