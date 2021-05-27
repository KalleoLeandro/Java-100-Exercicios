package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 númerose e efetuar a soma dos valores menores que 40.
 * Após, imprimir os valores em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio77 
{

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		
		double n,soma=0;
		
		//Atribuição dos valores com soma simplificada
		for(int i = 0;i<10;i++)
		{
			n = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));
			if (n < 40)
			{
				soma +=n;
			}
		}
		
		//Impressão em tela
		
		JOptionPane.showMessageDialog(null, "A soma dos valores menores que 40 é de " + soma);

	}

}
