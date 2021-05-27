package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber um valor informado pelo usu�rio 
 * e calcular a tabuada deste valor
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio71 
{

	/*
	 *M�todo para execu��o do programa
	 */
	public static void main(String[] args)
	{
		// Declara��o de vari�veis
		int n;
		
		//La�o controlador de entrada(evitar n�mero fora do range)
		
		do
		{
			n = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
		}while(n < 1 || n > 10);
		
		//C�lculo e impress�o em tela
		
		for (int i=1;i<11;i++)
		{
			JOptionPane.showMessageDialog(null, n*i);
		}		

	}
}
