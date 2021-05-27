package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a quantidade de litros a serem
 * abastecidos de acordo com valor do litro e valor total a pagar,
 * ap�s, exibir o resultado em tela  
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio57 
{

	/*
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		String tipo;
		double litros, valortotal=0;
		
		//Atribui��o dos valores	
		tipo = JOptionPane.showInputDialog("Informe o tipo de combustivel");		
		litros = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de litros"));
		
		//C�lculo e compara��o
		switch(tipo)
		{
			case "A":
				
				if(litros <=20)
				{
					valortotal = litros * 2.9 - (litros * 2.9 * 0.03);
				}
				else
				{
					valortotal = litros * 2.9 - (litros * 2.9 * 0.05);
				}
				break;
			
			case "G":
			
				if(litros <=20)
				{
					valortotal = litros * 3.3 - (litros * 3.3 * 0.04);
				}
				else
				{
					valortotal = litros * 3.3 - (litros * 3.3 * 0.06);
				}
				break;
			
			default:
				
				JOptionPane.showMessageDialog(null, "Tipo digitado n�o correspondente");
				
				break;

		}		
		
		//Exibi��o em tela
		
		JOptionPane.showMessageDialog(null, "O valor total a ser pago pelo cliente � de R$" + valortotal);
	}
	
}
