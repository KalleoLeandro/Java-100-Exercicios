package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o saldo total de venda com base em valores informados pelo usuário
 *     
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio27
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		
		int p,m,g;
		double total;
		
		//Atribuição do valor
		
		p = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de camiseta P "));		
		m = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de camisetas M "));		
		g = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de camisetas G"));		
				
		
		
		//Efetuando o cálculo		
		
		total = (p * 10) + (m * 12) + (g * 15);
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O Valor total da venda de camisetas é de R$" + total);		
	}
}
