package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 n�meros e guardar em um array.Depois, receber um valor
 * e criar um vetor que contera o primeiro vetor multiplicado pelo valor. Imprimir o segundo vetor
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/02/2021
 */
public class Exercicio92 
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		//Declara��o de vari�veis
		double numerosa[] = new double [10];
		double numerosb[] = new double [10];
		double valor;
		String resultado = "";
		
		//Atribui��o dos valores ao array A
		
		for(int i = 0;i < numerosa.length ; i++)
		{
			numerosa[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i + 1)  + "� valor"));
		}
		
		//Recebimento do valor a ser usado para produto
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser usado como fator de multiplica��o"));
		
		//Preenchimento do segundo array com o c�lculo
		
		for(int i = 0;i < numerosa.length ; i++)
		{
			numerosb[i] = numerosa[i] * valor; 
		}
		
		//Impress�o em tela
		
		for (int i = 0; i < numerosb.length; i++)
		{
			//Ao inv�s de sair imprimindo o valor, para usar em um �nico, usa-se este la�o para concatenar todos os resultados em uma frase personalizada
			resultado += "Posi��o " + (i+1) + ": " + numerosb[i]+ "\n";  
		}
		
		JOptionPane.showInternalMessageDialog(null, resultado);

	}

}
