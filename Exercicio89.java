package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler as notas de 20 alunos e guardar em um array. 
 * Após, calcular a média de notas e quantas notas estiveram acima da média.
 * Imprimir os resultados. 
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/02/2021
 */
public class Exercicio89 
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double notas[] = new double[20];
		double media=0;
		int maiores=0;
		
		//Atribuição dos valores das notas ao array por meio de laço de repetição
		
		for (int i = 0; i<notas.length;i++)
		{
			notas[i] =  Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do " + (i + 1) + "° aluno"));
			media += notas[i]; //Ao invés de efetuar um laço só pra média, aproveita-se este único laço para fazer o somatório das notas
		}
		
		//Cálculo da média dos alunos, usando o tamanho do vetor como divisor(no caso do exercicio equivale a 20)
		
		media /= notas.length;
		
		//Verificar quantidade acima da média	
		
		for(int i=0;i<notas.length;i++)
		{
			if(notas[i] > media)
			{
				maiores++;
			}
		}
		
		//Impressão em tela
		
		JOptionPane.showInternalMessageDialog(null, "A média da classe é " + media
												  + "\nO total de alunos acima da média é " + maiores);

	}

}
