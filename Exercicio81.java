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
	 *M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double num, maior, menor;
		
		
		//Atribui��o do primeiro valor para inicializa��o dos maiores e menores
		num = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero"));
		
		maior = num;
		menor = num;
		
		//La�o para atribui��o dos valores
		for (int i = 1; i<10;i++) 
		{
			num = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero"));
			if(maior < num)
			{
				maior = num;
			}
			if(menor > num)
			{
				menor = num;
			}
		}
		
		//Impress�o em tela
		
		if(maior == menor)
		{
			JOptionPane.showMessageDialog(null, String.format("S� foram digitados valores iguais: %.2f ", num));
		}
		else
		{
			JOptionPane.showMessageDialog(null, String.format("O maior valor � %.2f.\nO menor valor � %.2f ", maior,menor));
		}

	}

}
