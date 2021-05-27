package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o valor do salário de um vendedor 
 * e exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio45 
{

	/*
	 * Método principal de execução do programa
	 * 
	 */
	public static void main(String[] args)
	{
		// Declaração de variáveis
		double salariobase,valorvendas, total;
		
		//Atribuição dos valores
		salariobase = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário base deste funcionário"));
		valorvendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total das vendas do mesmo funcionário"));
		
		//Comparações e cálculo
		
		if(valorvendas <=1500)
		{
			total = salariobase + valorvendas * 0.03;
		}
		else
		{
			total = salariobase + 1500 * 0.03 + (valorvendas - 1500) * 0.05;
		}
		
		//Exibição em tela
		
		JOptionPane.showMessageDialog(null, "O salário final deste funcionário é de R$" + total);
		

	}

}
