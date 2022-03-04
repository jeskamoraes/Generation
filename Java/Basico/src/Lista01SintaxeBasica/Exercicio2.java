package Lista01SintaxeBasica;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int idadeAnos = 0, idadeMeses = 0, idadeDias;

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("RECEBE A IDADE EM DIAS E RETORNA EM ANOS, MESES E DIAS");

		System.out.println("\nInforme sua idade em dias: ");
		idadeDias = leitor.nextInt();

		idadeAnos = idadeDias / 365;
		idadeMeses = (idadeDias % 365) / 30;
		idadeDias = (idadeDias % 365) % 30;

		System.out.println(
				"\nIdade em anos " + idadeAnos + " \nIdade em meses: " + idadeMeses + " \nIdade em dias: " + idadeDias);
		
		leitor.close();
	}

}
