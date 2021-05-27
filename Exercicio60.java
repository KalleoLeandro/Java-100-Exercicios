package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler um código de usuário e uma senha, validar
 * e exibir o resultado de acordo com uma comparação
 * @author Kalleo
 *
 */
public class Exercicio60 
{

	/*
	 *Método principal de execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		String codigo;
		
		//Recebimento do valor de código usuário
		
		codigo = JOptionPane.showInputDialog("Informe o código do usuário");
		
		//Verifica se usuário correto
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
			JOptionPane.showMessageDialog(null, "Usuário inválido");
		}

	}

}
