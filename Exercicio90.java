package exercicios;

import javax.swing.JOptionPane;


/**
 * Programa para solicitar 20 números positivos e guardar em um array.
 * Após, verificar o maior elemento e sua posição no vetor.
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/02/2021
 */
public class Exercicio90 {

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args) {
		// Declaração de variáveis
		double numeros[] = new double[20];
		double maior=0;
		int  posicao=0;
		
		//Atribuição dos valores ao array por meio de laço de repetição
		
		for (int i=0;i<numeros.length;i++)
		{
			do
			{
				numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i + 1) + "° número"));
			}while(numeros[i] < 0); //Com esse do while,você garante que somente valores positivos serão informados
		}
		
		//Verificação do maior e sua posição no array
		
		for (int i=0;i<numeros.length;i++)
		{
			if(numeros[i] > maior)
			{
				maior = numeros[i];
				posicao = i;
			}
		}
		
		//Impressão em tela
		if(maior == 0)
		{
			JOptionPane.showInternalMessageDialog(null, "Todos os valores informados foram iguais a zero, logo a primeira ocorrência é no índice 0, na 1ª posição do array");
		}
		else
		{
			JOptionPane.showInternalMessageDialog(null, "O maior valor informado foi " + maior
												+ "\nSua primeira ocorrência está no índice " + posicao + ". Portanto ocupa a " + (posicao + 1 ) + "ª posição no array");
		}
		
		

	}

}
