package Lista01SintaxeBasica;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		float a, b, c, d, r, s;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Para calcular a expressão D = (R+S)/2, sendo R = (a+b)^2 e S = (b+c)^2, informe os valores solicitados");
		System.out.println("\nInforme um valor inteiro para 'A': ");
		a = leitor.nextFloat();

		System.out.println("Informe um valor inteiro para 'B': ");
		b = leitor.nextFloat();

		System.out.println("Informe um valor inteiro para 'C': ");
		c = leitor.nextFloat();

		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s) / 2;

		System.out.printf("D = %.2f", d);

		leitor.close();

	}

}
