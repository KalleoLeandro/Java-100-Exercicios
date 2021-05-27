package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o custo final para o consumidor com o valor de fábrica informado pelo usuário  
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio21
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double custoinicial, custofinal;		
		
		//Atribuição do valor
		
		custoinicial = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de fábrica do automóvel "));		
		
		
		
		//Efetuando o cálculo	
		
		custofinal = custoinicial + (custoinicial * 0.28) + (custoinicial * 0.45);	
		 
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O custo final do veículo ao consumidor final é de R$" + custofinal);
	}
}
