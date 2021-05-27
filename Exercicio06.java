package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dados do usu�rio e exibir em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 */
public class Exercicio06 
{

	/*
	 * M�todo principal de execu��o do programa 
	 */
	
	public static void main(String[] args) 
	{
		//Declara��o de vari�veis
		String nome, celular, cidade;
		
		
		//Recebendo dados do usu�rio
		
		nome = JOptionPane.showInputDialog("Informe seu nome ");
		celular = JOptionPane.showInputDialog("Informe sua altura ");
		cidade = JOptionPane.showInputDialog("Informe seu peso ");
		
		//Exibindo as informa��es em tela
		
		JOptionPane.showMessageDialog(null, "Seu nome � " + nome+ "\nSeu celular � " +celular+"\nSua cidade � " + cidade);
		

	}

}
