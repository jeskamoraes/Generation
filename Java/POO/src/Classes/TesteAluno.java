package Classes;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(null, null, null, 0);
		
		aluno.nome = "Ana J�lia Farias";
		aluno.idade = 15;
		aluno.curso = "1� ano Ensino m�dio";
		aluno.matricula = "102XBC";
		
		aluno.imprimirInfo();
		aluno.assistirAula();
		aluno.setNome("Ana J�lia Farias de Moraes");
		aluno.imprimirInfo();
		aluno.assistirAula();
	}

}
