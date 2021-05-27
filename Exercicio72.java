package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar a quantidade de n�meros negativos
 * informados pelo usu�rio, e imprimir a quantidade em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio72 
{

	/*
	 *M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis 
		int negativos=0; 
		double n;
		
		for(int i = 0;i<10;i++)
		{
			n = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero"));
			if(n < 0)
			{
				negativos++;
			}
		}
		
		//Impress�o em tela
		
		JOptionPane.showMessageDialog(null, "O total de n�meros negativos � " + negativos);

	}

}
