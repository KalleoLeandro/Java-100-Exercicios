package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para imprimir os n�meros racionais de 1 a 10, com 11 casas decimais contendo um uma raz�o crescente,
 * e exibir o resultado em tela 
 * @author Kalleo Leandro dos Santos Leal
 * @since 11/02/2021 
 */
public class Exercicio86 
{

	/*
	 *M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		String valores="";
		
		//La�o para concatena��o dos valores em uma string
		//Poderia ser impresso direto no la�o, caso usar sysout 
		
				
		for (int i=1;i<=10;i++)
		{
			valores += i+",12345678910\n";
		}
		
		//Impress�o em tela
		
		JOptionPane.showMessageDialog(null, valores);

	}

}
