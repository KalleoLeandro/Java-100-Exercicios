package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler e armazenar os valores das temperaturas dos 7 dias da semana em um array.
 * Calcular a menor e a maior temperatura registrada,a m�dia das temperaturas,
 *  e os dias em que a temperatura foi menor que a m�dia. Imprimir esses valores em tela. 
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/02/2021
 */
public class Exercicio100 
{

	/*
	 *M�todo principal de execu��o do programa 
	 */
	public static void main(String[] args) 
	{
		//Declara��o de vari�veis
		double temperaturas [] = new double[7];
		double maior, menor, media = 0;
		int qt = 0;
		String dia="";
		
		//Atribui��o dos valores
		
		for (int i = 0;i<temperaturas.length;i++)
		{
			/*  Este switch � desnecess�rio para o funcionamento dos c�lculos,
			 *  mas ajuda a escrever a frase personalizada do dia, uma vez que 
			 *  n�o possu�mos a inst�ncia de enumera��o(ENUM) ainda
			 */
			
			switch(i) 
			{
				case 0:
					dia = "da segunda-feira";
					break;
				case 1:
					dia = "da ter�a- feira";
					break;
				case 2:
					dia = "da quarta-feira";
					break;
				case 3:
					dia = "da quinta-feira";
					break;
				case 4:
					dia = "da sexta-feira";
					break;
				case 5:
					dia = "do s�bado";
					break;
				case 6:
					dia = "do domingo";
					break;
			}
			
			temperaturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura " + dia));
		}
		
		//Calcular o maior e a menor temperatura
		
		//Receber a primeira posi��o para refer�ncia de testes
		
		maior = temperaturas[0];
		menor = temperaturas[0];
		media = temperaturas[0];
		//Testar o restante das posi��es e fazer somat�rio para m�dia de temperaturas
		
		for(int i = 1;i<temperaturas.length;i++)
		{
			media+=temperaturas[i];
			if(temperaturas[i] > maior)
			{
				maior = temperaturas[i];
			}
			if(temperaturas[i] < menor)
			{
				menor = temperaturas[i];
			}
		}
		
		//Calcular a m�dia
		
		media /= temperaturas.length;
		
		
		//Verificar quantidade de dias acima da m�dia
		for(int i = 1;i<temperaturas.length;i++)
		{			
			if(temperaturas[i] > media)
			{
				qt++;
			}
		}
		
		//Impress�o em tela, para o programa usaremos a temperatura do Sistema M�trico(Celsius)
		if(maior == menor)
		{
			JOptionPane.showInternalMessageDialog(null, "A temperatura se manteve constante durante a semana, sendo de " + maior + " "
													  + "\nA m�dia de temperaturas foi de " + media +"�Celsius"
													  + "\nComo todos os dias est�o com a mesma temperatura, todos est�o dentro da media semanal");
		}
		else
		{
			JOptionPane.showInternalMessageDialog(null, "A maior das temperaturas registradas foi de "+ maior + "� Celsius"
													  + "\nA menor das temperaturas registradas foi de " + menor + "� Celsius"
					  								  + "\nA m�dia de temperaturas foi de " + media +"� Celsius"
					  								  + "\nA quantidade de dias com temperatura acima da m�dia semanal foi de "+ qt + " dias");
		}		
	}

}
