package ExemplosLacoRepeticao;

import java.util.Scanner;

public class ExemploWhile3 {

	public static void main(String[] args) {
		int numero = -1;

		Scanner in = new Scanner(System.in);

		while (numero != 10) {
			System.out.println("Digite um n�mero: ");
			numero = in.nextInt();

			if (numero == 10) {
				System.out.println("Voc� acertou!");
			} else {
				System.out.println("Voc� errou!");
			}
		}
		in.close();
	}

}
