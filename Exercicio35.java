package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e exibir a idade de uma pessoa em diferentes medidas de tempo
 * com base nos valores informados pelo usuário
 *      
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio35
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		
		int anoatual,anonascimento,idade,semanas,meses,dias;
		
		
		//Atribuição do valor
		
		anonascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento de uma pessoa "));
		anoatual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual"));		
		
		
						
		//Efetuando os cálculos por período	
		
		idade = anoatual - anonascimento;
		semanas = idade * 52;
		meses = idade * 12;
		dias = idade * 365;
		
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"A idade dessa pessoa em anos é " + idade + 
											"\nA idade dessa pessoa em meses é " + meses +
											"\nAidade dessa pessoa em dias é "+ dias +
											"\nA idade dessa pessoa em semanas é " + semanas);
												
	}
}
