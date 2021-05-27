package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o  valor a pagar individual dos 3 amigos, com restrições
 * com base em valores informados pelo usuário
 *     
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio28
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		
		double total,felipe, resto,divisao;
		int carlos,andre,somainteira;
		
		//Atribuição do valor
		
		total = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total da comanda "));
			
		
				
		//Efetuando o cálculo de divisão		
		
		divisao = total / 3;
		
		//Distribuindo o valor da divida entre os 3 amigos
		
		felipe = (int)(divisao);
		carlos = (int)(divisao);
		andre = (int)(divisao);
		
		//Somatório do valor inteiro
		
		somainteira = (int)felipe + carlos + andre;
		
		//Efetuando o calculo do resto da comanda
		
		resto = total - somainteira;
		
		//Adicionando o resto da comanda a Felipe
		
		felipe = felipe + resto;
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O valor que Felipe pagará é de R$" + felipe +
											"\nO valor que Carlos pagará é de R$" + carlos +
											"\nO valor que André pagará é de R$" + andre);		
	}
}
