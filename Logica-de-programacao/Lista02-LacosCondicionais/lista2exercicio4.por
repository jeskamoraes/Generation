programa
{
	
	funcao inicio()
	{
		inteiro numero, par, impar, positivo, negativo

		escreva("Digite um número inteiro: ")
		leia(numero)

		se(numero % 2 == 0 e numero == 0)
		{
			escreva("\n" + numero + " é par e neutro!")
		}
		senao se(numero % 2 == 0 e numero > 0)
		{
			escreva("\n" + numero + " é par e positvo!")
		}
		senao se(numero % 2 == 0 e numero < 0)
		{
			escreva("\n" + numero + " é par e negativo!")
		}
		senao se(numero % 2 != 0 e numero > 0)
		{
			escreva("\n" + numero + " é ímpar e positivo!")
		}
		senao se(numero % 2 != 0 e numero < 0)
		{
			escreva("\n" + numero + " é ímpar e negativo!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 593; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */