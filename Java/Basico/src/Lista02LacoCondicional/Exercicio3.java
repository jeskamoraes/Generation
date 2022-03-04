package Lista02LacoCondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a idade: ");
		idade = leitor.nextInt();
		
		if(idade >=10 && idade <=14)
		{
			System.out.println("Categoria Infantil");
		}
		else if(idade >= 15 && idade <= 17)
		{
			System.out.println("Categoria Juvenil");
		}
		else if(idade >= 18 && idade <= 25)
		{
			System.out.println("Categoria Adulto");
		}
		
		leitor.close();
	}

}
