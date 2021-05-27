package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar se valor � positivo ou n�o
 * e exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio37 
{

	/*
	 * M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double num;
		
		//Atribui��o dos valores
		num = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero"));
		
		//Compara��o e exibi��o dos valores em tela
		
		if(num >=0)
		{
			JOptionPane.showMessageDialog(null, "O valor � positivo");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "O valor � negativo");
		}

	}

}
