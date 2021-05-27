package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o sal�rio final do vendedor com os valores informado pelo usu�rio  
 * @author kleal
 * @since 05/02/2021
 *
 */
public class Exercicio22
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double salariobase,valorvenda, comissao, salariofinal;
		int carrosvendidos;		
		
		//Atribui��o do valor
		
		salariobase = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salario base do funcion�rio "));
		carrosvendidos = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de carros vendidos pelo funcion�rio "));
		valorvenda = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor das vendas do funcion�rio "));	
		comissao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da comiss�o por carro vendido pelo funcion�rio "));	
		
		
		
		//Efetuando o c�lculo		
	    
		salariofinal = salariobase + (carrosvendidos * comissao) + (valorvenda * 0.05);
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O sal�rio final do vendedor � de R$" + salariofinal);
	}
}
