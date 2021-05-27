package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o c�digo e o pre�o de 5 produtos, ap�s, imprimir a m�dia aritm�tica e
 * o maior pre�o lido em tela 
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021 
 */
public class Exercicio83 
{

	/*
	 *M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		String codigo;
		double preco, soma=0,maior=0;
		
		//Atribui��o dos valores por meio de la�o
		
		for (int i = 1 ;i < 5 ;i++)
		{
			codigo = JOptionPane.showInputDialog("Informe o c�digo");
			preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preco"));		
			soma += preco;
			if(preco > maior)
			{
				maior = preco;
			}			
		}
		
		//Impress�o em tela dos valores
		
		JOptionPane.showMessageDialog(null, "A m�dia aritm�tica dos pre�os � " + soma/5 +
											"\nO maior pre�o informado � R$" + maior);		

	}

}
