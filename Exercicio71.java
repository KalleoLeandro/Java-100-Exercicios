package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber um valor informado pelo usuário 
 * e calcular a tabuada deste valor
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio71 
{

	/*
	 *Método para execução do programa
	 */
	public static void main(String[] args)
	{
		// Declaração de variáveis
		int n;
		
		//Laço controlador de entrada(evitar número fora do range)
		
		do
		{
			n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		}while(n < 1 || n > 10);
		
		//Cálculo e impressão em tela
		
		for (int i=1;i<11;i++)
		{
			JOptionPane.showMessageDialog(null, n*i);
		}		

	}
}
