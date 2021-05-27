package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e verificar o maior e o menor valor lido
 * @author Kalleo Leandro dos Santos Leal
 * @since 
 */
public class Exercicio81 
{

	/*
	 *Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double num, maior, menor;
		
		
		//Atribuição do primeiro valor para inicialização dos maiores e menores
		num = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));
		
		maior = num;
		menor = num;
		
		//Laço para atribuição dos valores
		for (int i = 1; i<10;i++) 
		{
			num = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));
			if(maior < num)
			{
				maior = num;
			}
			if(menor > num)
			{
				menor = num;
			}
		}
		
		//Impressão em tela
		
		if(maior == menor)
		{
			JOptionPane.showMessageDialog(null, String.format("Só foram digitados valores iguais: %.2f ", num));
		}
		else
		{
			JOptionPane.showMessageDialog(null, String.format("O maior valor é %.2f.\nO menor valor é %.2f ", maior,menor));
		}

	}

}
