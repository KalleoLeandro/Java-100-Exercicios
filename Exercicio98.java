package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 30 n�meros(15 para um array A e 15 parar um array B). Verificar a quantidade de vez que
 * que ambos os vetores possuem valores coincidentes , incluindo seus �ndices.   
 * @author Kalleo Leandro dos Santos Leal
 * @since 
 */
public class Exercicio98 
{

	/*
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double v1 [] = new double[15];		
		double v2 [] = new double[15];
		int qt=0;
		
		//Atribui��o de valores aos arrays
		
		//Vetor v1
		for(int i = 0;i < v1.length;i++)
		{
			v1[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i+1) +"� valor do 1� array"));
		}
		
		//Vetor v2
		for(int i = 0;i < v2.length;i++)
		{
			v2[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i+1) +"� valor do 2� array"));
		}
		
		//Verificar a quantidade de coincid�ncias
		
		for(int i = 0;i < v1.length;i++)
		{
			if(v1[i] == v2[i])
			{
				qt++;
			}
		}
		
		//Impress�o em tela
		
		JOptionPane.showMessageDialog(null, "A quantidade de valores repetidos em mesmas casas nos arrays � de " +qt);
		

	}

}
