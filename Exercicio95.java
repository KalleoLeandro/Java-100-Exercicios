package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 n�meros, armazenar o mesmos em um array e ordenar o array. Imprimir o
 * array ordenado.
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021 
 */
public class Exercicio95
{

	/*
	 *M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		
		double vetor [] =  new double[10];
		double aux;
		
		//Atribui��o dos valores ao array
		
		for(int i = 0; i < vetor.length;i++)
		{
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i+1) + "� n�mero"));
		}
		
		//Existem 2 formas para resolver o problema, a fun��o array.sort() e o m�todo bubblesort(m�todo de ordena��o bolha)
		
		//A fun��o Arrays.sort autom�ticamente ordena o vetoror em ordem crescente
		
		/*
		  
		 
		   Arrays.sort(vetor);
		 
		 */
		
		//Para o exerc�cio, iremos usar o m�todo bubblesort(ou m�todo de ordena��o bolha)
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
		
		
		//Impress�o em tela		
		
		for(int i = 0;i< vetor.length;i++)
		{
			System.out.println(vetor[i]);
		}
	}
}
