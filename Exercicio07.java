package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dados do usuário e exibir em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 */
public class Exercicio07 
{

	/*
	 * Método principal de execução do programa 
	 */
	
	public static void main(String[] args) 
	{
		//Declaração de variáveis
		int idade;
		double altura, peso;
		
		//Recebendo dados do usuário
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura "));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso "));
		
		//Exibindo as informações em tela
		
		JOptionPane.showMessageDialog(null, "Sua idade é " + idade + "anos\nSua altura é " + altura + "m\nSeu peso é "+ peso);
		

	}

}
