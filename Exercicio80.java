package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para imprimir o valor total em estoque e a média das mercadorias
 * com base nos valores fornecidos pelo usuário
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021 
 */
public class Exercicio80 
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args)
	{
		// Declaração de variáveis
		int qt;
		double preco;
		
		//Atribuição dos valores
		
		qt = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de produtos do estoque"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço unitário do produto"));
		
		//Impressão em tela com cálculo
		
		JOptionPane.showMessageDialog(null, String.format("O valor total em estoque é de R$%.2f", (preco * qt)));
		JOptionPane.showMessageDialog(null, String.format("A média de preço das mercadorias é de R$%.2f", (qt / preco)));
		
		
		
				
		
		

	}

}
