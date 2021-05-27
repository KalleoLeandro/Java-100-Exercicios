package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler a idade de 2 casais, efetuar uma compara��o
 * e um c�lculo e exibir o resultado em tela
 * @author Kalleo
 * @since 09/02/2021
 */
public class Exercicio58 {

	/*
	 * M�todo principal de execu��o do programa
	 *
	 */
	public static void main(String[] args) {
		// Declara��o de vari�veis
		int idadeh1,idadeh2,idadem1,idadem2, soma, produto;
		
		//Atribui��o dos valores
		
		idadeh1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do primeiro homem"));
		idadeh2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do segundo homem"));
		idadem1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do primeira mulher"));
		idadem2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do segunda mulher"));
		
		//Compara��o e c�lculo
		
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
		
		//Exibi��o do resultado em tela
		
		JOptionPane.showMessageDialog(null, "A soma das idades � de " + soma +
											"\nO produto das idades � de " + produto);

	}

}
