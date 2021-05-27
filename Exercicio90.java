package exercicios;

import javax.swing.JOptionPane;


/**
 * Programa para solicitar 20 n�meros positivos e guardar em um array.
 * Ap�s, verificar o maior elemento e sua posi��o no vetor.
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/02/2021
 */
public class Exercicio90 {

	/*
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args) {
		// Declara��o de vari�veis
		double numeros[] = new double[20];
		double maior=0;
		int  posicao=0;
		
		//Atribui��o dos valores ao array por meio de la�o de repeti��o
		
		for (int i=0;i<numeros.length;i++)
		{
			do
			{
				numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� n�mero"));
			}while(numeros[i] < 0); //Com esse do while,voc� garante que somente valores positivos ser�o informados
		}
		
		//Verifica��o do maior e sua posi��o no array
		
		for (int i=0;i<numeros.length;i++)
		{
			if(numeros[i] > maior)
			{
				maior = numeros[i];
				posicao = i;
			}
		}
		
		//Impress�o em tela
		if(maior == 0)
		{
			JOptionPane.showInternalMessageDialog(null, "Todos os valores informados foram iguais a zero, logo a primeira ocorr�ncia � no �ndice 0, na 1� posi��o do array");
		}
		else
		{
			JOptionPane.showInternalMessageDialog(null, "O maior valor informado foi " + maior
												+ "\nSua primeira ocorr�ncia est� no �ndice " + posicao + ". Portanto ocupa a " + (posicao + 1 ) + "� posi��o no array");
		}
		
		

	}

}
