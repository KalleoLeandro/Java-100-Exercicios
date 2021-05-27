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
	 *Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		int macas;
		double total;
		
		//Atribuição dos valores
		macas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de maças a serem compradas"));
		
		//Cálculo e comparação
		if(macas < 12)
		{
			total = macas * 1.3;
		}
		else
		{
			total = macas;
		}
		
		//Exibição em tela
		JOptionPane.showMessageDialog(null, "O valor total da compra é de R$" + total);

	}

}
