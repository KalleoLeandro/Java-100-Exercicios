package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar resultados e exibir em tela 
 * de acordo com uma compara��o
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio55 
{

	/*
	 *M�todo principal de execu��o do programa  
	 */
	public static void main(String[] args) 
	{
		// Declara��o de variaveis
		String timea,timeb;
		int placara,placarb;
		
		//Atribui�ao dos valores
		
		timea = JOptionPane.showInputDialog("Informe o nome do primeiro time");
		timeb = JOptionPane.showInputDialog("Informe o nome do segundo time");
		
		placara = Integer.parseInt(JOptionPane.showInputDialog("Informe o placar do time" + timea));
		placarb = Integer.parseInt(JOptionPane.showInputDialog("Informe o placar do time" + timeb));
		
		//Compara��o e exibi��o dos resultados
		
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
