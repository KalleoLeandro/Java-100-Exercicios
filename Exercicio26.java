package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a quantidade de dias passados do ano com base em valores informados pelo usuário
 *     
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio26
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		
		int dia, mes;
		
		//Atribuição do valor
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia "));		
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes "));		
				
		
		
		//Efetuando o cálculo		
		
		mes = ((mes - 1) * 30) + dia;	
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O número de dias que se passou desde o início do ano é de " + mes);
	}
}
