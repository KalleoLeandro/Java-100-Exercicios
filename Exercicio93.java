package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 20 números e armazenar em um array. Depois, imprimir na ordem inversa em que foram
 * recebidos.
 * @author Kalleo Leandro dos Santos Leal
 * @since 
 */
public class Exercicio93
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double numeros [] = new double[20];
		String valores = "";
		
		//Atribuição dos valores por meio de laço de repetição
		
		for (int i = 0 ; i < numeros.length;i++)
		{
			numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i+1) + "° número"));
		}
		
		//Leitura do array em ordem inversa
		
		for(int i = numeros.length - 1; i>=0;i--)
		{
			//Concatenação dos valores para impressão em JoptionPane
			valores += (i+1) + "° valor:" + numeros[i] + "\n";
		}
		
		//Impressão em tela
		
		JOptionPane.showInternalMessageDialog(null, valores);

	}

}
