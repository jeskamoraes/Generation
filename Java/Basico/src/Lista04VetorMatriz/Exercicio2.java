package Lista04VetorMatriz;

import java.util.Random; // IMPORTANDO A CLASSE JAVA.UTIL

public class Exercicio2 {

	public static void main(String[] args) {
		// UM DADO É LANÇADO 10x E O VALOR CORRESPODENTE É ANOTADO.
		// - GERAR UM VETOR COM OS LANÇAMENTOS E IMPRIMIR;
		// - IMPRIMIR A MÉDIA ARITMÉTICA DOS LANÇAMENTOS;
		// - IMPRIMIR QUANTAS FORAM AS OCORRÊNCIAS DA MAIOR PONTUAÇÃO.

		int[] dado = new int[10];
		int contador = 0;
		double soma = 0, media = 0, maior = 0;

		Random random = new Random(); // INSTANCIANDO O OBJETO RANDOM

		for (int i = 0; i < dado.length; i++) {
			dado[i] = random.nextInt(6); // GERANDO NÚMEROS ALEATÓRIOS
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

		System.out.println("LANÇAMENTO DO DADO");
		System.out.println("--------------------");
		for (int i = 0; i < dado.length; i++) {
			System.out.print(dado[i] + " ");
		}
		System.out.println("\n--------------------");
		System.out.println("\n\nMédia = " + media);
		System.out.println("\nMaior número lançado: " + maior);
		System.out.println("\nQuantidade de vezes que o maior número apareceu: " + contador + "\n");
	}

}
