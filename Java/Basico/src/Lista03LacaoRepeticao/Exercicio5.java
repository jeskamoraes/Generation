package Lista03LacaoRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		double numero, soma=0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("***** PARA FINALIZAR A EXECUÇÃO DO PROGRAMA DIGITE 0 *****");
		do {
			System.out.println("\nDigite um numero: ");
			numero = leitor.nextDouble();
			
			soma += numero;
		}while(numero != 0);
		
		System.out.println("\nA soma dos números digitados é "+soma);
		
		leitor.close();
	}

}
