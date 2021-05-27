package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para solicitar 20 números positivos e guardar em um array.
 * Após, verificar o menor elemento e sua posição no vetor.
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/02/2021 
 */

public class Exercicio91 {

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args) {
		// Declaração de variáveis
		double numeros[] = new double[20];
		double menor=0;
		int  posicao;
		
		//Atribuição dos valores ao array por meio de laço de repetição
		
		for (int i=0;i<numeros.length;i++)
		{
			do
			{
				numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i + 1) + "° número"));
			}while(numeros[i] < 0); //Com esse do while,você garante que somente valores positivos serão informados
		}
		
		//Verificação do menor e sua posição no array
		
		menor = numeros[0]; //Aqui está sendo inicializado o menor valor com a primeira posicao do array, para se ter uma referência
		posicao = 0;		
		
		for (int i=1;i<numeros.length;i++)
		{
			if(numeros[i] < menor)
			{
				menor = numeros[i];
				posicao = i;
			}
		}
		
		//Impressão em tela
		if(menor == numeros[0] && menor ==0)//Este teste verifica se os valores informados foram todos iguais a zero
		{
			JOptionPane.showInternalMessageDialog(null, "Todos os valores informados foram iguais a zero, logo a primeira ocorrência é no índice 0, na 1ª posição do array");
		}
		else
		{
			JOptionPane.showInternalMessageDialog(null, "O menor valor informado foi " + menor + "."
												+ "\nSua primeira ocorrência está no índice " + posicao + ". Portanto ocupa a " + (posicao + 1 ) + "ª posição no array");
		}
		
		

	}

}
