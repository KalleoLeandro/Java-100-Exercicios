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
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args)
	{
		//Declara��o de vari�veis
		int horainicial, horafinal, horas;
		
		//Atribui��o dos valores
		horainicial = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora inicial do jogo de xadrez"));
		horafinal = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora final do jogo de xadrez"));
		
		//Compara��o e c�lculo
		
		/*
		 Neste exerc�cio, sup�e-se que n�o existe partida com per�odo zerado
		  
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
		
		//Exibi��o em tela
		
		JOptionPane.showMessageDialog(null, "A dura��o da partida foi de " + horas + " horas" );

	}

}
