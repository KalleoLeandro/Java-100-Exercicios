package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para efetuar o cálculo de média aritmética com 2 notas,
 * caso o valor seja fora do range de 0 a 10, solicitar novamente o valor
 * após, exibir o resultado em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio65 {

	/*
	 *Método principal para execução do programa 
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		double nota=0,media=0,i=0;
		
		//Atribuição dos valores
		
		while(i < 0 )//Laço controlador para evitar valores fora do range
		{
			nota = Double.parseDouble(JOptionPane.showInputDialog("Informe uma nota"));
			if(nota >= 0 && nota <=10)//Se o número atende a exigência, complementa para poder posteriormente quebrar o laço
			{
				media+=nota;
				i++;
			}
		}
		
		//Exibição em tela
		
		JOptionPane.showMessageDialog(null,String.format("A média do aluno é %.1f", (media/2)));

	}

}
