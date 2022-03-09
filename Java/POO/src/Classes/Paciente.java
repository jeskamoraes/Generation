package Classes;

public class Paciente extends Pessoa {
	
	private int codigo;
	private String codigoConvenio;
	
	public Paciente(String nome, int idade, String cpf, String endereco, int telefone, String email, int codigo, String codigoConvenio)
	{
		super(nome, idade, cpf, endereco, telefone, email);
		
		this.codigo = codigo;
		this.codigoConvenio = codigoConvenio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCodigoConvenio() {
		return codigoConvenio;
	}

	public void setCodigoConvenio(String codigoConvenio) {
		this.codigoConvenio = codigoConvenio;
	}
	
	@Override
	public void imprimirInfo() {
		System.out.println("------------------------");
		System.out.println("Informações do cliente");
		System.out.println("------------------------");
		System.out.println("\nPaciente: "+codigo+"| Convenio: "+codigoConvenio+"\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nCPF: "+getCpf()+"\nEndereço: "+getEndereco()+"\nTelefone: "+
		getTelefone()+"\nEmail: "+getEmail());
	}
}
