package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 valores e verificar se � ou n�o
 * um tri�ngulo, e exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 *
 */
public class Exercicio54 
{

	/*
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args)
	{
		// Declara��o de vari�veis
		double a,b,c;
		
		//Atribui��o dos valores
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro lado"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo lado"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro lado"));
		
		//Compara��o e exibi��o em tela
		
		if(a+b > c && b+c >a && a+c > b)
		{
			JOptionPane.showMessageDialog(null, "A,B e C s�o lados de um tri�ngulo");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "A,B e C n�o s�o lados de um tri�ngulo");
		}
		

	}

}
