package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a diferen�a de valores  recebidos do usu�rio
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio10 
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double num1,num2, diferenca;
		
		//Recebendo valores do usu�rio
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
		
		//Efetuando o c�lculo
		
		diferenca = num1 - num2;
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null, "O resultado da diferen�a � " + diferenca);		
		

	}

}
