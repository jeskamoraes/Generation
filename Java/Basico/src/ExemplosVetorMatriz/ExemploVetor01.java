package ExemplosVetorMatriz;

public class ExemploVetor01 {

	public static void main(String[] args) {

		int[] arrayVetor = new int[10];

		arrayVetor[7] = 6;
		arrayVetor[6] = 5000;

		int numero = 900;

		arrayVetor[5] = numero;
		arrayVetor[3] = 456;

		int numero2 = arrayVetor[3];

		// IMPRIME UMA SAÍDA PARA CADA POSIÇÃO DO VETOR
		for (int i = 0; i <= 9; i++) {
			System.out.println(i + " - " + arrayVetor[i]);

		}
		System.out.println("\n"+numero2);
	}

}
