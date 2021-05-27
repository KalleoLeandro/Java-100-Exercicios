package exercicios;

import javax.swing.JOptionPane;


/**
 * Programa par ler uma quantidade e depois uma quantidade de números baseado na primeira leitura.
 * Após, imprimir o maior número e a média dos números lidos
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021 
 */
public class Exercicio82 
{

	/*
	 *Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		int num, valor, maior; 
		double soma=0;
		
		//Atribuição do valor quantidade
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Informe uma quantidade"));
		
		//Atribuir o primeiro valor para poder receber o maior
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		
		maior = valor;
		
		//Cálculo da soma e comparação para modificar o maior dos números
		
		for (int i = 1 ; i < num ; i++)
		{
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
			soma += valor;
			if (valor > maior)
			{
				maior = valor;
			}
		}
		
		//Impressão em tela
		
		JOptionPane.showMessageDialog(null,String.format("O maior valor lido é %d \nA média aritmética dos números lidos é %.2f",maior,soma/num));

	}

}
