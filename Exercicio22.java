package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o salário final do vendedor com os valores informado pelo usuário  
 * @author kleal
 * @since 05/02/2021
 *
 */
public class Exercicio22
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double salariobase,valorvenda, comissao, salariofinal;
		int carrosvendidos;		
		
		//Atribuição do valor
		
		salariobase = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salario base do funcionário "));
		carrosvendidos = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de carros vendidos pelo funcionário "));
		valorvenda = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor das vendas do funcionário "));	
		comissao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da comissão por carro vendido pelo funcionário "));	
		
		
		
		//Efetuando o cálculo		
	    
		salariofinal = salariobase + (carrosvendidos * comissao) + (valorvenda * 0.05);
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O salário final do vendedor é de R$" + salariofinal);
	}
}
