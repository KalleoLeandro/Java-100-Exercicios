package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a quantidade m�dia e exibir
 * um resultado em tela 
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio47 
{

	/*
	 *M�todo principal para execu��o do programa 
	 */
	public static void main(String[] args) 
	{
		//Declara��o de vari�veis
		int qtatual, qtmax,qtmin;
		double qtmedia;
		
		//Atribui��o dos valores
		
		qtatual = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade atual em estoque de um produto"));
		qtmin = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade m�nima de estoque de um produto"));
		qtmax = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade m�xima de estoque de um produto"));
		
		//C�lculo da m�dia
		
		qtmedia = (qtmax + qtmin) /2;
		
		//Compara��o e exibi��o em tela
		if(qtatual > qtmedia )
		{
			JOptionPane.showMessageDialog(null, "N�o efetuar compra");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Efetuar compra");
		}
	}

}
