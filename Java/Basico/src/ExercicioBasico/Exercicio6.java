package ExercicioBasico;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, x, y, D, soma;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("CALCULA A DIST�NCIA ENTRE DOIS PONTOS NO PLANO\n"
				+ "P(x1,y1) e P(x2, y2)");

		System.out.println("\nInforme o ponto x1: ");
		x1 = leitor.nextDouble();

		System.out.println("Informe o ponto x2: ");
		x2 = leitor.nextDouble();

		System.out.println("Informe o ponto y1: ");
		y1 = leitor.nextDouble();

		System.out.println("Informe o ponto y2: ");
		y2 = leitor.nextDouble();

		x = Math.pow(x2-x1, 2);
		y = Math.pow(y2-y1, 2);

		soma = x + y;

		D = Math.sqrt(soma);
		

		System.out.printf("\nA dist�ncia entre os pontos informados �: %.2f", D);
	
		leitor.close();
		
	}

}