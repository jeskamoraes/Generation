package Classes;

public class Aluno {
	
	String nome;
	String matricula;
	String curso;
	int idade;
	
	public Aluno(String nome, String matricula, String curso, int idade)
	{
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.idade = idade;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	void estudar()
	{
		
	}
	
	void assistirAula()
	{
		boolean presente = true;
		if(presente != true)
		{
			System.out.println("\n---> Aluno não está presente em sala");
		}
		else
		{
			System.out.println("\n---> Aluno presente em sala");
		}
	}
	
	void entregarTrabalho()
	{
		
	}
	
	void imprimirInfo()
	{
		System.out.println("-----------------------------------");
		System.out.println("\tInformações do aluno");
		System.out.println("-----------------------------------");
		System.out.println("\nNome: "+nome+"\nIdade: "+idade+"\nMatrícula: "+matricula+"\nCurso: "+curso);
	}
}


