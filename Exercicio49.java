package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar o menor valor entre os informados
 * e exibir o mesmo em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio49 
{

	/*
	 *Método principal de exibição do programa 
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double num1, num2,num3;
		
		//Atribuição dos valores
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));
		num3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro número"));
		
		//Comparação e exibição em tela
		
		if((num1 < num2) && (num1 < num3))
		{
			JOptionPane.showMessageDialog(null, "O menor valor entre os valores digitados é " + num1);
		}
		else if((num2 < num1)&&(num2 < num3))
		{
			JOptionPane.showMessageDialog(null, "O menor valor entre os valores digitados é " + num2);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "O menor valor entre os valores digitados é " + num3);
		}

	}

}
