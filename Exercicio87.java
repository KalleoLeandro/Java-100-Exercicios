package exercicios;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 * Programa para imprimir um retângulo 10 x 60 caracteres na tela
 * @author Kalleo Leandro dos Santos Leal
 * @since 10/02/2021
 */
public class Exercicio87 
{

	/*
	 * 
	 */
	public static void main(String[] args) 
	{	
		//Altrar fonte JoptionPane para monospace
		 UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Courier", Font.LAYOUT_RIGHT_TO_LEFT, 18))); 
		
		 
		 //Decalaração de variáveis
		String retangulo = "";		
		int linha, coluna;
		
		
		//O primeiro for servirá para andar as linhas
		for (linha = 1;linha < 11;linha++)
		{			
			for(coluna = 1; coluna < 61; coluna++)//O segundo for para as colunas
			{				
				if(linha == 1 || linha == 10)//Verifico se estou na primeira ou ultima linha, se sim, todas as colunas terão +
				{	
					retangulo += "+";					
				}
				else if(coluna == 1 || coluna == 60)//Senão, caso esteja na primeira ou última coluna, recebe +
				{
					retangulo += "+";				
				}
				else
				{
					retangulo += " ";//Coluna 2 a 59 das linhas 2 a 9, recebem espaço
				}
			}			
			retangulo += "\n";//Pular linha
		}
		
		//Impressão em tela
			System.out.println(retangulo);
			
			
			/*
			 *A primeira instrução serve para corrigir a impressão no JoptionPane, mudando para uma fonte monospace 
			 */
			 
			JOptionPane.showMessageDialog(null,retangulo);
			
	}
}
