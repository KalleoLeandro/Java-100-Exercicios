package exercicios;

import javax.swing.JOptionPane;


/**
 * Programa para ler 10 n�meros, armazenar o mesmos em um array e ordenar o array. Ap�s, ler mais 1 n�mero
 * e inser�-lo no array mantendo a ordem crescente . Imprimir o array com o novo valor. 
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021 
 */
public class Exercicio96
{

	/*
	 *M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		
		double vetor [] =  new double[10];
		double vetorb[] = new double[11];
		double aux, valor;		
		String resultado = "";
		
		//Atribui��o dos valores ao array
		
		for(int i = 0; i < vetor.length;i++)
		{
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i+1) + "� n�mero"));
		}
		
		//Existem 2 formas para resolver o problema, a fun��o array.sort() e o m�todo bubblesort(m�todo de ordena��o bolha)
		
		//A fun��o Arrays.sort autom�ticamente ordena o vetor em ordem crescente
		
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
		
		//Recebimento do valor extra
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor a ser adicionado ao vetor"));
		
		/*O Exerc�cio n�o especif�ca se o vetor deve ser alterado e exclu�do o ultimo valor em caso de substitui��o
		 *Assim sendo, partimos do princ�pio que devemos criar outro vetor que conter� o valor na posi��o correta		 
		*/
		
		//Faremos o segundo vetor receber o primeiro mais o termo a ser inserido no vetor
		for(int i = 0; i< vetor.length;i++)
		{
			vetorb[i] = vetor[i];
		}

		//Aqui colocamos o valor recebido pelo usu�rio na �ltima casa do vetor
		vetorb[vetorb.length - 1] = valor;
		
		//Novamente fazemos o bubblesort, desta vez no vetor B
		
		for(int i = 0; i< vetorb.length; i++)
		{
			for(int j = 0; j < vetorb.length-1; j++)
			{
				if(vetorb[j] > vetorb[j + 1])
				{
					aux = vetorb[j];
					vetorb[j] = vetorb[j+1];
					vetorb[j+1] = aux;
				}				
			}
		}
		//Impress�o em tela		
		
		for(int i = 0;i< vetorb.length;i++)
		{
			resultado += (i + 1) + "� valor: " + vetorb[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}