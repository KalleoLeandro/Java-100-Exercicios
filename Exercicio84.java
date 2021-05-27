package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa receber indefinidamente o sal�rio e o n�mero de filhos da popula��o.
 * Ap�s calcular a media salarial, a m�dia de filhos, maior sal�ri e percentual de habitantes baixo sal�rio.
 * Exibir o resultado em tela 
 * @author Kalleo Leandro dos Santos Leal
 * @since 11/02/2021
 */
public class Exercicio84 
{

	/*
	 *M�todo principal para execu��o do programa
	 */
	public static void main(String[] args) 
	{
		// Declara��o de vari�veis
		
		int filhos=0;
		double salario = 0, mediasalario = 0,maior = 0,contador=0,salariomenor = 0;
		
		//Atribui��o dos valores
		
		do
		{
			salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio do habitante para verifica��o"));
			if(salario > 0)//Ao testar aqui se o sal�rio � menor que 0, o programa para a execu��o do la�o
			{
				mediasalario += salario;
				filhos += Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de filhos do habitante"));
				if(salario > maior)
				{
					maior = salario;
				}
				if(salario < 150)//Contador para o percentual de sal�rios menores que 150
				{
					salariomenor++;
				}
				contador++;//Contador de pessoas pesquisadas
			}
		}while(salario > 0);
		
		//Impress�o em tela
		
		JOptionPane.showMessageDialog(null, "A m�dia salarial da popula��o � de R$" + (mediasalario/contador)
										 +  "\nA m�dia do n�mero de filhos � " + (filhos/contador) + " por habitante" 
										 +  "\nO maior sal�rio registrado foi de R$" + maior
										 +  "\nO percentual de pessoas com sal�rio menor que R$150,00 � de " + ((salariomenor/contador)*100) + "%");
	}

}
