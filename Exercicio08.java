package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir valores recebidos do usu�rio
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio08 
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double salario, vale;
		
		//Recebendo valores do usu�rio
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu sal�rio"));
		vale = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu vale-refei��o"));
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null, "O seu sal�rio � de R$" + salario + "\nO seu vale-refei��o � de R$" + vale);		
		

	}

}
