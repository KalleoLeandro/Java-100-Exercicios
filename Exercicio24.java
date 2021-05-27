package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir aa media final ponderada de acordo com os
 * valor fornecidos pelo usu�rio   
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio24
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		int n1,n2,n3;
		double media;
		
		//Atribui��o do valor
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a primeira parcial"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a segunda parcial"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a terceira parcial"));
				
		
		
		//Efetuando o c�lculo		
		
		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10; 
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"A m�dia final do aluno � " + media);
	}
}