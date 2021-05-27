package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e exibir o total em agua e suco necessários
 * para fazer um refresco, com base nos valores informados pelo usuário
 *      
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio34
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		
		double litros,agua,suco;
		
		
		//Atribuição do valor
		
		litros = Double.parseDouble(JOptionPane.showInputDialog("Informe o total de litros de refresco a serem produzidos "));
		
		
		
				
		//Efetuando os cálculos das partes 
		   
		
		agua = litros * 0.8;
		suco = litros * 0.2;
		
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"São necessários " + agua + " litros de agua e " + suco + " unidades de suco para produzir a quantidade de " + litros + " litros de refresco");
												
	}
}
