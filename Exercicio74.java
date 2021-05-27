package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber 10 valores e  calcular a média dos valores informados pelo usuário.
 * Após, imprimir o resultado em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021 
 */
public class Exercicio74 
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		//Declaração das variáveis
		double valor=0;
		
		//Atribuição dos valores
		
		for(int i = 0;i < 10;i++)//Laço para recebimento dos valores
		{
			valor += Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));//Recebimento de valor por meio de soma simplificada
		}	
		
		//Cálculo da média
		
		valor /= 10;
				
		//Impressão em tela
		
		JOptionPane.showMessageDialog(null, String.format("A média aritmética dos valores é %.1f", valor));
		
	}

}
