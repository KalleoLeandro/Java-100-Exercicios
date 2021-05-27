package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o saldo total de venda com base em valores informados pelo usu�rio
 *     
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio27
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		
		int p,m,g;
		double total;
		
		//Atribui��o do valor
		
		p = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de camiseta P "));		
		m = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de camisetas M "));		
		g = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de camisetas G"));		
				
		
		
		//Efetuando o c�lculo		
		
		total = (p * 10) + (m * 12) + (g * 15);
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O Valor total da venda de camisetas � de R$" + total);		
	}
}
