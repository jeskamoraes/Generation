programa
{
	
	funcao inicio()
	{
		inteiro numero = 0, somaNumero = 0, quantidadeNumero = 0, mediaNumero = 0, contador = 0

		enquanto(numero >= 0)
		{
			escreva("Digite um número: ")
			leia(numero)

			se(numero >= 0)
			{
				quantidadeNumero++
				somaNumero += numero
				mediaNumero = somaNumero / quantidadeNumero
			}
			
			contador++
		}
		escreva("\nQUANTIDADE DE NÚMEROS DIGITADOS = " + quantidadeNumero)
		escreva("\nSOMA DOS NÚMEROS DIGITADOS = " + somaNumero)
		escreva("\nMÉDIA DOS NÚMEROS DIGITADOS = " + mediaNumero)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 225; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */