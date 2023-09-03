programa{
  funcao inicio(){
  	
	inteiro i=0,j=0,k=0, copia, troca = 0, tamanho = 10, vetor[10],numPares = 0,pares[10],soma
	real media=0.0,somatorio =0.0
	
//entrada de valores
    para(i = 0; i < tamanho; i++){
      escreva("Digite um número: ")
      leia(vetor[i])}
limpa()
// Elementos nos índices ímpares:
	escreva("Elementos nos índices ímpares:\n")
		para(i = 1; i < 10; i += 2){
    escreva(vetor[i], ", ")}

//elementos pares
	para(j = 0; j < tamanho; j++){
      se(vetor[j] % 2 == 0){
        pares[numPares] = vetor[j]
        numPares = numPares + 1}}
        
	escreva("\nElementos pares:\n")
     para(k = 0; k < numPares; k++){
     	escreva(pares[k], ", ")}
     	
//Soma de todos os elementos do vetor
	soma = +vetor[0]+vetor[1]+vetor[2]+vetor[3]+vetor[4]+vetor[5]+vetor[6]+vetor[7]+vetor[8]+vetor[9]
	escreva("\nSoma de todos os elementos do vetor:\n",soma)
	
//Média de todos os elementos do vetor, armazenada em uma variável do tipo real
	para(k = 0; k < 10; k++){
    		somatorio += vetor[k]}
	media = somatorio / 10.0
	escreva("\nMédia de todos os elementos do vetor:\n", media)
}}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 124; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 4, 54, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */