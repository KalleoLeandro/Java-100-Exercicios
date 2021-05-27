package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dados do usuário e exibir em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 */
public class Exercicio06 
{

	/*
	 * Método principal de execução do programa 
	 */
	
	public static void main(String[] args) 
	{
		//Declaração de variáveis
		String nome, celular, cidade;
		
		
		//Recebendo dados do usuário
		
		nome = JOptionPane.showInputDialog("Informe seu nome ");
		celular = JOptionPane.showInputDialog("Informe sua altura ");
		cidade = JOptionPane.showInputDialog("Informe seu peso ");
		
		//Exibindo as informações em tela
		
		JOptionPane.showMessageDialog(null, "Seu nome é " + nome+ "\nSeu celular é " +celular+"\nSua cidade é " + cidade);
		

	}

}
