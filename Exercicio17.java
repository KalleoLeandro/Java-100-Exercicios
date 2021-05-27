package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a idade de uma pessoa em dias com os valores  recebido do usuário
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio17 
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		int anos,meses,dias,total;
		
		//Recebendo valores do usuário
		
		anos = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade em anos "));
		meses = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade em meses "));
		dias = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade em dias "));	
		
		//Efetuando o cálculo
		
		total = (anos * 365) + (meses * 12) + dias; 
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null, "A idade dessa pessoa em dias é " + total);		
		

	}

}
