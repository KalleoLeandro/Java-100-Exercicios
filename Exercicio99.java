package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e armazenar em um array os valores. Depois, receber um valor e verificar
 * quantas vezes esse valor aparece no array. Imprimir a quantidade.
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/02/2021
 */
public class Exercicio99 
{

	/*
	 *Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double numeros [] = new double[10];
		double valor;
		int qt = 0;
		
		//Atribuição dos valores
		//Para o array
		for(int i = 0; i < numeros.length;i++)
		{
			numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i + 1) + "° valor"));
		}
		
		//Receber o valor a ser procurado
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser verificado"));
		
		//Varrer o array em busca do valor, caso encontre, acumular a variável qt com mais 1
		
		for(int i = 0; i < numeros.length;i++)
		{
			if(numeros[i] == valor)
			{
				qt++;
			}			
		}
		
		//Impressão em tela da quantidade
		
		JOptionPane.showMessageDialog(null, "O total de vezes que o valor digitado pertence ao array é de " + qt + " vezes");		
	}

}
