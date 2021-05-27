package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o custo de compra e 
 * exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio38 
{

	/*
	 *M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		int macas;
		double total;
		
		//Atribui��o dos valores
		macas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de ma�as a serem compradas"));
		
		//C�lculo e compara��o
		if(macas < 12)
		{
			total = macas * 1.3;
		}
		else
		{
			total = macas;
		}
		
		//Exibi��o em tela
		JOptionPane.showMessageDialog(null, "O valor total da compra � de R$" + total);

	}

}
