programa
{
	
	funcao inicio()
	{

		inteiro a, b, c
		real r, s, d
		
		escreva("Para calcular a expressão D = (R+S)/2, sendo R = (a+b)^2 e S = (b+c)^2, informe os valores solicitados")
		escreva("\n--------------------------------------------------------------------")
		escreva("\nDigite o valor de a: ")
		leia(a)
		
		escreva("Digite o valor de b: ")
		leia(b)

		escreva("Digite o valor de c: ")
		leia(c)

		r = (a+b) * (a+b)
		s = (b+c) * (b+c)
		d = (r+s) / 2

		escreva("D = " + d) 

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 324; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */