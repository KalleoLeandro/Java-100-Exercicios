package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e exibir o total de reais, conforme o número de moedas e seus valores
 * informados pelo usuário     
 *     
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio33
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		
		double um,cinco,dez,vintecinco,cinquenta,umreal,total;
		
		
		//Atribuição dos valores
		
		um = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de moedas de R$0,01"));
		cinco = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de moedas de R$0,05"));
		dez = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de moedas de R$0,10"));
		vintecinco = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de moedas de R$0,25"));
		cinquenta = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de moedas de R$0,50"));
		umreal = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de moedas de R$1,00"));
		
				
		//Efetuando o calculo dos valores convertidos, considerando seu valor
		
		total = (um*0.01) + (cinco*0.05) + (dez*0.1) + (vintecinco*0.25) + (cinquenta*0.5) + umreal;   
		
		
		
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O valor total em reais economizado é de R$" + total);
												
	}
}
