package ExemplosLacoRepeticao;

public class ExemploDoWhile1 {

	public static void main(String[] args) throws InterruptedException {
		
		int inicio = 0;
		
		do 
		{
			System.out.println(inicio);
			++inicio;
			Thread.sleep(500);
		}
		while(inicio != 10);

	}

}
