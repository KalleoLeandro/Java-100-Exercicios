package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar se valor é positivo ou não
 * e exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio37 
{

	/*
	 * Método principal de execução do programa 
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double num;
		
		//Atribuição dos valores
		num = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));
		
		//Comparação e exibição dos valores em tela
		
		if(num >=0)
		{
			JOptionPane.showMessageDialog(null, "O valor é positivo");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "O valor é negativo");
		}

	}

}
