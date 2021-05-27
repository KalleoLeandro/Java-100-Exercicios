package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a idade de uma pessoa em dias com os valores  recebido do usu�rio
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio17 
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		int anos,meses,dias,total;
		
		//Recebendo valores do usu�rio
		
		anos = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade em anos "));
		meses = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade em meses "));
		dias = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade em dias "));	
		
		//Efetuando o c�lculo
		
		total = (anos * 365) + (meses * 12) + dias; 
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null, "A idade dessa pessoa em dias � " + total);		
		

	}

}
