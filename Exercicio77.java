package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 n�merose e efetuar a soma dos valores menores que 40.
 * Ap�s, imprimir os valores em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio77 
{

	/*
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		
		double n,soma=0;
		
		//Atribui��o dos valores com soma simplificada
		for(int i = 0;i<10;i++)
		{
			n = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero"));
			if (n < 40)
			{
				soma +=n;
			}
		}
		
		//Impress�o em tela
		
		JOptionPane.showMessageDialog(null, "A soma dos valores menores que 40 � de " + soma);

	}

}
