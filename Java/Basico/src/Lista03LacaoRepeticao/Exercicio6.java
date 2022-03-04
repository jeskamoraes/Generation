package Lista03LacaoRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		float numero, somaMultiplos = 0, count = 0, media = 0;

		Scanner leitor = new Scanner(System.in);

		System.out.println("***** PARA FINALIZAR A EXECUÇÃO DO PROGRAMA DIGITE 0 *****");
		do {
			System.out.println("Digite um numero: ");
			numero = leitor.nextInt();

			if (numero != 0) {
				if (numero % 3 == 0) {
					count++;
					somaMultiplos = somaMultiplos + numero;
				}
			}

			media = somaMultiplos / count;
		} while (numero != 0);
		System.out.printf("\nMÉDIA DO MULTIPLOS DE 3 = %.2f", media);

		leitor.close();

	}

}
