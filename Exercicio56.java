package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 valores e exibir o resultado de
 * acordo com uma compara��o 
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio56 
{

	/*
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args)
	{
		// Declara��o de vari�veis
		double valor1,valor2;
		
		//Atribui��o dos valores
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
		
		//Compara��o
		
		if(valor1 == valor2)
		{
			JOptionPane.showMessageDialog(null, "N�meros iguais");
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
