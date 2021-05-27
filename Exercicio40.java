package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar a possibilidade de vota��o com
 * base na idade e exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio40 
{

	/*
	 *M�todo principal de exibi��o do programa 
	 */
	public static void main(String[] args) 
	{
		//Decla��o de vari�veis
		int ano;
		
		//Atribui��o de valores
		ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento de uma pessoa"));
		
		//Compara��o e exibi��o em tela
		
		if(2021 - ano >=18)
		{
			JOptionPane.showMessageDialog(null, "A pessoa poder� votar este ano");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "A pessoa n�o poder� votar este ano");
		}

	}

}
