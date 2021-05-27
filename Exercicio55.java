package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar resultados e exibir em tela 
 * de acordo com uma comparação
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio55 
{

	/*
	 *Método principal de execução do programa  
	 */
	public static void main(String[] args) 
	{
		// Declaração de variaveis
		String timea,timeb;
		int placara,placarb;
		
		//Atribuiçao dos valores
		
		timea = JOptionPane.showInputDialog("Informe o nome do primeiro time");
		timeb = JOptionPane.showInputDialog("Informe o nome do segundo time");
		
		placara = Integer.parseInt(JOptionPane.showInputDialog("Informe o placar do time" + timea));
		placarb = Integer.parseInt(JOptionPane.showInputDialog("Informe o placar do time" + timeb));
		
		//Comparação e exibição dos resultados
		
		if(placara> placarb)
		{
			JOptionPane.showMessageDialog(null,"Vencedor: " + timea);			
		}
		else if(placarb > placara)
		{
			JOptionPane.showMessageDialog(null,"Vencedor: " + timeb);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"EMPATE");
		}
	}

}
