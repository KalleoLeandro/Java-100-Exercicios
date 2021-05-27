package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o antecessor  do valor  recebidos do usuário
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio15 
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		int num1, ant;
		
		//Recebendo valores do usuário
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));		
		
		//Efetuando o cálculo
		
		ant = num1 - 1;
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null, "O antecessor do valor informado é " + ant);		
		

	}

}
