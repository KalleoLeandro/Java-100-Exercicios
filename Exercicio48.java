package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar o maior valor entre os informados
 * e exibir o mesmo em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio48 
{

	/*
	 *M�todo principal de exibi��o do programa 
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double num1, num2,num3;
		
		//Atribui��o dos valores
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro n�mero"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo n�mero"));
		num3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro n�mero"));
		
		//Compara��o e exibi��o em tela
		
		if((num1 > num2) && (num1> num3))
		{
			JOptionPane.showMessageDialog(null, "O maior valor entre os valores digitados � " + num1);
		}
		else if((num2 > num1)&&(num2> num3))
		{
			JOptionPane.showMessageDialog(null, "O maior valor entre os valores digitados � " + num2);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "O maior valor entre os valores digitados � " + num3);
		}

	}

}
