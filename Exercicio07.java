package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dados do usu�rio e exibir em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 */
public class Exercicio07 
{

	/*
	 * M�todo principal de execu��o do programa 
	 */
	
	public static void main(String[] args) 
	{
		//Declara��o de vari�veis
		int idade;
		double altura, peso;
		
		//Recebendo dados do usu�rio
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura "));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso "));
		
		//Exibindo as informa��es em tela
		
		JOptionPane.showMessageDialog(null, "Sua idade � " + idade + "anos\nSua altura � " + altura + "m\nSeu peso � "+ peso);
		

	}

}
