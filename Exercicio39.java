package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar as notas dos alunos e
 * exibir uma mensagem em tela de acordo com o resultado 
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio39 {

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args) {
		// Declaração de variáveis
		double m1,m2,media;
		
		//Atribuiçao dos valores
		
		m1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira parcial"));
		m2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda parcial"));
		
		//Cálculo da média
		
		media = (m1 + m2) /2;
		
		//Comparação e exibição em tela
		
		if(media >= 6)
		{
			JOptionPane.showMessageDialog(null, "O aluno foi aprovado");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "O aluno foi reprovado");
		}

	}

}
