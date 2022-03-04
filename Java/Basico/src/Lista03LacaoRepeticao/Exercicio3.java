package Lista03LacaoRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// SOLICITAR A IDADE DE VÁRIAS PESSOAS E IMPRIMIR:
		// - TOTAL DE PESSOAS COM MENOS DE 21 ANOS
		// - TOTAL DE PESSOAS COM MAIS DE 50 ANOS
		// - O PROGRAMA TERMINA QUANDO A IDADE FOR = -99

		int idade = 0, contadorMenor = 0, contadorMaior = 0;

		Scanner leitor = new Scanner(System.in);

		//System.out.println("Informe a idade do usuário: ");
		//idade = leitor.nextInt();

		while (idade != -99) {
			System.out.println("Informe a idade do usuário: ");
			idade = leitor.nextInt();

			if (idade < 21 && idade > 0) {
				contadorMenor++;
			} else if (idade > 50) {
				contadorMaior++;
			}
		}
		System.out.println("\nQuantidade de pessoas menores de 21 anos: " + contadorMenor
				+ "\nQuantidade de pessoas maiores de 50 anos: " + contadorMaior);

		leitor.close();
	}

}
