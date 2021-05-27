package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o  total de produtos a serem adquiridos, com base
 * em valores informados pelo usu�rio 
 *     
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio29
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		
		double queijo, presunto, hamburguer;
		int quantidade;
		
		//Atribui��o do valor
		
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero total de sandu�ches a serem produzidos "));
					
		
				
		//Efetuando os c�lculos de produtos
		
		presunto = quantidade * 0.05;
		queijo = quantidade * 0.1;
		hamburguer = quantidade * 0.1;	
		
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"A quantidade de presunto necess�ria � de " + presunto + "Kg"+
										"\nA quantidade de queijo necess�ria � de "+ queijo  + "Kg"+
										"\nA quantidade de hamburguer necess�ria � de "+ hamburguer  + "Kg");		
	}
}
