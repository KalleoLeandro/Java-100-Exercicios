package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar a possibilidade de votação com
 * base na idade e exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio40 
{

	/*
	 *Método principal de exibição do programa 
	 */
	public static void main(String[] args) 
	{
		//Declação de variáveis
		int ano;
		
		//Atribuição de valores
		ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento de uma pessoa"));
		
		//Comparação e exibição em tela
		
		if(2021 - ano >=18)
		{
			JOptionPane.showMessageDialog(null, "A pessoa poderá votar este ano");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "A pessoa não poderá votar este ano");
		}

	}

}
