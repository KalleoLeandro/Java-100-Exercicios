package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular uma divisão, caso o divisor
 * seja 0, solicitar novo número. Após exibir o resultado em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio64 
{

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args)
	{
		// Declaração de variáveis
		double dividendo, divisor;
		
		//Atribuição dos valores
		dividendo = Double.parseDouble(JOptionPane.showInputDialog("Informe o dividendo"));
		
		//Efetuando laço para impedir a entrada de valor 0
		
		do
		{
			divisor = Double.parseDouble(JOptionPane.showInputDialog("Informe o divisor"));
		}while(divisor ==0);
		
		//Cálculo e exibição em tela
		
		JOptionPane.showMessageDialog(null, String.format("O valor da divisão é %.2f" ,(dividendo / divisor)));

	}

}
