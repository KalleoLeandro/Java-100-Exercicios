package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e exibir o total de litros de refrigerante adquiridos
 * com base nos valores informados pelo usu�rio     
 *     
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio32
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		
		double lata350,garrafa600,garrafa2l, total;
		
		
		//Atribui��o do valor
		
		lata350 = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de latas de 350ml adquiridos"));
		garrafa600 = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero garrafas de 600ml adquiridos"));
		garrafa2l = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero garrafas de 2l adquiridos"));
		
				
		//Efetuando o calculo das capacidades
		
		lata350 = lata350 * 0.350;
		garrafa600 = garrafa600 * 0.6;
		garrafa2l = garrafa2l * 2;
    
		
		//Somandos todas as capacidades
		
		total = lata350 + garrafa600 + garrafa2l;
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O valor total de litros adquiridos � de " + total);
												
	}
}
