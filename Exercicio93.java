package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 20 n�meros e armazenar em um array. Depois, imprimir na ordem inversa em que foram
 * recebidos.
 * @author Kalleo Leandro dos Santos Leal
 * @since 
 */
public class Exercicio93
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double numeros [] = new double[20];
		String valores = "";
		
		//Atribui��o dos valores por meio de la�o de repeti��o
		
		for (int i = 0 ; i < numeros.length;i++)
		{
			numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i+1) + "� n�mero"));
		}
		
		//Leitura do array em ordem inversa
		
		for(int i = numeros.length - 1; i>=0;i--)
		{
			//Concatena��o dos valores para impress�o em JoptionPane
			valores += (i+1) + "� valor:" + numeros[i] + "\n";
		}
		
		//Impress�o em tela
		
		JOptionPane.showInternalMessageDialog(null, valores);

	}

}
