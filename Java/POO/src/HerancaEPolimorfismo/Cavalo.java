package HerancaEPolimorfismo;
//PARTE I DO EXERC�CIO
public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	//PARTE II DO EXERC�CIO
	@Override
	public void emitirSom() {
		System.out.println("Relincha");
	}
	@Override
	public void correr() {
		System.out.println("Galopa");
	}
}
