package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 2 valores e efetuar a soma do intervalo fechado entre os valores.
 * Após, imprimir em tela o resultado 
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021 
 */
public class Exercicio78 
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		int n1,n2,soma=0;
		
		//Atribuição de valores
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		
		//Recebendo n2 testando se é menor que n1, em caso afirmativo, retorna a pedir o valor
		do
		{
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}while(n2 <= n1);
		
		
		//Cálculo da soma simplificada
		for (int i = n1 ; i<=n2;i++)
		{
			soma += i;
		}
		
		//Impressão em tela
		
		JOptionPane.showMessageDialog(null, "A soma do intervalo fechado dos valores informados é " + soma );

	}

}
