package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e exibir o resultado
 * de uma compra, com base em uma compara��o
 * e exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio59 
{

	/*
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double macas,morangos,totalmaca,totalmorango,total;
		
		//Atribui��o dos valores
		
		macas = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero de Kg de ma�as a serem adquiridas"));
		morangos = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero de Kg de morangos a serem adquiridas"));
		
		//C�lculos e compara��es
		
		//Valor ma��s
		
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
		
		//Dedu��o em caso de desconto
		if(macas + morangos > 8 || total > 25)
		{
			total = total - total*0.1;
		}
		
		//Impress�o em tela
		
		JOptionPane.showMessageDialog(null, "O valor total a ser pago � de R$"+ total);		
		
	}
}
