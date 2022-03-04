package ExemplosVetorMatriz;

import java.util.Scanner;

public class ExemploVetor02 {

	public static void main(String[] args) {

		Scanner EntradaVetor = new Scanner(System.in);

		System.out.println("Entre com o tamanho do vetor: ");
		int tamanhoVetor = EntradaVetor.nextInt();

		// DECLARA��O DO VETOR DE ACORDO COM O TAMANHO DEFINIDO PELO USU�RIO
		int[] vetor = new int[tamanhoVetor];
		
		// RECEBE UMA ENTRADA PARA CADA POSI��O DO VETOR
		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Digite um valor: ");
			vetor[i] = EntradaVetor.nextInt();
		}

		System.out.println("\n---------");
		System.out.println(" Sa�da:");
		System.out.println("---------");
		
		// IMPRIME UMA SA�DA PARA CADA POSI��O DO VETOR
		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Posi��o: " + (i + 1) + " Valor: " + vetor[i]);
		}

		EntradaVetor.close();

	}

}
