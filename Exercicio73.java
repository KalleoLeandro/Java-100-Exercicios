package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 10 valores e verificar a quantidade
 * de valores no intervalo fechado de 10 a 20. Após,
 * imprimir a quantidade em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio73 
{

	/*
	 * Método principal de execução do programa 
	 */
	public static void main(String[] args) 
	{
		// Declaação de variáveis
		double valor;
		int intervalo=0,ext=0;
		
		//Atribuição dos valores
		
		for(int i = 0;i<10;i++)
		{
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));
			if(valor >=10 && valor <=20)//Teste para verificar se o valor está no intervalo 
			{
				intervalo++;
			}
			else
			{
				ext++;
			}
		}
		
		//Impressão em tela
		
		JOptionPane.showMessageDialog(null, "O total de valores no intervalo fechado de 10 a 20 é " + intervalo + "\nO total de valor fora deste intervalo é " + ext);

	}

}
