package HerancaEPolimorfismo;
//PARTE I DO EXERCÍCIO
public class Preguica extends Animal{
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	//PARTE II DO EXERCÍCIO
	@Override
	public void emitirSom() {
		System.out.println(".......");
	}
	@Override
	public void correr() {
		System.out.println("Não corre");
	}
}
