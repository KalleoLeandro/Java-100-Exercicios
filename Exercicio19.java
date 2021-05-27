package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o reajuste salarial com os valores  recebido do usuário
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio19
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double salario;
		int reajuste;
		
		//Recebendo valores do usuário
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario "));
		reajuste = Integer.parseInt(JOptionPane.showInputDialog("Informe o percentual de reajuste "));
		
		//Efetuando os cálculos
		
		salario = salario + (salario * reajuste/100);
		
		 
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O salario reajustado do funcionário é de R$" + salario);
	}
}
