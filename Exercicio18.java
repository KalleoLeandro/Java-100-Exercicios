package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir o percentual dos eleitores com os valores  recebido do usuário
 * @author Kalleo Leandro dos Santos Leal
 * @since 05/02/2021
 *
 */
public class Exercicio18 
{

	/*
	 * Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		int eleitores;
		double brancos, nulos, validos;
		
		//Recebendo valores do usuário
		
		eleitores = Integer.parseInt(JOptionPane.showInputDialog("Informe o número total de eleitores "));
		brancos = Double.parseDouble(JOptionPane.showInputDialog("Informe o número total de votos brancos "));
		nulos = Double.parseDouble(JOptionPane.showInputDialog("Informe o número total de votos nulos "));
		validos = Double.parseDouble(JOptionPane.showInputDialog("Informe o número total de votos validos "));
					
		
		//Efetuando os cálculos
		
		brancos = (brancos/eleitores) * 100;
		nulos = (nulos/eleitores) * 100;
		validos = (validos/eleitores) * 100;
		
		 
		
		//Exibindo os valores em tela
		
		JOptionPane.showMessageDialog(null, "O percentual de votos brancos foi de  " + brancos + "%"+
											 "\nO percentual de votos nulos foi de  " + nulos + "%"+ 
											 "\nO percentual de votos validos foi de  " + validos + "%");
		
				
		

	}

}
