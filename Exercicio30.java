package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a termperatura do Sistema Internacional convertida no
 * Sistema Imperial com base nos valores informados pelo usu�rio  
 *     
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio30
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		
		double fahrenheit,celsius;		
		
		//Atribui��o do valor
		
		celsius = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em celsius "));
					
		
				
		//Efetuando o calculo da convers�o
		
		fahrenheit = ((9 * celsius) / 5) + 32;		
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"A temperatura convertida de C� para F� � de " + fahrenheit);
												
	}
}
