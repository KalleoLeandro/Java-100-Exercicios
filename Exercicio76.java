package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a soma de 10 números informados pelo usuário.
 * Após, imprimir o resultado em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021 
 */
public class Exercicio76 
{

	/*
	 *Método principal de execução do programa 
	 */
	
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		
		double soma=0;
		
		//Atribuição dos valores e soma simplificada
		
		for (int i = 0; i<10; i++)
		{
			soma += Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));
		}
		
		//Impressão em tela
		
		JOptionPane.showMessageDialog(null, "A soma dos valores é" + soma);

	}

}
