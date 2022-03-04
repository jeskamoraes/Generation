programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		inteiro a, b, c, d, quadradoA, quadradoB, quadradoC, quadradoD

		escreva("Digite o primeiro número: ")
		leia(a)

		escreva("Digite o segundo número: ")
		leia(b)

		escreva("Digite o terceiro número: ")
		leia(c)

		escreva("Digite o quarto número: ")
		leia(d)

		quadradoA = mat.potencia(a, 2)
		quadradoB = mat.potencia(b, 2)
		quadradoC = mat.potencia(c, 2)
		quadradoD = mat.potencia(d, 2)

		se(quadradoC >= 1000)
		{
			escreva("\n" + c + " ^ 2 = " + quadradoC)
		}
		senao
		{
			escreva("\n" + a + " ^ 2 = " + quadradoA)
			escreva(b + " ^ 2 = " + quadradoB)
			escreva(c + " ^ 2 = " + quadradoC)
			escreva(d + " ^ 2 = " + quadradoD)
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 719; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */