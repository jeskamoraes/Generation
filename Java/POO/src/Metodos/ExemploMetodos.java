package Metodos;

import java.util.Scanner;

public class ExemploMetodos {

	static int num3 = 5, num4 = 4, multiplicacao, num7, num8, num9, num10; // VARIÁVEIS GLOBAIS, PODEM SER USADAS EN TODOS OS ESCOPOS

	public static void main(String[] args) {

		metodo1();
		metodo2();
		metodo3();
		metodo4();
		Scan();
		metodo5(num7, num8);
		metodo7();
		
	}
	
	public static void Scan() 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com os valores de parâmetro do método 5: ");
		num7 = entrada.nextInt();
		num8 = entrada.nextInt();
		
		System.out.println("Entre com os valores de parâmetro do método 7: ");
		num9 = entrada.nextInt();
		num10 = entrada.nextInt();
		entrada.close();
		
	}

	public static void metodo1() {
		System.out.println("\nMétodo 1 - Olá");
	}

	public static void metodo2() {
		int num1 = 10, num2 = 30, soma;
		soma = num1 + num2;
		System.out.println("\nMétodo 2 - Soma: " + num1 + " + " + num2 + " = " + soma);
	}

	public static void metodo3() {
		multiplicacao = num3 * num4;

	}

	public static void metodo4() {
		System.out.println("\nMódulos 3 e 4 - Multiplicação: "+num3 + " x " + num4 + " = " + multiplicacao);
	}
	
	public static void metodo5(int num5, int num6)
	{
		double divisao = num5 / num6;
		System.out.println("\nMódulos 5 - Divisão: "+num5 + " / " + num6 + " = " + divisao);
	}
	
	public static void metodo7()
	{
		System.out.println(TestaMetodoExterno.metodo6(num9, num10));
	}

}
