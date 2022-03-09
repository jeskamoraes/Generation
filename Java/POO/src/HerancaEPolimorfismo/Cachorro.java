package HerancaEPolimorfismo;
//PARTE I DO EXERCÍCIO
public class Cachorro  extends Animal{
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	//PARTE II DO EXERCÍCIO
	@Override
	public void emitirSom() {
		System.out.println("au au au");
	}
	@Override
	public void correr() {
		System.out.println("Corre rápido");
	}
}
