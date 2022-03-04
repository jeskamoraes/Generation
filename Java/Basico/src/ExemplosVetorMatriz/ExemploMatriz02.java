package ExemplosVetorMatriz;

import java.util.Scanner;

public class ExemploMatriz02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[][] notasAlunos = new double[2][4];
		double soma;

		System.out.println("------------------");
		System.out.println("NOTAS DOS ALUNOS");
		System.out.println("------------------");

		for (int l = 0; l < notasAlunos.length; l++) {
			System.out.println("\n");
			for (int c = 0; c < notasAlunos[l].length; c++) {
				System.out.printf("Digite as notas dos alunos [%d][%d]:", l + 1, c + 1);
				notasAlunos[l][c] = entrada.nextDouble();
			}
		}

		System.out.println("\n");

		for (int l = 0; l < notasAlunos.length; l++) {
			soma = 0;
			for (int c = 0; c < notasAlunos[l].length; c++) {
				soma += notasAlunos[l][c];
				System.out.print(notasAlunos[l][c] + " | ");
			}
			System.out.println();
			System.out.printf("---> Média do aluno: %.2f \n" , (soma / 4));
		}

		entrada.close();
	}
}
