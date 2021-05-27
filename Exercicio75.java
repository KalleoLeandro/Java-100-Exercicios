package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a media das notas de alunos, 
 * dado o número de alunos e as notas. Após, imprimir em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio75 {

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		int alunos;
		double notas=0;
		
		//Atribuiçã dos valores
		
		alunos = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de alunos da classe"));
		
		//Atribuição dos valores de nota com base no total de alunos
		
		for (int i = 0; i < alunos ; i++)
		{
			notas += Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do " + i + "° aluno"));			
		}
		
		//Cálculo da média aritmética
		
		notas /= alunos;
		
		//Impressão em tela
		
		JOptionPane.showMessageDialog(null, "A média aritmética da turma que contém " + alunos + " alunos é " + notas);

	}

}
