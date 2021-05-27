package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a media ponderada de um aluno
 * e exibir um resultado de acordo com uma comparação em tela  
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio62 
{

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double n1,n2,n3,me,media;
		
		//Atribuição dos valores
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira parcial"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda parcial"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira parcial"));
		me = Double.parseDouble(JOptionPane.showInputDialog("Informe a média dos exercícios"));
		
		//Cálculo da media
		
		media = (n1 + n2*2 + n3*3 +me) / 7;
		
		//Comparação do aproveitamento para resultado em tela
		
		if(media >=9)
		{
			JOptionPane.showMessageDialog(null, "Conceito A");
		}
		else if(media <=7.5 && media <9)
		{
			JOptionPane.showMessageDialog(null, "Conceito B");
		}
		else if(media <=6.0 && media <7.5)
		{
			JOptionPane.showMessageDialog(null, "Conceito C");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Conceito D");
		}	

	}

}
