package ExemplosVetorMatriz;

public class ExemploMatriz01 {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[2][4];
		double soma = 0;

		notasAlunos[0][0] = 9.9;
		notasAlunos[0][1] = 7.9;
		notasAlunos[0][2] = 6.5;
		notasAlunos[0][3] = 8.5;

		notasAlunos[1][0] = 0.1;
		notasAlunos[1][1] = 9.7;
		notasAlunos[1][2] = 5.6;
		notasAlunos[1][3] = 5.8;

		System.out.println("----------------------------------------------------------------");
		System.out.println("CALCULA A MÉDIA DE CADA ALUNO (CADA LINHA REPRESENTANDO UM ALUNO)");
		System.out.println("----------------------------------------------------------------\n");
		for (int l = 0; l < notasAlunos.length; l++) {
			soma = 0; // ZERA A SOMA AO FINAL DE CADA LINHA
			for (int c = 0; c < notasAlunos[l].length; c++) {
				soma += notasAlunos[l][c];
				System.out.print(notasAlunos[l][c] + " | ");
			}
			System.out.println();
			System.out.println("\n---> Média do "+(l+1)+"º aluno: "+(soma/4)+"\n");
		}

	}

}
