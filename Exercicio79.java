package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e imprimir o resultado da média aritmética
 * do intervalo fechado de inteiros de 15 a 100
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio79 
{

	/*
	 *Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double soma=0;
		int n=0;
		
		//Cálculo de soma simplificada em laço
		
		for (int i = 15; i<=100; i++)
		{
			soma += i;
			n++;
		}
		
		//Impressão em tela com string formatada
		
		JOptionPane.showMessageDialog(null,String.format("A média aritmética do intervalo fechado de 15 a 100 é de %.2f",(soma/n)));

	}

}
