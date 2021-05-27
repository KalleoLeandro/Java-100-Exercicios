package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o valor do sal�rio de um vendedor 
 * e exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio45 
{

	/*
	 * M�todo principal de execu��o do programa
	 * 
	 */
	public static void main(String[] args)
	{
		// Declara��o de vari�veis
		double salariobase,valorvendas, total;
		
		//Atribui��o dos valores
		salariobase = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio base deste funcion�rio"));
		valorvendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total das vendas do mesmo funcion�rio"));
		
		//Compara��es e c�lculo
		
		if(valorvendas <=1500)
		{
			total = salariobase + valorvendas * 0.03;
		}
		else
		{
			total = salariobase + 1500 * 0.03 + (valorvendas - 1500) * 0.05;
		}
		
		//Exibi��o em tela
		
		JOptionPane.showMessageDialog(null, "O sal�rio final deste funcion�rio � de R$" + total);
		

	}

}
