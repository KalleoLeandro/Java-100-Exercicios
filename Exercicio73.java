package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e verificar a quantidade
 * de valores no intervalo fechado de 10 a 20. Ap�s,
 * imprimir a quantidade em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio73 
{

	/*
	 * M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args) 
	{
		// Declaa��o de vari�veis
		double valor;
		int intervalo=0,ext=0;
		
		//Atribui��o dos valores
		
		for(int i = 0;i<10;i++)
		{
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero"));
			if(valor >=10 && valor <=20)//Teste para verificar se o valor est� no intervalo 
			{
				intervalo++;
			}
			else
			{
				ext++;
			}
		}
		
		//Impress�o em tela
		
		JOptionPane.showMessageDialog(null, "O total de valores no intervalo fechado de 10 a 20 � " + intervalo + "\nO total de valor fora deste intervalo � " + ext);

	}

}
