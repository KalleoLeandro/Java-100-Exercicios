package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar se um número é maior ou não que 10
 * e exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio36 
{

	/*
	 * Método principal de execução do programa	 *
	 */
	public static void main(String[] args)
	{
		// Declaração de variáveis
		double num;
		
		//Atribuição de valor
		num = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero"));
		
		//Comparação e exibição em tela
		
		if(num > 10)
		{
			JOptionPane.showMessageDialog(null, "É MAIOR QUE 10");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "NÃO É MAIOR QUE 10");
		}
		

	}

}
