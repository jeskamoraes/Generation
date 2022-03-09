package HerancaEPolimorfismo;
//PARTE I DO EXERCÍCIO
public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	//PARTE II DO EXERCÍCIO
	@Override
	public void emitirSom() {
		System.out.println("Relincha");
	}
	@Override
	public void correr() {
		System.out.println("Galopa");
	}
}
