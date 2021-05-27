package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para calcular e exibir o saldo de um cliente
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio46 
{

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		int numconta;
		double saldo, debito, credito;
		
		//Atribuição dos valores
		
		numconta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta"));
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo atual"));
		debito = Double.parseDouble(JOptionPane.showInputDialog("Informe o débito"));
		credito = Double.parseDouble(JOptionPane.showInputDialog("Informe o crédito"));
		
		//Cálculo de saldo
		saldo = saldo - debito + credito;
		
		//Comparação e exibição em tela
		
		if(saldo >=0)
		{
			System.out.println(saldo);
			JOptionPane.showMessageDialog(null,"Número da conta" + numconta
												+"\nSaldo positivo");
		}
		else
		{
			System.out.println(saldo);
			JOptionPane.showMessageDialog(null, "Número da conta" + numconta
												+"\nSaldo negativo");
		}
		

	}

}
