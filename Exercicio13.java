package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a pot�ncia dos valores  recebido do usu�rio
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio13 
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double num1,num2, potencia;
		
		//Recebendo valores do usu�rio
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
		
		//Efetuando o c�lculo
		
		potencia = Math.pow(num1,num2);
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null, "O resultado da potencia dos valores � " + potencia);		
		

	}

}
