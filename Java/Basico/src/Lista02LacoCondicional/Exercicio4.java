package Lista02LacoCondicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double numero, raiz, quadrado;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		numero = leitor.nextInt();
		
		if(numero % 2 == 0)
		{
			raiz = Math.sqrt(numero);
			System.out.println("\nN�mero par. \nRa�z quadrada = "+raiz);
		}
		else
		{
			quadrado = numero * numero;
			System.out.println("\nN�mero �mpar. \nQuadrado = "+quadrado);
		}
		leitor.close();

	}

}
