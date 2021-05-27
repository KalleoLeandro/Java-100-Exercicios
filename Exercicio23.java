package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a temperatura convertida de 
 * medida imperial para medida do Sistema internacional de acordo com valor informado pelo usu�rio  
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio23
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double fahrenheit,celsius;		
		
		//Atribui��o do valor
		
		fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da temperatura em F�"));
				
		
		
		//Efetuando o c�lculo	
		
		celsius = (5*fahrenheit - 160) / 9;	
		 
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"A temperatura convertida em C� � de " + celsius);
	}
}
