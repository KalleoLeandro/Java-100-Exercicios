package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 nomes e armazenar em um array, depois, deverá receber
 * um nome e procurar em um array. Imprimir se achou ou não o nome igual.
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/02/2021
 */
public class Exercicio88 
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		String nomes [] = new String[10];
		String nomeBusca;
		boolean contem=false;
		
		
		//Atribuição de valores ao array por meio de laço de repetição
		
		for (int i = 0;i < 10;i++)
		{
			nomes[i] = JOptionPane.showInputDialog("Informe o " + (i+1) + "° nome");
		}
		
		//Recebimento do texto que deverá ser procurado
		
		nomeBusca =  JOptionPane.showInputDialog("Informe o nome a ser procurado");
		
		//Busca do nome igual ao informado, caso encontre, modifica variável lógica contem
		
		for(int i = 0; i<10;i++)
		{
			if(nomes[i].equals(nomeBusca))
			{
				contem = true;
			}
		}
		
		//Impressão em tela de acordo com o valor de contem
		
		if(contem)
		{
			JOptionPane.showInternalMessageDialog(null, "ACHEI");
		}
		else
		{
			JOptionPane.showInternalMessageDialog(null, "NÃO ACHEI");
		}

	}

}
