package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a descri��o, quantidade adquirida e pre�o unit�rio de um produto. Ap�s, calcular e 
 * exibir o valor total do produto, o desconto, e o valor a pagar com desconto
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio61 
{

	/*
	 *M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		String descricao;
		int qt;
		double preco,total;
		
		//Atribui��o dos valores
		descricao = JOptionPane.showInputDialog("Informe o nome do produto");
		qt = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade a ser adquirida de um produto"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preco unit�rio do produto"));
		
		//C�lculo do total
		
		total = qt * preco;
		
		//C�lculo do desconto
		
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
		
		//Impress�o em tela
		
		JOptionPane.showMessageDialog(null, "O valor total a ser pago pelo produto " +descricao +" � de R$" + total);

	}

}
