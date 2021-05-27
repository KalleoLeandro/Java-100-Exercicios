package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o reajuste salarial com os valores  recebido do usu�rio
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio19
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double salario;
		int reajuste;
		
		//Recebendo valores do usu�rio
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario "));
		reajuste = Integer.parseInt(JOptionPane.showInputDialog("Informe o percentual de reajuste "));
		
		//Efetuando os c�lculos
		
		salario = salario + (salario * reajuste/100);
		
		 
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O salario reajustado do funcion�rio � de R$" + salario);
	}
}
