package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 30 números(15 para um array A e 15 parar um array B). Verificar a quantidade de vez que
 * que ambos os vetores possuem valores coincidentes , incluindo seus índices.   
 * @author Kalleo Leandro dos Santos Leal
 * @since 
 */
public class Exercicio98 
{

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double v1 [] = new double[15];		
		double v2 [] = new double[15];
		int qt=0;
		
		//Atribuição de valores aos arrays
		
		//Vetor v1
		for(int i = 0;i < v1.length;i++)
		{
			v1[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i+1) +"° valor do 1° array"));
		}
		
		//Vetor v2
		for(int i = 0;i < v2.length;i++)
		{
			v2[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i+1) +"° valor do 2° array"));
		}
		
		//Verificar a quantidade de coincidências
		
		for(int i = 0;i < v1.length;i++)
		{
			if(v1[i] == v2[i])
			{
				qt++;
			}
		}
		
		//Impressão em tela
		
		JOptionPane.showMessageDialog(null, "A quantidade de valores repetidos em mesmas casas nos arrays é de " +qt);
		

	}

}
