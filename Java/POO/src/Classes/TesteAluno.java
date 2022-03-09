package Classes;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(null, null, null, 0);
		
		aluno.nome = "Ana Júlia Farias";
		aluno.idade = 15;
		aluno.curso = "1º ano Ensino médio";
		aluno.matricula = "102XBC";
		
		aluno.imprimirInfo();
		aluno.assistirAula();
		aluno.setNome("Ana Júlia Farias de Moraes");
		aluno.imprimirInfo();
		aluno.assistirAula();
	}

}
