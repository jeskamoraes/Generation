package Lista02LacoCondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int a, b, c, maior=0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("L� tr�s inteiros e imprime o maior");
		System.out.println("\nDigite o primeiro n�mero: ");
		a = leitor.nextInt();
		
		System.out.println("\nDigite o segundo n�mero: ");
		b = leitor.nextInt();
		
		System.out.println("\nDigite o terceiro n�mero: ");
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

		System.out.println("\nO maior n�mero digitado �: "+maior);
		
		leitor.close();
	}

}
