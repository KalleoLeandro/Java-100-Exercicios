package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 nomes e armazenar em um array, depois, dever� receber
 * um nome e procurar em um array. Imprimir se achou ou n�o o nome igual.
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/02/2021
 */
public class Exercicio88 
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		String nomes [] = new String[10];
		String nomeBusca;
		boolean contem=false;
		
		
		//Atribui��o de valores ao array por meio de la�o de repeti��o
		
		for (int i = 0;i < 10;i++)
		{
			nomes[i] = JOptionPane.showInputDialog("Informe o " + (i+1) + "� nome");
		}
		
		//Recebimento do texto que dever� ser procurado
		
		nomeBusca =  JOptionPane.showInputDialog("Informe o nome a ser procurado");
		
		//Busca do nome igual ao informado, caso encontre, modifica vari�vel l�gica contem
		
		for(int i = 0; i<10;i++)
		{
			if(nomes[i].equals(nomeBusca))
			{
				contem = true;
			}
		}
		
		//Impress�o em tela de acordo com o valor de contem
		
		if(contem)
		{
			JOptionPane.showInternalMessageDialog(null, "ACHEI");
		}
		else
		{
			JOptionPane.showInternalMessageDialog(null, "N�O ACHEI");
		}

	}

}
