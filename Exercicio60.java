package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um c�digo de usu�rio e uma senha, validar
 * e exibir o resultado de acordo com uma compara��o
 * @author Kalleo
 *
 */
public class Exercicio60 
{

	/*
	 *M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		String codigo;
		
		//Recebimento do valor de c�digo usu�rio
		
		codigo = JOptionPane.showInputDialog("Informe o c�digo do usu�rio");
		
		//Verifica se usu�rio correto
		if (codigo == "1234")
		{
			codigo = JOptionPane.showInputDialog("Informe a senha");
			if(codigo == "9999")
			{
				JOptionPane.showMessageDialog(null, "Acesso permitido");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Senha incorreta");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Usu�rio inv�lido");
		}

	}

}
