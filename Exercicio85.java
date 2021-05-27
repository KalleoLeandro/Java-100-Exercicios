package exercicios;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 * Programa para calcular todas as tabuadas de 1 a 10 (de 1 a 10) e exibir em tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 11/02/2021
 */
public class Exercicio85 
{	

	/*
	 * M�todo principal de execu��o do programa
	 */
	public static void main(String[] args)
	{
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Lucida Console", Font.LAYOUT_RIGHT_TO_LEFT, 18)));
		// Declara��o das vari�veis
		String tabuadas="";		
		int num;
		
		for(int i=1;i<=10;i++)
		{
			for(num = 1;num <=10;num++)			
			{
				
				tabuadas += num + " x " + i + " = " + (num * i) + "   ";
							
			}
			tabuadas += "\n";
		}
		
		JOptionPane.showMessageDialog(null, tabuadas);
	}

}
