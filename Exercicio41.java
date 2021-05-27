package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 valores e verificar o maior para exibir em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio41 
{

	/*
	 * Método principal de execução do programa 
	 */
	public static void main(String[] args) 
	{
		//Declaração de variáveis
		double num1,num2;
		
		//Atribuição dos valores
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe outro número"));
		
		//Comparação e exibição em tela
		
		if(num1 > num2)
		{
			JOptionPane.showMessageDialog(null, "O maior valor é " + num1);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "O maior valor é " + num2);
		}

	}

}
