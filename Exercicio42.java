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
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args)
	{
		// Declara��o de vari�veis
		double num1,num2;
		
		//Atribui��o dos valores
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe outro n�mero"));
		
		//Exibi��o em tela
		
		if(num1 > num2)
		{
			JOptionPane.showMessageDialog(null, "Os valores em ordem crescente s�o " + num2 + " e " + num1 );
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Os valores em ordem crescente s�o " + num1 + " e " + num2 );
		}

	}

}
