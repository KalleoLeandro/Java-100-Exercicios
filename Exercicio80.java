package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para imprimir o valor total em estoque e a m�dia das mercadorias
 * com base nos valores fornecidos pelo usu�rio
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021 
 */
public class Exercicio80 
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args)
	{
		// Declara��o de vari�veis
		int qt;
		double preco;
		
		//Atribui��o dos valores
		
		qt = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de produtos do estoque"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o unit�rio do produto"));
		
		//Impress�o em tela com c�lculo
		
		JOptionPane.showMessageDialog(null, String.format("O valor total em estoque � de R$%.2f", (preco * qt)));
		JOptionPane.showMessageDialog(null, String.format("A m�dia de pre�o das mercadorias � de R$%.2f", (qt / preco)));
		
		
		
				
		
		

	}

}
