package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para imprimir os números racionais de 1 a 10, com 11 casas decimais contendo um uma razão crescente,
 * e exibir o resultado em tela 
 * @author Kalleo Leandro dos Santos Leal
 * @since 11/02/2021 
 */
public class Exercicio86 
{

	/*
	 *Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		String valores="";
		
		//Laço para concatenação dos valores em uma string
		//Poderia ser impresso direto no laço, caso usar sysout 
		
				
		for (int i=1;i<=10;i++)
		{
			valores += i+",12345678910\n";
		}
		
		//Impressão em tela
		
		JOptionPane.showMessageDialog(null, valores);

	}

}
