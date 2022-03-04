programa
{
	
	funcao inicio()
	{
		inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6]

		// RECEBE OS DADOS DA MATRIZ NÚMERO 1
		para(inteiro l = 0; l < 4; l++)
		{
			para(inteiro c = 0; c < 6; c++)
			{
				escreva("MATRIZ 1 - Digite o valor: ")
				leia(n1[l][c])
			}
		}
		// IMPRIME OS DADOS DA MATRIZ NÚMERO 1

		escreva("\nMATRIZ 1\n")
		para(inteiro l = 0; l < 4; l++)
		{
			para(inteiro c = 0; c < 6; c++)
			{
				escreva(n1[l][c] + " | ")
			}
			escreva("\n")
		}
		escreva("\n")

		// RECEBE OS DADOS DA MATRIZ NÚMERO 2
		para(inteiro l = 0; l < 4; l++)
		{
			para(inteiro c = 0; c < 6; c++)
			{
				escreva("MATRIZ 2 - Digite o valor: ")
				leia(n2[l][c])
			}
		}
		// IMPRIME OS DADOS DA MATRIZ NÚMERO 2

		escreva("\nMATRIZ 2\n")
		para(inteiro l = 0; l < 4; l++)
		{
			para(inteiro c = 0; c < 6; c++)
			{
				escreva(n2[l][c] + " | ")
			}
			escreva("\n")
		}
		escreva("\n")
		// SOMA OS VALORES DAS MATRIZES N1 E N2
		para(inteiro l = 0; l < 4; l++)
		{
			para(inteiro c = 0; c < 6; c++)
			{
				m1[l][c] = n1[l][c] + n2[l][c]
			}
		}

		// IMPRIME O RESULTADO DA SOMA

		escreva("\nMATRIZ SOMA\n")
		para(inteiro l = 0; l < 4; l++)
		{
			para(inteiro c = 0; c < 6; c++)
			{
				escreva(m1[l][c] + " | ")
			}
			escreva("\n")
		}
		escreva("\n")

		// SUBTRAI OS VALORES DAS MATRIZES N1 E N2
		para(inteiro l = 0; l < 4; l++)
		{
			para(inteiro c = 0; c < 6; c++)
			{
				m1[l][c] = n1[l][c] - n2[l][c]
			}
		}

		// IMPRIME O RESULTADO DA SUBTRAÇÃO
		
		escreva("\nMATRIZ SUBTRAÇÃO\n")
		para(inteiro l = 0; l < 4; l++)
		{
			para(inteiro c = 0; c < 6; c++)
			{
				escreva(m1[l][c] + " | ")
			}
			escreva("\n")
		}
		escreva("\n")
	}

	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 474; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 10, 2}-{n2, 6, 20, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */