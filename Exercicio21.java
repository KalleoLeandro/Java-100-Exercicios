package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o custo final para o consumidor com o valor de f�brica informado pelo usu�rio  
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio21
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double custoinicial, custofinal;		
		
		//Atribui��o do valor
		
		custoinicial = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de f�brica do autom�vel "));		
		
		
		
		//Efetuando o c�lculo	
		
		custofinal = custoinicial + (custoinicial * 0.28) + (custoinicial * 0.45);	
		 
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O custo final do ve�culo ao consumidor final � de R$" + custofinal);
	}
}
