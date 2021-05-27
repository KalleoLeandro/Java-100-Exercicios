package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir valores recebidos do usuário
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio08 
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double salario, vale;
		
		//Recebendo valores do usuário
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário"));
		vale = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu vale-refeição"));
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null, "O seu salário é de R$" + salario + "\nO seu vale-refeição é de R$" + vale);		
		

	}

}
