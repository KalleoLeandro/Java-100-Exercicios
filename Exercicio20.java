package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir uma convers�o cambial
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio20
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		int dolar;
		double real;
		
		//Atribui��o do valor
		
		dolar = 20;		
		
		
		//Efetuando os c�lculos		
		
		real = dolar * 6.61;
		 
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O valor em reais dos d�lares previamente registrados � de R$" + real);
	}
}
