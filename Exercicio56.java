package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 valores e exibir o resultado de
 * acordo com uma comparação 
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio56 
{

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args)
	{
		// Declaração de variáveis
		double valor1,valor2;
		
		//Atribuição dos valores
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
		
		//Comparação
		
		if(valor1 == valor2)
		{
			JOptionPane.showMessageDialog(null, "Números iguais");
		}
		else if(valor1 > valor2)
		{
			JOptionPane.showMessageDialog(null, "Primeiro maior");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Segundo maior");
		}

	}

}
