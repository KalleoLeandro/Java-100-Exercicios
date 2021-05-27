package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 números e guardar em um array.Depois, receber um valor
 * e criar um vetor que contera o primeiro vetor multiplicado pelo valor. Imprimir o segundo vetor
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/02/2021
 */
public class Exercicio92 
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		//Declaração de variáveis
		double numerosa[] = new double [10];
		double numerosb[] = new double [10];
		double valor;
		String resultado = "";
		
		//Atribuição dos valores ao array A
		
		for(int i = 0;i < numerosa.length ; i++)
		{
			numerosa[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i + 1)  + "° valor"));
		}
		
		//Recebimento do valor a ser usado para produto
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser usado como fator de multiplicação"));
		
		//Preenchimento do segundo array com o cálculo
		
		for(int i = 0;i < numerosa.length ; i++)
		{
			numerosb[i] = numerosa[i] * valor; 
		}
		
		//Impressão em tela
		
		for (int i = 0; i < numerosb.length; i++)
		{
			//Ao invés de sair imprimindo o valor, para usar em um único, usa-se este laço para concatenar todos os resultados em uma frase personalizada
			resultado += "Posição " + (i+1) + ": " + numerosb[i]+ "\n";  
		}
		
		JOptionPane.showInternalMessageDialog(null, resultado);

	}

}
