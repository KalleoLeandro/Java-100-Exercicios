package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a soma de valores  recebidos do usuário
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio09
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double num1,num2, soma;
		
		//Recebendo valores do usuário
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
		
		//Efetuando o cálculo
		
		soma = num1 + num2;
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null, "O resultado da soma é " + soma);		
		

	}

}
