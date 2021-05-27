package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 valores e multiplicar os 2 menores,
 * ap�s, exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio51 
{

	/*
	 *M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{		
		// Declara��o de vari�veis
		double num1,num2,num3,produto;
		
		//Atribui��o dos valores
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro n�mero"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo n�mero"));
		num3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro n�mero"));
		
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
		
		//Exibi��o em tela
		
		JOptionPane.showMessageDialog(null, "A soma dos maiores valores � de " + produto);

	}

}
