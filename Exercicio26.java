package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a quantidade de dias passados do ano com base em valores informados pelo usu�rio
 *     
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio26
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		
		int dia, mes;
		
		//Atribui��o do valor
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia "));		
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes "));		
				
		
		
		//Efetuando o c�lculo		
		
		mes = ((mes - 1) * 30) + dia;	
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O n�mero de dias que se passou desde o in�cio do ano � de " + mes);
	}
}
