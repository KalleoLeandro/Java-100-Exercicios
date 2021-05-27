package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa Receber um conjunto de 20 números. Depois receber mais um número e comparar com os valores
 * do array. Caso o número exista, criar um novo array sem o valor recebido.
 * @author Kalleo Leandro dos Santos Leal
 * @since 
 */
public class Exercicio97 {

	/*
	 *Método principal de execução do programa
	 */
	public static void main(String[] args) {
		//Declaração de variáveis 
		double num[] = new double[20];
		boolean teste=false;
		int indice = 0;
		double x;
		String vetor="";
		
		//Preenchimento do vetor que conterá os valores
		
		for(int i = 0;i<num.length;i++)
		{
			num[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));
		}
		
		//Recebimento do valor a ser procurado
		x = Double.parseDouble(JOptionPane.showInputDialog("informe um valor a ser procurado no vetor"));
		
		
		//Verificação do array
		
		for (int i = 0;i<num.length;i++)
		{
			if(num[i]==x) //Caso o indice contenha o número, mudamos o valor de teste e pegamos o indice atual
			{
				teste = true;
				indice = i;
			}
		}
		
		//Teste para validação e criação do novo array		
		
		if(teste)
		{
			double num2[] = new double[19];//Criação do vetor com 1 índice a menos
			
			//Preencher o vetor até antes do indice onde o valor foi encontrado, copiando os valores nos mesmos índices
			for(int i = 0;i<indice;i++)
			{
				num2[i] = num[i];
			}
			
			//A partir do índice 
			
			for(int i = indice + 1; i< num.length;i++)
			{
				num2[i-1] = num[i];
			}
			
			vetor += "O vetor original contem o número " + x + "\n";
			vetor += "NOVO VETOR" + "\n\n";

			//Montagem de String para impressão via JoptionPane
			for(int i = 0;i<num2.length;i++)
			{
				vetor += "Valor posição" + (i+1) +": " + num2[i] + "\n"; 
			}
		}
		
		else
		{
			vetor += "O vetor original não contem o número " + x + "\n";
			vetor += "VETOR ORIGINAL" + "\n\n";
			for(int i = 0;i<num.length;i++)
			{
				vetor += "Valor posição" + (i+1) +": " + num[i] + "\n";
			}
		}
		
		JOptionPane.showInternalMessageDialog(null, vetor);
	}
}
