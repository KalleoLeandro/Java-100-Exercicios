package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler as notas de 20 alunos e guardar em um array. 
 * Ap�s, calcular a m�dia de notas e quantas notas estiveram acima da m�dia.
 * Imprimir os resultados. 
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/02/2021
 */
public class Exercicio89 
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double notas[] = new double[20];
		double media=0;
		int maiores=0;
		
		//Atribui��o dos valores das notas ao array por meio de la�o de repeti��o
		
		for (int i = 0; i<notas.length;i++)
		{
			notas[i] =  Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do " + (i + 1) + "� aluno"));
			media += notas[i]; //Ao inv�s de efetuar um la�o s� pra m�dia, aproveita-se este �nico la�o para fazer o somat�rio das notas
		}
		
		//C�lculo da m�dia dos alunos, usando o tamanho do vetor como divisor(no caso do exercicio equivale a 20)
		
		media /= notas.length;
		
		//Verificar quantidade acima da m�dia	
		
		for(int i=0;i<notas.length;i++)
		{
			if(notas[i] > media)
			{
				maiores++;
			}
		}
		
		//Impress�o em tela
		
		JOptionPane.showInternalMessageDialog(null, "A m�dia da classe � " + media
												  + "\nO total de alunos acima da m�dia � " + maiores);

	}

}
