programa
{
	
	funcao inicio()
	{

		inteiro entradas, numero, impar, somaImpar = 0
		
		escreva("Informe o número de entradas do programa: ")
		leia(entradas)

		para(inteiro i = 1; i <= entradas; i++)
		{
			escreva("Digite um número: ")
			leia(numero)

			se(numero >= 1 e numero <=500)
			{
				se(numero % 2 != 0)
				{
				impar = numero
				somaImpar += impar
				}
			}
			senao
			{
				escreva("Entrada inválida! Informe um número entre 1 e 500. Digite: ")
				leia(numero)
				se(numero % 2 != 0)
				{
				impar = numero
				somaImpar += impar
				}
			}
	}
	escreva("Soma dos números ímpares = " + somaImpar)
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 566; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */