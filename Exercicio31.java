package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o gasto total com a granja
 * com base nos valores informados pelo usuário  
 *     
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio31
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		
		double total;		
		
		//Atribuição do valor
		
		total = Double.parseDouble(JOptionPane.showInputDialog("Informe o número total de frangos na granja"));
		
				
		//Efetuando o calculo do gasto		
    
		total = total* 4 + total * 7;
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O valor total do gasto na granja é de "+total);
												
	}
}
