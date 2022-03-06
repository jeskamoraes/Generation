package Lista04VetorMatriz;

import java.util.Scanner;

public class Exercicio1 {
	
	// CRIAR UM VETOR POR LEITURA COM 5 VALORES DE PONTUAÇÃO DE UMA ATIVIDADE E O ESCREVER EM SAÍDA
	// ENCONTRAR A MAIOR PONTUAÇÃO E APRESENTÁ-LA

	public static void main(String[] args) {

		// DECLARANDO O VETOR
		double[] pontuacao = new double[5];
		double maior = 0;

		Scanner leitor = new Scanner(System.in);

		// ENTRADA DE DADO PARA CADA POSIÇÃO DO VETOR
		for (int i = 0; i < pontuacao.length; i++) {
			System.out.println("Digite a pontuação da atividade: ");
			pontuacao[i] = leitor.nextDouble();

			// VERIFICA QUAL O MAIOR NÚMERO DO VETOR
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
