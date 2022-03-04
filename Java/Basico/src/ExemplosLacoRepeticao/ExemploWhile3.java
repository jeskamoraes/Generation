package ExemplosLacoRepeticao;

import java.util.Scanner;

public class ExemploWhile3 {

	public static void main(String[] args) {
		int numero = -1;

		Scanner in = new Scanner(System.in);

		while (numero != 10) {
			System.out.println("Digite um número: ");
			numero = in.nextInt();

			if (numero == 10) {
				System.out.println("Você acertou!");
			} else {
				System.out.println("Você errou!");
			}
		}
		in.close();
	}

}
