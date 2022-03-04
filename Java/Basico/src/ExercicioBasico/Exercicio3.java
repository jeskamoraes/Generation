package ExercicioBasico;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		float segundos, minutos, horas;

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("--->CALCULA A DURAÇÃO TOTAL DE UM EVENTO (EM SEGUNDOS)<---");

		System.out.println("\nInforme o tempo de duração do evento em segundos: ");
		segundos = leitor.nextFloat();

		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundos = (segundos % 3600) % 60;

		System.out.printf("\nHoras: %2.2f", horas);
		System.out.printf("\nMinutos: %2.2f ", minutos);
		System.out.printf("\nSegundos: %2.2f ", segundos);

		leitor.close();

	}

}
