package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a temperatura convertida de 
 * medida imperial para medida do Sistema internacional de acordo com valor informado pelo usuário  
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio23
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double fahrenheit,celsius;		
		
		//Atribuição do valor
		
		fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da temperatura em F°"));
				
		
		
		//Efetuando o cálculo	
		
		celsius = (5*fahrenheit - 160) / 9;	
		 
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"A temperatura convertida em C° é de " + celsius);
	}
}
