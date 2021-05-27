package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para efetuar o c�lculo de m�dia aritm�tica com 2 notas,
 * caso o valor seja fora do range de 0 a 10, solicitar novamente o valor
 * ap�s, exibir o resultado em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio65 {

	/*
	 *M�todo principal para execu��o do programa 
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double nota=0,media=0,i=0;
		
		//Atribui��o dos valores
		
		while(i < 0 )//La�o controlador para evitar valores fora do range
		{
			nota = Double.parseDouble(JOptionPane.showInputDialog("Informe uma nota"));
			if(nota >= 0 && nota <=10)//Se o n�mero atende a exig�ncia, complementa para poder posteriormente quebrar o la�o
			{
				media+=nota;
				i++;
			}
		}
		
		//Exibi��o em tela
		
		JOptionPane.showMessageDialog(null,String.format("A m�dia do aluno � %.1f", (media/2)));

	}

}
