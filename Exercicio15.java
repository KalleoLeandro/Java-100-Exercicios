package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o antecessor  do valor  recebidos do usu�rio
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio15 
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		int num1, ant;
		
		//Recebendo valores do usu�rio
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));		
		
		//Efetuando o c�lculo
		
		ant = num1 - 1;
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null, "O antecessor do valor informado � " + ant);		
		

	}

}
