package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir uma conversão cambial
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio20
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		int dolar;
		double real;
		
		//Atribuição do valor
		
		dolar = 20;		
		
		
		//Efetuando os cálculos		
		
		real = dolar * 6.61;
		 
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O valor em reais dos dólares previamente registrados é de R$" + real);
	}
}
