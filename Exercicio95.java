package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números, armazenar o mesmos em um array e ordenar o array. Imprimir o
 * array ordenado.
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021 
 */
public class Exercicio95
{

	/*
	 *Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		
		double vetor [] =  new double[10];
		double aux;
		
		//Atribuição dos valores ao array
		
		for(int i = 0; i < vetor.length;i++)
		{
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i+1) + "° número"));
		}
		
		//Existem 2 formas para resolver o problema, a função array.sort() e o método bubblesort(método de ordenação bolha)
		
		//A função Arrays.sort automáticamente ordena o vetoror em ordem crescente
		
		/*
		  
		 
		   Arrays.sort(vetor);
		 
		 */
		
		//Para o exercício, iremos usar o método bubblesort(ou método de ordenação bolha)
		for(int i = 0; i< vetor.length; i++)
		{
			for(int j = 0; j < vetor.length-1; j++)
			{
				if(vetor[j] > vetor[j + 1])
				{
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}				
			}
		}
		
		
		//Impressão em tela		
		
		for(int i = 0;i< vetor.length;i++)
		{
			System.out.println(vetor[i]);
		}
	}
}
