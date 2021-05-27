package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para validar a possiblidade de aposentadoria com base nos valores
 * fornecidos pelo usu�rio, e exibido o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio63 
{

	/*
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		int codigo,anonascimento,anoingresso,idade,tempodetrabalho;		
		
		//Atribui��o dos valores
		
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do funcion�rio"));
		anonascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento do funcion�rio"));
		anoingresso = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de ingresso na empresa"));
		
		//C�lculos

		//Tempo de trabalho		
		tempodetrabalho = 2021 - anoingresso;		
		
		//Idade
		
		idade = 2021 - anonascimento;		
		
		//Compara��o e exibi��o em tela
		if(idade >=65 || tempodetrabalho >=30 || (idade >=60 && tempodetrabalho >=25))
		{
			JOptionPane.showMessageDialog(null,"Funcion�rio c�digo: " + codigo
											+ "\nRequerer aposentadoria");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Funcion�rio c�digo: " + codigo
											  +"\nN�o requerer");
		}

	}

}
