package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a capacidade final obtida com base em valores informados pelo usu�rio
 *     
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio25
{

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		
		double litros,preco,reais;
		
		//Atribui��o do valor
		
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o do litro de combust�vel "));		
		reais = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser pago "));		
				
		
		
		//Efetuando o c�lculo		
		
		litros = reais / preco;
		
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null,"O total de litros abastecido � de" + litros);
	}
}
