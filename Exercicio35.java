package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e exibir a idade de uma pessoa em diferentes medidas de tempo
 * com base nos valores informados pelo usu�rio
 *      
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio35
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		
		int anoatual,anonascimento,idade,semanas,meses,dias;
		
		
		//Atribui��o do valor
		
		anonascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento de uma pessoa "));
		anoatual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual"));		
		
		
						
		//Efetuando os c�lculos por per�odo	
		
		idade = anoatual - anonascimento;
		semanas = idade * 52;
		meses = idade * 12;
		dias = idade * 365;
		
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"A idade dessa pessoa em anos � " + idade + 
											"\nA idade dessa pessoa em meses � " + meses +
											"\nAidade dessa pessoa em dias � "+ dias +
											"\nA idade dessa pessoa em semanas � " + semanas);
												
	}
}
