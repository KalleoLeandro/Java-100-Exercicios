package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para imprimir um intervalo fechado de números de 1 a n,
 * com n informado pelo usuário
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio69 
{

	/*
	 *Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		//Declaração de variáveis
		int n;
		
		//Laço controlador de entrada(evitar valor fora do range)
		do
		{
			n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
			
		}while(n<=0);
		
		//Impressão direta dos valores
		
		for(int i = 1; i<=n;i++)
		{
			System.out.println(i);
		}

	}

}
