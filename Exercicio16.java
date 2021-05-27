package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a �rea do ret�ngulo com os valores  recebido do usu�rio
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio16 
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double base, altura, area;
		
		//Recebendo valores do usu�rio
		
		base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
		
		//Efetuando o c�lculo
		
		area = base * altura;
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null, "A �rea do ret�ngulo com as medidas informadas � " + area);		
		

	}

}
