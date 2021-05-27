package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir aa media final ponderada de acordo com os
 * valor fornecidos pelo usuário   
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio24
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		int n1,n2,n3;
		double media;
		
		//Atribuição do valor
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a primeira parcial"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a segunda parcial"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a terceira parcial"));
				
		
		
		//Efetuando o cálculo		
		
		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10; 
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"A média final do aluno é " + media);
	}
}