package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para solicitar 20 n�meros positivos e guardar em um array.
 * Ap�s, verificar o menor elemento e sua posi��o no vetor.
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/02/2021 
 */

public class Exercicio91 {

	/*
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args) {
		// Declara��o de vari�veis
		double numeros[] = new double[20];
		double menor=0;
		int  posicao;
		
		//Atribui��o dos valores ao array por meio de la�o de repeti��o
		
		for (int i=0;i<numeros.length;i++)
		{
			do
			{
				numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� n�mero"));
			}while(numeros[i] < 0); //Com esse do while,voc� garante que somente valores positivos ser�o informados
		}
		
		//Verifica��o do menor e sua posi��o no array
		
		menor = numeros[0]; //Aqui est� sendo inicializado o menor valor com a primeira posicao do array, para se ter uma refer�ncia
		posicao = 0;		
		
		for (int i=1;i<numeros.length;i++)
		{
			if(numeros[i] < menor)
			{
				menor = numeros[i];
				posicao = i;
			}
		}
		
		//Impress�o em tela
		if(menor == numeros[0] && menor ==0)//Este teste verifica se os valores informados foram todos iguais a zero
		{
			JOptionPane.showInternalMessageDialog(null, "Todos os valores informados foram iguais a zero, logo a primeira ocorr�ncia � no �ndice 0, na 1� posi��o do array");
		}
		else
		{
			JOptionPane.showInternalMessageDialog(null, "O menor valor informado foi " + menor + "."
												+ "\nSua primeira ocorr�ncia est� no �ndice " + posicao + ". Portanto ocupa a " + (posicao + 1 ) + "� posi��o no array");
		}
		
		

	}

}
