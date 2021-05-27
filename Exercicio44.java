package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o sal�rio de um funcion�rio
 * e exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio44 
{

	/*
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args) 
	{
		//Declara��o de vari�veis
		double valorhora, total;
		int horas;
		
		//Atribui��o dos valores
		
		horas = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de horas trabalhadas"));
		valorhora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor das horas"));
		
		//Compara��o e c�lculo do sal�rio
		if(horas <= 160)
		{
			total = 160 * valorhora;
		}
		else
		{
			total = 160 * valorhora;
			total = total + ((horas - 160) * (valorhora * 1.5));
		}
		
		//Exibi��o do resultado em tela
		
		JOptionPane.showMessageDialog(null, "O sal�rio final deste funcion�rio � de R$" + total);
	}
}
