package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular a quantidade de litros a serem
 * abastecidos de acordo com valor do litro e valor total a pagar,
 * após, exibir o resultado em tela  
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio57 
{

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		String tipo;
		double litros, valortotal=0;
		
		//Atribuição dos valores	
		tipo = JOptionPane.showInputDialog("Informe o tipo de combustivel");		
		litros = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de litros"));
		
		//Cálculo e comparação
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
				
				JOptionPane.showMessageDialog(null, "Tipo digitado não correspondente");
				
				break;

		}		
		
		//Exibição em tela
		
		JOptionPane.showMessageDialog(null, "O valor total a ser pago pelo cliente é de R$" + valortotal);
	}
	
}
