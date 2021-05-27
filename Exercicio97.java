package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa Receber um conjunto de 20 n�meros. Depois receber mais um n�mero e comparar com os valores
 * do array. Caso o n�mero exista, criar um novo array sem o valor recebido.
 * @author Kalleo Leandro dos Santos Leal
 * @since 
 */
public class Exercicio97 {

	/*
	 *M�todo principal de execu��o do programa
	 */
	public static void main(String[] args) {
		//Declara��o de vari�veis 
		double num[] = new double[20];
		boolean teste=false;
		int indice = 0;
		double x;
		String vetor="";
		
		//Preenchimento do vetor que conter� os valores
		
		for(int i = 0;i<num.length;i++)
		{
			num[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero"));
		}
		
		//Recebimento do valor a ser procurado
		x = Double.parseDouble(JOptionPane.showInputDialog("informe um valor a ser procurado no vetor"));
		
		
		//Verifica��o do array
		
		for (int i = 0;i<num.length;i++)
		{
			if(num[i]==x) //Caso o indice contenha o n�mero, mudamos o valor de teste e pegamos o indice atual
			{
				teste = true;
				indice = i;
			}
		}
		
		//Teste para valida��o e cria��o do novo array		
		
		if(teste)
		{
			double num2[] = new double[19];//Cria��o do vetor com 1 �ndice a menos
			
			//Preencher o vetor at� antes do indice onde o valor foi encontrado, copiando os valores nos mesmos �ndices
			for(int i = 0;i<indice;i++)
			{
				num2[i] = num[i];
			}
			
			//A partir do �ndice 
			
			for(int i = indice + 1; i< num.length;i++)
			{
				num2[i-1] = num[i];
			}
			
			vetor += "O vetor original contem o n�mero " + x + "\n";
			vetor += "NOVO VETOR" + "\n\n";

			//Montagem de String para impress�o via JoptionPane
			for(int i = 0;i<num2.length;i++)
			{
				vetor += "Valor posi��o" + (i+1) +": " + num2[i] + "\n"; 
			}
		}
		
		else
		{
			vetor += "O vetor original n�o contem o n�mero " + x + "\n";
			vetor += "VETOR ORIGINAL" + "\n\n";
			for(int i = 0;i<num.length;i++)
			{
				vetor += "Valor posi��o" + (i+1) +": " + num[i] + "\n";
			}
		}
		
		JOptionPane.showInternalMessageDialog(null, vetor);
	}
}
