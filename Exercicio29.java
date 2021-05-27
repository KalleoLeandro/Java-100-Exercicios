package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o  total de produtos a serem adquiridos, com base
 * em valores informados pelo usuário 
 *     
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio29
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		
		double queijo, presunto, hamburguer;
		int quantidade;
		
		//Atribuição do valor
		
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe o número total de sanduíches a serem produzidos "));
					
		
				
		//Efetuando os cálculos de produtos
		
		presunto = quantidade * 0.05;
		queijo = quantidade * 0.1;
		hamburguer = quantidade * 0.1;	
		
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"A quantidade de presunto necessária é de " + presunto + "Kg"+
										"\nA quantidade de queijo necessária é de "+ queijo  + "Kg"+
										"\nA quantidade de hamburguer necessária é de "+ hamburguer  + "Kg");		
	}
}
