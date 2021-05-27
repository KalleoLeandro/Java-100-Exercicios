package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e exibir o total de reais, conforme o n�mero de moedas e seus valores
 * informados pelo usu�rio     
 *     
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio33
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		
		double um,cinco,dez,vintecinco,cinquenta,umreal,total;
		
		
		//Atribui��o dos valores
		
		um = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero de moedas de R$0,01"));
		cinco = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero de moedas de R$0,05"));
		dez = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero de moedas de R$0,10"));
		vintecinco = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero de moedas de R$0,25"));
		cinquenta = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero de moedas de R$0,50"));
		umreal = Double.parseDouble(JOptionPane.showInputDialog("Informe o n�mero de moedas de R$1,00"));
		
				
		//Efetuando o calculo dos valores convertidos, considerando seu valor
		
		total = (um*0.01) + (cinco*0.05) + (dez*0.1) + (vintecinco*0.25) + (cinquenta*0.5) + umreal;   
		
		
		
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O valor total em reais economizado � de R$" + total);
												
	}
}
