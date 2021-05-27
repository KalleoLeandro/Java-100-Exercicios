package exercicios;

import javax.swing.JOptionPane;


/**
 * Programa par ler uma quantidade e depois uma quantidade de n�meros baseado na primeira leitura.
 * Ap�s, imprimir o maior n�mero e a m�dia dos n�meros lidos
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021 
 */
public class Exercicio82 
{

	/*
	 *M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		int num, valor, maior; 
		double soma=0;
		
		//Atribui��o do valor quantidade
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Informe uma quantidade"));
		
		//Atribuir o primeiro valor para poder receber o maior
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
		
		maior = valor;
		
		//C�lculo da soma e compara��o para modificar o maior dos n�meros
		
		for (int i = 1 ; i < num ; i++)
		{
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
			soma += valor;
			if (valor > maior)
			{
				maior = valor;
			}
		}
		
		//Impress�o em tela
		
		JOptionPane.showMessageDialog(null,String.format("O maior valor lido � %d \nA m�dia aritm�tica dos n�meros lidos � %.2f",maior,soma/num));

	}

}
