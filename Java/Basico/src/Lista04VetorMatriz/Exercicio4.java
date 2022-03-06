package Lista04VetorMatriz;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int soma = 0, somaDiagonal = 0;

		Scanner leitor = new Scanner(System.in);

		System.out.println("----------");
		System.out.println("MATRIZ 3x3");
		System.out.println("----------");

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.println("Digite os números: ");
				matriz[l][c] = leitor.nextInt();

				soma += matriz[l][c];

				if (l == c) {
					somaDiagonal += matriz[l][c];
				}
			}
		}

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(matriz[l][c] + " | ");
			}
			System.out.println("\n");
		}

		System.out.print(
				"\nSoma de todos os números da matriz: " + soma + "\nSoma dos números da diagonal: " + somaDiagonal);

		leitor.close();

	}
}
