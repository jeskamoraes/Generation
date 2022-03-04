package Lista02LacoCondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int a, b, c, maior=0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Lé três inteiros e imprime o maior");
		System.out.println("\nDigite o primeiro número: ");
		a = leitor.nextInt();
		
		System.out.println("\nDigite o segundo número: ");
		b = leitor.nextInt();
		
		System.out.println("\nDigite o terceiro número: ");
		c = leitor.nextInt();
		
		if(a > b)
		{
			maior = a;
		}
		else if(b > c)
		{
			maior = b;
		}
		else if(c > a)
		{
			maior = c;
		}

		System.out.println("\nO maior número digitado é: "+maior);
		
		leitor.close();
	}

}
