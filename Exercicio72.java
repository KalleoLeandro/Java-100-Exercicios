package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar a quantidade de números negativos
 * informados pelo usuário, e imprimir a quantidade em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio72 
{

	/*
	 *Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis 
		int negativos=0; 
		double n;
		
		for(int i = 0;i<10;i++)
		{
			n = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));
			if(n < 0)
			{
				negativos++;
			}
		}
		
		//Impressão em tela
		
		JOptionPane.showMessageDialog(null, "O total de números negativos é " + negativos);

	}

}
