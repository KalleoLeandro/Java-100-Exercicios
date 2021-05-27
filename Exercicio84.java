package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa receber indefinidamente o salário e o número de filhos da população.
 * Após calcular a media salarial, a média de filhos, maior salári e percentual de habitantes baixo salário.
 * Exibir o resultado em tela 
 * @author Kalleo Leandro dos Santos Leal
 * @since 11/02/2021
 */
public class Exercicio84 
{

	/*
	 *Método principal para execução do programa
	 */
	public static void main(String[] args) 
	{
		// Declaração de variáveis
		
		int filhos=0;
		double salario = 0, mediasalario = 0,maior = 0,contador=0,salariomenor = 0;
		
		//Atribuição dos valores
		
		do
		{
			salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do habitante para verificação"));
			if(salario > 0)//Ao testar aqui se o salário é menor que 0, o programa para a execução do laço
			{
				mediasalario += salario;
				filhos += Integer.parseInt(JOptionPane.showInputDialog("Informe o número de filhos do habitante"));
				if(salario > maior)
				{
					maior = salario;
				}
				if(salario < 150)//Contador para o percentual de salários menores que 150
				{
					salariomenor++;
				}
				contador++;//Contador de pessoas pesquisadas
			}
		}while(salario > 0);
		
		//Impressão em tela
		
		JOptionPane.showMessageDialog(null, "A média salarial da população é de R$" + (mediasalario/contador)
										 +  "\nA média do número de filhos é " + (filhos/contador) + " por habitante" 
										 +  "\nO maior salário registrado foi de R$" + maior
										 +  "\nO percentual de pessoas com salário menor que R$150,00 é de " + ((salariomenor/contador)*100) + "%");
	}

}
