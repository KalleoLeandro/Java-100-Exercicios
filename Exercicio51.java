package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 valores e multiplicar os 2 menores,
 * após, exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio51 
{

	/*
	 *Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{		
		// Declaração de variáveis
		double num1,num2,num3,produto;
		
		//Atribuição dos valores
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));
		num3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro número"));
		
		if((num1 > num2) && (num1>num3))
		{
			produto = num2 * num3;
		}
		else if((num2 > num1) && (num2 > num3))
		{
			produto = num1 * num3;
		}
		else
		{
			produto = num1 * num2;
		}
		
		//Exibição em tela
		
		JOptionPane.showMessageDialog(null, "A soma dos maiores valores é de " + produto);

	}

}
