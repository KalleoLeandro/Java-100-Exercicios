package exercicios;

import javax.swing.JOptionPane;


/**
 * Programa para ler 10 números, armazenar o mesmos em um array e ordenar o array. Após, ler mais 1 número
 * e inserí-lo no array mantendo a ordem crescente . Imprimir o array com o novo valor. 
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021 
 */
public class Exercicio96
{

	/*
	 *Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		
		double vetor [] =  new double[10];
		double vetorb[] = new double[11];
		double aux, valor;		
		String resultado = "";
		
		//Atribuição dos valores ao array
		
		for(int i = 0; i < vetor.length;i++)
		{
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i+1) + "° número"));
		}
		
		//Existem 2 formas para resolver o problema, a função array.sort() e o método bubblesort(método de ordenação bolha)
		
		//A função Arrays.sort automáticamente ordena o vetor em ordem crescente
		
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
		
		//Recebimento do valor extra
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor a ser adicionado ao vetor"));
		
		/*O Exercício não especifíca se o vetor deve ser alterado e excluído o ultimo valor em caso de substituição
		 *Assim sendo, partimos do princípio que devemos criar outro vetor que conterá o valor na posição correta		 
		*/
		
		//Faremos o segundo vetor receber o primeiro mais o termo a ser inserido no vetor
		for(int i = 0; i< vetor.length;i++)
		{
			vetorb[i] = vetor[i];
		}

		//Aqui colocamos o valor recebido pelo usuário na última casa do vetor
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
		//Impressão em tela		
		
		for(int i = 0;i< vetorb.length;i++)
		{
			resultado += (i + 1) + "° valor: " + vetorb[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}