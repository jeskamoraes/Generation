package ExemplosLacoRepeticao;

public class ExemploFor2 {

	public static void main(String[] args) {
		
		int n = 10, i, soma;
		
		for(i = 0, soma = 0; i <= n; i++)
		{
			System.out.print("SOMA => "+soma+" + "+i);
			soma += i;
			System.out.println(" = "+soma);
		}

	}

}
