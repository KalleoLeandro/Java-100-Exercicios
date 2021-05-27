package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a capacidade final obtida com base em valores informados pelo usuário
 *     
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio25
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		
		double litros,preco,reais;
		
		//Atribuição do valor
		
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do litro de combustível "));		
		reais = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser pago "));		
				
		
		
		//Efetuando o cálculo		
		
		litros = reais / preco;
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O total de litros abastecido é de" + litros);
	}
}
