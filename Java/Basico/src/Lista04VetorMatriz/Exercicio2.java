package Lista04VetorMatriz;

import java.util.Random; // IMPORTANDO A CLASSE JAVA.UTIL

public class Exercicio2 {

	public static void main(String[] args) {
		// UM DADO � LAN�ADO 10x E O VALOR CORRESPODENTE � ANOTADO.
		// - GERAR UM VETOR COM OS LAN�AMENTOS E IMPRIMIR;
		// - IMPRIMIR A M�DIA ARITM�TICA DOS LAN�AMENTOS;
		// - IMPRIMIR QUANTAS FORAM AS OCORR�NCIAS DA MAIOR PONTUA��O.

		int[] dado = new int[10];
		int contador = 0;
		double soma = 0, media = 0, maior = 0;

		Random random = new Random(); // INSTANCIANDO O OBJETO RANDOM

		for (int i = 0; i < dado.length; i++) {
			dado[i] = random.nextInt(6); // GERANDO N�MEROS ALEAT�RIOS
			soma += dado[i];
			media = soma / 10;

			if (dado[i] >= maior) {
				if (dado[i] > maior) {
					contador = 1;
				}
				if (dado[i] == maior) {
					contador++;
				}
				maior = dado[i];
			}

		}

		System.out.println("LAN�AMENTO DO DADO");
		System.out.println("--------------------");
		for (int i = 0; i < dado.length; i++) {
			System.out.print(dado[i] + " ");
		}
		System.out.println("\n--------------------");
		System.out.println("\n\nM�dia = " + media);
		System.out.println("\nMaior n�mero lan�ado: " + maior);
		System.out.println("\nQuantidade de vezes que o maior n�mero apareceu: " + contador + "\n");
	}

}
