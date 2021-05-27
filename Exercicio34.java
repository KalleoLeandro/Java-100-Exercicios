package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e exibir o total em agua e suco necess�rios
 * para fazer um refresco, com base nos valores informados pelo usu�rio
 *      
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio34
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		
		double litros,agua,suco;
		
		
		//Atribui��o do valor
		
		litros = Double.parseDouble(JOptionPane.showInputDialog("Informe o total de litros de refresco a serem produzidos "));
		
		
		
				
		//Efetuando os c�lculos das partes 
		   
		
		agua = litros * 0.8;
		suco = litros * 0.2;
		
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"S�o necess�rios " + agua + " litros de agua e " + suco + " unidades de suco para produzir a quantidade de " + litros + " litros de refresco");
												
	}
}
