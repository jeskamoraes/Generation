programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real x1, x2, y1, y2, x, y, D, soma, arredondaD

		escreva("Informe o ponto x1: ")
		leia(x1)

		escreva("Informe o ponto x2: ")
		leia(x2)

		escreva("Informe o ponto y1: ")
		leia(y1)

		escreva("Informe o ponto y2: ")
		leia(y2)

		x = mat.potencia(x2-x1, 2) 
		y = mat.potencia(y2-y1, 2) 

		soma = x + y

		D = mat.raiz(soma, 2)
		arredondaD = mat.arredondar(D, 2)

		escreva("\nA distância entre os pontos informados é: " + arredondaD)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 337; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */