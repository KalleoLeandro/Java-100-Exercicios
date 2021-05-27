package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para verificar um intervalo de tempo, e
 * exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio43 
{

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args)
	{
		//Declaração de variáveis
		int horainicial, horafinal, horas;
		
		//Atribuição dos valores
		horainicial = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora inicial do jogo de xadrez"));
		horafinal = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora final do jogo de xadrez"));
		
		//Comparação e cálculo
		
		/*
		 Neste exercício, supõe-se que não existe partida com período zerado
		  
		 */
		
		if(horafinal > horainicial)
		{
			horas = horafinal - horainicial;
		}
		else if(horainicial == horafinal)
		{
			horas = 24;
		}
		else
		{
			horas = 24 - horainicial;
			horas = horas  + horafinal;
		}
		
		//Exibição em tela
		
		JOptionPane.showMessageDialog(null, "A duração da partida foi de " + horas + " horas" );

	}

}
