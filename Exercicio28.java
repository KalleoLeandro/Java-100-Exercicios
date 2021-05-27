package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o  valor a pagar individual dos 3 amigos, com restri��es
 * com base em valores informados pelo usu�rio
 *     
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio28
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		
		double total,felipe, resto,divisao;
		int carlos,andre,somainteira;
		
		//Atribui��o do valor
		
		total = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total da comanda "));
			
		
				
		//Efetuando o c�lculo de divis�o		
		
		divisao = total / 3;
		
		//Distribuindo o valor da divida entre os 3 amigos
		
		felipe = (int)(divisao);
		carlos = (int)(divisao);
		andre = (int)(divisao);
		
		//Somat�rio do valor inteiro
		
		somainteira = (int)felipe + carlos + andre;
		
		//Efetuando o calculo do resto da comanda
		
		resto = total - somainteira;
		
		//Adicionando o resto da comanda a Felipe
		
		felipe = felipe + resto;
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O valor que Felipe pagar� � de R$" + felipe +
											"\nO valor que Carlos pagar� � de R$" + carlos +
											"\nO valor que Andr� pagar� � de R$" + andre);		
	}
}
