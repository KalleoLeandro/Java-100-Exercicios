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
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		int numconta;
		double saldo, debito, credito;
		
		//Atribui��o dos valores
		
		numconta = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero da conta"));
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo atual"));
		debito = Double.parseDouble(JOptionPane.showInputDialog("Informe o d�bito"));
		credito = Double.parseDouble(JOptionPane.showInputDialog("Informe o cr�dito"));
		
		//C�lculo de saldo
		saldo = saldo - debito + credito;
		
		//Compara��o e exibi��o em tela
		
		if(saldo >=0)
		{
			System.out.println(saldo);
			JOptionPane.showMessageDialog(null,"N�mero da conta" + numconta
												+"\nSaldo positivo");
		}
		else
		{
			System.out.println(saldo);
			JOptionPane.showMessageDialog(null, "N�mero da conta" + numconta
												+"\nSaldo negativo");
		}
		

	}

}
