package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular uma divis�o, caso o divisor
 * seja 0, solicitar novo n�mero. Ap�s exibir o resultado em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio64 
{

	/*
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args)
	{
		// Declara��o de vari�veis
		double dividendo, divisor;
		
		//Atribui��o dos valores
		dividendo = Double.parseDouble(JOptionPane.showInputDialog("Informe o dividendo"));
		
		//Efetuando la�o para impedir a entrada de valor 0
		
		do
		{
			divisor = Double.parseDouble(JOptionPane.showInputDialog("Informe o divisor"));
		}while(divisor ==0);
		
		//C�lculo e exibi��o em tela
		
		JOptionPane.showMessageDialog(null, String.format("O valor da divis�o � %.2f" ,(dividendo / divisor)));

	}

}
