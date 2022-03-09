package Classes;

public abstract class Pessoa { // CLASSE ABSTRATA NÃO PODE SER INSTANCIADA
	
	private String nome;
	private int idade;
	private String cpf;
	private String endereco;
	private int telefone;
	private String email;
	abstract public void imprimirInfo(); // MÉTODO ABSTRATO QUE SERÁ DESENVOLVIDO EM OUTRAS CLASSES, COM IMPLEMENTAÇÕES DIFERENTES
	
	Pessoa(String nome, int idade, String cpf, String endereco, int telefone, String email)
	{
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
