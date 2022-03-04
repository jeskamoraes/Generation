programa
{
	
	funcao inicio()
	{
		inteiro numero[3][3], soma = 0, somaDiagonal = 0

		para(inteiro l = 0; l < 3; l++)
		{
			para(inteiro c = 0; c < 3; c++)
			{
				escreva("Digite o valor: ")
				leia(numero[l][c])

				soma += numero[l][c]

				se(l == c)
				{
				somaDiagonal += numero[l][c]
				}
			}
		}

		escreva("\nMATRIZ\n")

		para(inteiro l = 0; l < 3; l++)
		{
			para(inteiro c = 0; c < 3; c++)
			{
				escreva(numero[l][c] + " ")
			}
			escreva("\n")
		}

		escreva("\n---> Soma de todos os elementos da matriz = " + soma)
		escreva("\n---> Soma dos elementos da diagonal principal = " + somaDiagonal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 567; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 6, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */