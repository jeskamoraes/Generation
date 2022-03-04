package ExemplosVetorMatriz;

import java.util.Scanner;

public class ExemploVetor02 {

	public static void main(String[] args) {

		Scanner EntradaVetor = new Scanner(System.in);

		System.out.println("Entre com o tamanho do vetor: ");
		int tamanhoVetor = EntradaVetor.nextInt();

		// DECLARAÇÃO DO VETOR DE ACORDO COM O TAMANHO DEFINIDO PELO USUÁRIO
		int[] vetor = new int[tamanhoVetor];
		
		// RECEBE UMA ENTRADA PARA CADA POSIÇÃO DO VETOR
		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Digite um valor: ");
			vetor[i] = EntradaVetor.nextInt();
		}

		System.out.println("\n---------");
		System.out.println(" Saída:");
		System.out.println("---------");
		
		// IMPRIME UMA SAÍDA PARA CADA POSIÇÃO DO VETOR
		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Posição: " + (i + 1) + " Valor: " + vetor[i]);
		}

		EntradaVetor.close();

	}

}
