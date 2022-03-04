package Lista03LacaoRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// LER 10 NÚMEROS E IMPRIMIR A QUANTIDADE DE PARES E ÍMPARES
		
		double numero;
		int contadorPar=0, contadorImpar=0;
		
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Digite um número: ");
			numero = leitor.nextDouble();
			
			if(numero % 2 == 0)
			{
				contadorPar++;
			}
			else
			{
				contadorImpar++;
			}
		}
		System.out.println("\nQuantidade de números pares: "+contadorPar+
				"\nQuantidade de números ímpares: "+contadorImpar);
		
		leitor.close();
	}

}
