package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler valor e criar tres arrays de tamanho igual ao valor.
 * Receber valores para o primeiro e o segundo e armazenar no terceiro a soma dos dois primeiros.
 * Imprimir o terceiro array.
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/02/2021
 */
public class Exercicio94
{

	/*
	 *Método principal de execução do programa
	 */
	public static void main(String[] args)
	{
		// Declaração de variável de valor
		int valor;
		
		//Atribuição do valor
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para o tamanho do armazenamento"));
		
		//Declaração dos array de tamanho valor		
		
		double vetora[] = new double[valor];
		double vetorb[] = new double[valor];
		double vetorsoma[] = new double[valor];
		String resultado="";
		
		//Atribuição dos valores ao vetor a e b por meio de laços de repetição
		
		//Vetor A
		for (int i = 0;i <vetora.length;i++)
		{
			vetora[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i+1) + "° número para o 1° vetor"));
		}
		
		//Vetor B
		for (int i = 0;i <vetora.length;i++)
		{
			vetora[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i+1) + "° número para o 2° vetor"));
		}
		
		//Cálculo do terceiro vetor
		
		for(int i = 0 ; i < vetorsoma.length;i++)
		{
			vetorsoma[i] = vetora[i] + vetorb[i];
		}
		
		//Concatenação de resultados, essa parte poderia ser ignorada em caso de impressão via sysout
		
		for(int i = 0 ; i < vetorsoma.length;i++)
		{
			resultado += (i+1) + "ª soma: " + vetorsoma[i] +"\n";
		}
		
		//Impressão em tela
		
		JOptionPane.showMessageDialog(null, resultado);		

	}

}
