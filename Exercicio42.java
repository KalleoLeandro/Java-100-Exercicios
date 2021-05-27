package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ordenar valores em ordem crescente, e exibir em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio42 
{

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args)
	{
		// Declaração de variáveis
		double num1,num2;
		
		//Atribuição dos valores
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe outro número"));
		
		//Exibição em tela
		
		if(num1 > num2)
		{
			JOptionPane.showMessageDialog(null, "Os valores em ordem crescente são " + num2 + " e " + num1 );
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Os valores em ordem crescente são " + num1 + " e " + num2 );
		}

	}

}
