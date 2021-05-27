package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a media ponderada de um aluno
 * e exibir um resultado de acordo com uma compara��o em tela  
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio62 
{

	/*
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		double n1,n2,n3,me,media;
		
		//Atribui��o dos valores
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira parcial"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda parcial"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira parcial"));
		me = Double.parseDouble(JOptionPane.showInputDialog("Informe a m�dia dos exerc�cios"));
		
		//C�lculo da media
		
		media = (n1 + n2*2 + n3*3 +me) / 7;
		
		//Compara��o do aproveitamento para resultado em tela
		
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
