package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a quantidade média e exibir
 * um resultado em tela 
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio47 
{

	/*
	 *Método principal para execução do programa 
	 */
	public static void main(String[] args) 
	{
		//Declaração de variáveis
		int qtatual, qtmax,qtmin;
		double qtmedia;
		
		//Atribuição dos valores
		
		qtatual = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade atual em estoque de um produto"));
		qtmin = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade mínima de estoque de um produto"));
		qtmax = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade máxima de estoque de um produto"));
		
		//Cálculo da média
		
		qtmedia = (qtmax + qtmin) /2;
		
		//Comparação e exibição em tela
		if(qtatual > qtmedia )
		{
			JOptionPane.showMessageDialog(null, "Não efetuar compra");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Efetuar compra");
		}
	}

}
