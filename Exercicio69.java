package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para imprimir um intervalo fechado de n�meros de 1 a n,
 * com n informado pelo usu�rio
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio69 
{

	/*
	 *M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		//Declara��o de vari�veis
		int n;
		
		//La�o controlador de entrada(evitar valor fora do range)
		do
		{
			n = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
			
		}while(n<=0);
		
		//Impress�o direta dos valores
		
		for(int i = 1; i<=n;i++)
		{
			System.out.println(i);
		}

	}

}
