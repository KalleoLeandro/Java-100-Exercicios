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
	 * M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args) 
	{
		//Declara��o de vari�veis
		double num1,num2;
		
		//Atribui��o dos valores
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe outro n�mero"));
		
		//Compara��o e exibi��o em tela
		
		if(num1 > num2)
		{
			JOptionPane.showMessageDialog(null, "O maior valor � " + num1);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "O maior valor � " + num2);
		}

	}

}
