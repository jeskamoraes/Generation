package ExemplosLacoRepeticao;

public class ExemploFor3 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int sobe = 1, desce = 10; sobe <= 10 && desce >= 1; sobe++, desce--)
		{
			System.out.println(sobe+ " "+desce);
			Thread.sleep(500);
		}

	}

}