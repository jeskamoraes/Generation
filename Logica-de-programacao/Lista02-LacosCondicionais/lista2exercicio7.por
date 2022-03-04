programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		real base, altura, area
		
		escreva("Informe o valor da base: ")
		leia(base)

		escreva("Informe o valor da altura: ")
		leia(altura)

		se(base > 0 e altura > 0)
		{
		area = mat.arredondar((base*altura) / 2, 2)
		escreva("\n\nÁrea do triângulo = " + area + " metros quadrados") 
		}
		senao
		{
			escreva("Valores inválidos! Digite um número positivo (base): ")
			leia(base)

			escreva("Valores inválidos! Digite um número positivo (altura): ")
			leia(altura)

			area = mat.arredondar((base*altura) / 2, 2)
			escreva("\n\nÁrea do triângulo = " + area + " metros quadrados") 
			
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 653; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */