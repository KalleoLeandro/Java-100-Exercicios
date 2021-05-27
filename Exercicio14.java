package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o m�dulo dos valores  recebido do usu�rio
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio14 
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double num1,num2, modulo;
		
		//Recebendo valores do usu�rio
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
		
		//Efetuando o c�lculo
		
		modulo = num1 % num2;		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null, "O resultado do m�dulo dos valores � " + modulo);		
		

	}

}
