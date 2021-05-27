package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a termperatura do Sistema Internacional convertida no
 * Sistema Imperial com base nos valores informados pelo usuário  
 *     
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio30
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		
		double fahrenheit,celsius;		
		
		//Atribuição do valor
		
		celsius = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em celsius "));
					
		
				
		//Efetuando o calculo da conversão
		
		fahrenheit = ((9 * celsius) / 5) + 32;		
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"A temperatura convertida de C° para F° é de " + fahrenheit);
												
	}
}
