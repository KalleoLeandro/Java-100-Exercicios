package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar se um n�mero � maior ou n�o que 10
 * e exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio36 
{

	/*
	 * M�todo principal de execu��o do programa	 *
	 */
	public static void main(String[] args)
	{
		// Declara��o de vari�veis
		double num;
		
		//Atribui��o de valor
		num = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero"));
		
		//Compara��o e exibi��o em tela
		
		if(num > 10)
		{
			JOptionPane.showMessageDialog(null, "� MAIOR QUE 10");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "N�O � MAIOR QUE 10");
		}
		

	}

}
