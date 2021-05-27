package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber 10 valores e  calcular a m�dia dos valores informados pelo usu�rio.
 * Ap�s, imprimir o resultado em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021 
 */
public class Exercicio74 
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		//Declara��o das vari�veis
		double valor=0;
		
		//Atribui��o dos valores
		
		for(int i = 0;i < 10;i++)//La�o para recebimento dos valores
		{
			valor += Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero"));//Recebimento de valor por meio de soma simplificada
		}	
		
		//C�lculo da m�dia
		
		valor /= 10;
				
		//Impress�o em tela
		
		JOptionPane.showMessageDialog(null, String.format("A m�dia aritm�tica dos valores � %.1f", valor));
		
	}

}
