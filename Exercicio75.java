package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a media das notas de alunos, 
 * dado o n�mero de alunos e as notas. Ap�s, imprimir em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio75 {

	/*
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		int alunos;
		double notas=0;
		
		//Atribui�� dos valores
		
		alunos = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de alunos da classe"));
		
		//Atribui��o dos valores de nota com base no total de alunos
		
		for (int i = 0; i < alunos ; i++)
		{
			notas += Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do " + i + "� aluno"));			
		}
		
		//C�lculo da m�dia aritm�tica
		
		notas /= alunos;
		
		//Impress�o em tela
		
		JOptionPane.showMessageDialog(null, "A m�dia aritm�tica da turma que cont�m " + alunos + " alunos � " + notas);

	}

}
