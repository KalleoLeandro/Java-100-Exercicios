package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a soma de 10 n�meros informados pelo usu�rio.
 * Ap�s, imprimir o resultado em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021 
 */
public class Exercicio76 
{

	/*
	 *M�todo principal de execu��o do programa 
	 */
	
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		
		double soma=0;
		
		//Atribui��o dos valores e soma simplificada
		
		for (int i = 0; i<10; i++)
		{
			soma += Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero"));
		}
		
		//Impress�o em tela
		
		JOptionPane.showMessageDialog(null, "A soma dos valores �" + soma);

	}

}
