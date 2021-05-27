package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a área do retângulo com os valores  recebido do usuário
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio16 
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double base, altura, area;
		
		//Recebendo valores do usuário
		
		base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
		
		//Efetuando o cálculo
		
		area = base * altura;
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null, "A área do retângulo com as medidas informadas é " + area);		
		

	}

}
