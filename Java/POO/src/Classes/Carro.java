package Classes;

public class Carro {
	
	private String modelo;
	private String cor;
	private String placa;
	private int ano;
	private int velocidade;
	
	public Carro(String modelo, String cor, String placa, int ano, int velocidade)
	{
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.ano = ano;
		this.velocidade = velocidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void acelerar(int acelerar)
	{
		velocidade += acelerar;
		System.out.println("\nAcelerando.......");
	}
	
	public void frear(int reduzir)
	{
		velocidade -= reduzir;
		System.out.println("\nFreando.......");
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nModelo: "+modelo+"\nPlaca: "+placa+"\nAno: "+ano+"\nCor: "+cor);
	}
	
	public void imprimirVelocidade()
	{
		System.out.println("Velocidade atual: "+velocidade+" Km/h");
	}
	
}
