package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler e armazenar os valores das temperaturas dos 7 dias da semana em um array.
 * Calcular a menor e a maior temperatura registrada,a média das temperaturas,
 *  e os dias em que a temperatura foi menor que a média. Imprimir esses valores em tela. 
 * @author Kalleo Leandro dos Santos Leal
 * @since 12/02/2021
 */
public class Exercicio100 
{

	/*
	 *Método principal de execução do programa 
	 */
	public static void main(String[] args) 
	{
		//Declaração de variáveis
		double temperaturas [] = new double[7];
		double maior, menor, media = 0;
		int qt = 0;
		String dia="";
		
		//Atribuição dos valores
		
		for (int i = 0;i<temperaturas.length;i++)
		{
			/*  Este switch é desnecessário para o funcionamento dos cálculos,
			 *  mas ajuda a escrever a frase personalizada do dia, uma vez que 
			 *  não possuímos a instância de enumeração(ENUM) ainda
			 */
			
			switch(i) 
			{
				case 0:
					dia = "da segunda-feira";
					break;
				case 1:
					dia = "da terça- feira";
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
					dia = "do sábado";
					break;
				case 6:
					dia = "do domingo";
					break;
			}
			
			temperaturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura " + dia));
		}
		
		//Calcular o maior e a menor temperatura
		
		//Receber a primeira posição para referência de testes
		
		maior = temperaturas[0];
		menor = temperaturas[0];
		media = temperaturas[0];
		//Testar o restante das posições e fazer somatório para média de temperaturas
		
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
		
		//Calcular a média
		
		media /= temperaturas.length;
		
		
		//Verificar quantidade de dias acima da média
		for(int i = 1;i<temperaturas.length;i++)
		{			
			if(temperaturas[i] > media)
			{
				qt++;
			}
		}
		
		//Impressão em tela, para o programa usaremos a temperatura do Sistema Métrico(Celsius)
		if(maior == menor)
		{
			JOptionPane.showInternalMessageDialog(null, "A temperatura se manteve constante durante a semana, sendo de " + maior + " "
													  + "\nA média de temperaturas foi de " + media +"°Celsius"
													  + "\nComo todos os dias estão com a mesma temperatura, todos estão dentro da media semanal");
		}
		else
		{
			JOptionPane.showInternalMessageDialog(null, "A maior das temperaturas registradas foi de "+ maior + "° Celsius"
													  + "\nA menor das temperaturas registradas foi de " + menor + "° Celsius"
					  								  + "\nA média de temperaturas foi de " + media +"° Celsius"
					  								  + "\nA quantidade de dias com temperatura acima da média semanal foi de "+ qt + " dias");
		}		
	}

}
