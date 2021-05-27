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
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args) {
		// Declara��o de vari�veis
		double m1,m2,media;
		
		//Atribui�ao dos valores
		
		m1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira parcial"));
		m2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda parcial"));
		
		//C�lculo da m�dia
		
		media = (m1 + m2) /2;
		
		//Compara��o e exibi��o em tela
		
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
