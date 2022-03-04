package ExercicioBasico;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int idadeAnos, idadeMeses, idadeDias, calculoIdadeDias;

		Scanner leitor = new Scanner(System.in);

		System.out.println("\nINFORME SUA IDADE COMPLETA EM ANOS, MESES E DIAS E OBTENHA A IDADE EM, APENAS, DIAS");
		System.out.println("\n--------------------------------------------------");

		System.out.println("\nANOS: ");
		idadeAnos = leitor.nextInt();

		System.out.println("\nMESES: ");
		idadeMeses = leitor.nextInt();

		System.out.println("\nDIAS: ");
		idadeDias = leitor.nextInt();

		calculoIdadeDias = ((idadeAnos * 365) + (idadeMeses * 30) + idadeDias);

		System.out.println("\nA sua idade total em dias = " + calculoIdadeDias + " dias");

		leitor.close();

	}

}
