package Lista02LacoCondicional;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int[] listaDeNumeros = new int[3];
		
		Scanner leitor = new Scanner(System.in);
		
		// Preenche o array a partir da posição 1
		for(int i=0; i<listaDeNumeros.length; i++)
		{
			System.out.println("Digite o "+(i+1) +"° número: ");
			listaDeNumeros[i] = leitor.nextInt();
		}
		
		// Coloca o arrasy em ordem crescente
		Arrays.sort(listaDeNumeros);
		
		// Lista o array em ordem crescente
		System.out.println("\nOrdem crescente");
		for(int j=0; j<listaDeNumeros.length; j++)
		{
			System.out.print(listaDeNumeros[j]+ "  ");  
		}
		
		leitor.close();
	}
}
