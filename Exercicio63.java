package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para validar a possiblidade de aposentadoria com base nos valores
 * fornecidos pelo usuário, e exibido o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio63 
{

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		int codigo,anonascimento,anoingresso,idade,tempodetrabalho;		
		
		//Atribuição dos valores
		
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do funcionário"));
		anonascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento do funcionário"));
		anoingresso = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de ingresso na empresa"));
		
		//Cálculos

		//Tempo de trabalho		
		tempodetrabalho = 2021 - anoingresso;		
		
		//Idade
		
		idade = 2021 - anonascimento;		
		
		//Comparação e exibição em tela
		if(idade >=65 || tempodetrabalho >=30 || (idade >=60 && tempodetrabalho >=25))
		{
			JOptionPane.showMessageDialog(null,"Funcionário código: " + codigo
											+ "\nRequerer aposentadoria");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Funcionário código: " + codigo
											  +"\nNão requerer");
		}

	}

}
