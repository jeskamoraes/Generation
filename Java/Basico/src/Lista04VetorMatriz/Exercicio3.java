package Lista04VetorMatriz;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];

		Scanner leitor = new Scanner(System.in);

		// RECEBE OS DADOS DA MATRIZ NÚMERO 1
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				System.out.println("MATRIZ 1 - Digite o valor: ");
				n1[l][c] = leitor.nextInt();
			}
		}
		// IMPRIME OS DADOS DA MATRIZ NÚMERO 1
		System.out.println("\nMATRIZ 1\n");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				System.out.print(n1[l][c] + " | ");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
		// RECEBE OS DADOS DA MATRIZ NÚMERO 2
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				System.out.println("MATRIZ 2 - Digite o valor: ");
				n2[l][c] = leitor.nextInt();
			}
		}
		// IMPRIME OS DADOS DA MATRIZ NÚMERO 2
		System.out.println("\nMATRIZ 2\n");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				System.out.print(n2[l][c] + " | ");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
		// SOMA OS VALORES DAS MATRIZES N1 E N2
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				m1[l][c] = n1[l][c] + n2[l][c];
			}
		}
		// IMPRIME O RESULTADO DA SOMA
		System.out.println("\nMATRIZ SOMA\n");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				System.out.print(m1[l][c] + " | ");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
		// SUBTRAI OS VALORES DAS MATRIZES N1 E N2
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}
		// IMPRIME O RESULTADO DA SUBTRAÇÃO
		System.out.println("\nMATRIZ SUBTRAÇÃO\n");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				System.out.print(m2[l][c] + " | ");
			}
			System.out.println("\n");
		}
		System.out.println("\n");

		leitor.close();
	}
}

