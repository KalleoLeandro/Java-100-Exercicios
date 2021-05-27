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
	 *M�todo principal de execu��o do programa
	 */
	public static void main(String[] args)
	{
		// Declara��o de vari�vel de valor
		int valor;
		
		//Atribui��o do valor
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para o tamanho do armazenamento"));
		
		//Declara��o dos array de tamanho valor		
		
		double vetora[] = new double[valor];
		double vetorb[] = new double[valor];
		double vetorsoma[] = new double[valor];
		String resultado="";
		
		//Atribui��o dos valores ao vetor a e b por meio de la�os de repeti��o
		
		//Vetor A
		for (int i = 0;i <vetora.length;i++)
		{
			vetora[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i+1) + "� n�mero para o 1� vetor"));
		}
		
		//Vetor B
		for (int i = 0;i <vetora.length;i++)
		{
			vetora[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i+1) + "� n�mero para o 2� vetor"));
		}
		
		//C�lculo do terceiro vetor
		
		for(int i = 0 ; i < vetorsoma.length;i++)
		{
			vetorsoma[i] = vetora[i] + vetorb[i];
		}
		
		//Concatena��o de resultados, essa parte poderia ser ignorada em caso de impress�o via sysout
		
		for(int i = 0 ; i < vetorsoma.length;i++)
		{
			resultado += (i+1) + "� soma: " + vetorsoma[i] +"\n";
		}
		
		//Impress�o em tela
		
		JOptionPane.showMessageDialog(null, resultado);		

	}

}
