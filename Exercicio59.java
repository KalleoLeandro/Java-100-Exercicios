package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e exibir o resultado
 * de uma compra, com base em uma comparação
 * e exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio59 
{

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double macas,morangos,totalmaca,totalmorango,total;
		
		//Atribuição dos valores
		
		macas = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de Kg de maças a serem adquiridas"));
		morangos = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de Kg de morangos a serem adquiridas"));
		
		//Cálculos e comparações
		
		//Valor maçãs
		
		if(macas <= 5)
		{
			totalmaca = macas * 2.5;
		}
		else
		{
			totalmaca = macas * 2.2;
		}
		
		//Valor morangos
		
		if(morangos <= 5)
		{
			totalmorango = morangos * 1.8;
		}
		else
		{
			totalmorango = morangos * 1.5;
		}
		
		//Total
		
		total = totalmaca + totalmorango;
		
		//Dedução em caso de desconto
		if(macas + morangos > 8 || total > 25)
		{
			total = total - total*0.1;
		}
		
		//Impressão em tela
		
		JOptionPane.showMessageDialog(null, "O valor total a ser pago é de R$"+ total);		
		
	}
}
