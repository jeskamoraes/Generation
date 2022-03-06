package Lista04VetorMatriz;

import java.util.Scanner;

public class Exercicio1 {
	
	// CRIAR UM VETOR POR LEITURA COM 5 VALORES DE PONTUA��O DE UMA ATIVIDADE E O ESCREVER EM SA�DA
	// ENCONTRAR A MAIOR PONTUA��O E APRESENT�-LA

	public static void main(String[] args) {

		// DECLARANDO O VETOR
		double[] pontuacao = new double[5];
		double maior = 0;

		Scanner leitor = new Scanner(System.in);

		// ENTRADA DE DADO PARA CADA POSI��O DO VETOR
		for (int i = 0; i < pontuacao.length; i++) {
			System.out.println("Digite a pontua��o da atividade: ");
			pontuacao[i] = leitor.nextDouble();

			// VERIFICA QUAL O MAIOR N�MERO DO VETOR
			if (pontuacao[i] > maior) {
				maior = pontuacao[i];
			}
		}
		System.out.println("\n");
		
		// IMPRIME O VETOR
		for (int i = 0; i < pontuacao.length; i++) {
			System.out.print("[" + pontuacao[i] + "] ");
		}
		System.out.println("\n\nMaior valor encontrado no vetor: " + maior + "\n");
		leitor.close();

	}

}
