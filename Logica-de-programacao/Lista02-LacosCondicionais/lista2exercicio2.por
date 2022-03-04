programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		inteiro codigo 
		real horasTrabalhadas = 0, horasExcedentes = 0, salarioExcedente = 0, salario = 0, salarioTotal = 0

		escreva("Informe o código do funcionário: ")
		leia(codigo)

		escreva("Informe o número de horas trabalhadas: ")
		leia(horasTrabalhadas)

		se(horasTrabalhadas < 50)
		{
			salario = 10 * horasTrabalhadas
			salarioExcedente = 0
			horasExcedentes = 0
			
			salarioTotal = salario + salarioExcedente

			escreva("\nFUNCIONÁRIO: " + codigo)
			escreva("\nHORAS EXCEDENTES: " + horasExcedentes + " hs")
			escreva("\nSALÁRIO EXCEDENTE: R$ " +  salarioExcedente) 
			escreva("\nSALÁRIO TOTAL: R$ " + salarioTotal)
		}
		senao
		{
			horasExcedentes = horasTrabalhadas - 50
			salario = (horasTrabalhadas - horasExcedentes) * 10
			salarioExcedente = horasExcedentes * 20
			
			salarioTotal = salario + salarioExcedente

			escreva("\nFUNCIONÁRIO: " + codigo)
			escreva("\nHORAS EXCEDENTES: " + horasExcedentes + " hs")
			escreva("\nSALÁRIO EXCEDENTE: R$ " +  salarioExcedente) 
			escreva("\nSALÁRIO TOTAL: R$ " + salarioTotal)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 982; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */