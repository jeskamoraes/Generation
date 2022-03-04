package Lista03LacaoRepeticao;

public class Exercicio1 {

	public static void main(String[] args) {

		// EXERCÍCIO 01
		// INFORMAR TODOS OS NÚMEROS DE 1000 A 1999 QUE QUANDO DIVIDOS POR 11 OBTEMOS O
		// RESTO 5.

		for (int i = 1000; i <= 1999; i++) {
			if (i % 11 == 5) {
				System.out.println(i);
			}
		}

	}

}
