package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a idade de 2 casais, efetuar uma comparação
 * e um cálculo e exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio58 {

	/*
	 * Método principal de execução do programa
	 *
	 */
	public static void main(String[] args) {
		// Declaração de variáveis
		int idadeh1,idadeh2,idadem1,idadem2, soma, produto;
		
		//Atribuição dos valores
		
		idadeh1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do primeiro homem"));
		idadeh2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do segundo homem"));
		idadem1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do primeira mulher"));
		idadem2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do segunda mulher"));
		
		//Comparação e cálculo
		
		if(idadeh1 > idadeh2 && idadem1 >idadem2)
		{
			soma = idadeh1 + idadem2;
			produto = idadeh2 * idadem1;
			
		}
		else if(idadeh1 > idadeh2 && idadem1 < idadem2)
		{
			soma = idadeh1 + idadem1;
			produto = idadeh2 * idadem2;
		}
		else if(idadeh1 < idadeh2 && idadem1 > idadem2)
		{
			soma = idadeh2 + idadem2;
			produto = idadeh1 * idadem1;
		}
		else
		{
			soma = idadeh2 + idadem1;
			produto = idadeh1 * idadem2;
		}
		
		//Exibição do resultado em tela
		
		JOptionPane.showMessageDialog(null, "A soma das idades é de " + soma +
											"\nO produto das idades é de " + produto);

	}

}
