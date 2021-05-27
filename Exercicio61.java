package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a descrição, quantidade adquirida e preço unitário de um produto. Após, calcular e 
 * exibir o valor total do produto, o desconto, e o valor a pagar com desconto
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio61 
{

	/*
	 *Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		String descricao;
		int qt;
		double preco,total;
		
		//Atribuição dos valores
		descricao = JOptionPane.showInputDialog("Informe o nome do produto");
		qt = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade a ser adquirida de um produto"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preco unitário do produto"));
		
		//Cálculo do total
		
		total = qt * preco;
		
		//Cálculo do desconto
		
		if(qt<=5)
		{			
			total = total - total * 0.2;
		}
		else if(qt >5 && qt <=10)
		{			
			total = total - total * 0.3;
		}
		else
		{
			total = total - total * 0.5;			
		}
		
		//Impressão em tela
		
		JOptionPane.showMessageDialog(null, "O valor total a ser pago pelo produto " +descricao +" é de R$" + total);

	}

}
