package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular o salário de um funcionário
 * e exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio44 
{

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args) 
	{
		//Declaração de variáveis
		double valorhora, total;
		int horas;
		
		//Atribuição dos valores
		
		horas = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de horas trabalhadas"));
		valorhora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor das horas"));
		
		//Comparação e cálculo do salário
		if(horas <= 160)
		{
			total = 160 * valorhora;
		}
		else
		{
			total = 160 * valorhora;
			total = total + ((horas - 160) * (valorhora * 1.5));
		}
		
		//Exibição do resultado em tela
		
		JOptionPane.showMessageDialog(null, "O salário final deste funcionário é de R$" + total);
	}
}
