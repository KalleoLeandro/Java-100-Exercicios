package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ordenar 3 numeros e exibir em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio52 
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double num1, num2, num3;

		// Atribuição dos valores
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));
		num3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro número"));
		
		//Comparação e exibição em tela
		
		if(num1 > num2 && num1> num3 && num2>num3) // 1° > 2°> 3°
		{
			JOptionPane.showMessageDialog(null, num3 + "," + num2 + "," + num1); 
		}
		else if(num1 > num2 && num1> num3 && num2<num3) // 1° > 3°> 2°
		{
			JOptionPane.showMessageDialog(null, num2 + "," + num3 + "," + num1);
		}
		else if(num2 > num1 && num2> num3 && num1>num3) // 2° > 1°> 3°
		{
			JOptionPane.showMessageDialog(null, num3 + "," + num1 + "," + num2);
		}
		else if(num2 > num1 && num2> num3 && num1<num3) // 2° > 3°> 1°
		{
			JOptionPane.showMessageDialog(null, num1 + "," + num3 + "," + num2);
		}
		else if(num3 > num1 && num3> num2 && num1>num2) // 3° > 1°> 2°
		{
			JOptionPane.showMessageDialog(null, num2 + "," + num1 + "," + num3);
		}
		else // 3° > 2°> 1°
		{
			JOptionPane.showMessageDialog(null, num1 + "," + num2 + "," + num3);
		}
	}
}
