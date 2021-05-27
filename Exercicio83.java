package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler o código e o preço de 5 produtos, após, imprimir a média aritmética e
 * o maior preço lido em tela 
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021 
 */
public class Exercicio83 
{

	/*
	 *Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		String codigo;
		double preco, soma=0,maior=0;
		
		//Atribuição dos valores por meio de laço
		
		for (int i = 1 ;i < 5 ;i++)
		{
			codigo = JOptionPane.showInputDialog("Informe o código");
			preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preco"));		
			soma += preco;
			if(preco > maior)
			{
				maior = preco;
			}			
		}
		
		//Impressão em tela dos valores
		
		JOptionPane.showMessageDialog(null, "A média aritmética dos preços é " + soma/5 +
											"\nO maior preço informado é R$" + maior);		

	}

}
