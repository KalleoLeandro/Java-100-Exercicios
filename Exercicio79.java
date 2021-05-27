package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e imprimir o resultado da m�dia aritm�tica
 * do intervalo fechado de inteiros de 15 a 100
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio79 
{

	/*
	 *M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double soma=0;
		int n=0;
		
		//C�lculo de soma simplificada em la�o
		
		for (int i = 15; i<=100; i++)
		{
			soma += i;
			n++;
		}
		
		//Impress�o em tela com string formatada
		
		JOptionPane.showMessageDialog(null,String.format("A m�dia aritm�tica do intervalo fechado de 15 a 100 � de %.2f",(soma/n)));

	}

}
