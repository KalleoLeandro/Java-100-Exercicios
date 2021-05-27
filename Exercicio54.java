package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler 3 valores e verificar se é ou não
 * um triângulo, e exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 *
 */
public class Exercicio54 
{

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args)
	{
		// Declaração de variáveis
		double a,b,c;
		
		//Atribuição dos valores
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro lado"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo lado"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro lado"));
		
		//Comparação e exibição em tela
		
		if(a+b > c && b+c >a && a+c > b)
		{
			JOptionPane.showMessageDialog(null, "A,B e C são lados de um triângulo");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "A,B e C não são lados de um triângulo");
		}
		

	}

}
