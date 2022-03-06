/*
 * Questão 2- Dado um vetor de inteiros n e um inteiro qualquer x.
Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.
 */
//comentado abaixo para poder rodar pelo prompt 
//package com.mycompany.projeto1;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Gabriel Rocha Santana 05/03/2022
 */
public class Numeros {
     
      public static void main(String[] args) {
        //declarando variaveis
	int x,i,N,atual,selecao,diferenca=0,pares=0;
        int[] vet;
        Scanner sc;
        
	System.out.println("Quantos numeros deseja digitar?:");
        sc = new Scanner(System.in);
	N = sc.nextInt();
	vet = new int[N];
	//lendo os numeros no vetor
	for (i = 0; i < N; i++) {
		System.out.println("digite o ["+i+"] numero");
		vet[i] = sc.nextInt();
	}
	System.out.println("digite o valor para a diferença entre os pares (x): ");
	x = sc.nextInt();
	System.out.println("imprimindo combinações para teste...\n");
    
    // agora percorrendo vetor9atual) e comparando(selecao)
    for(atual = 0; atual < vet.length;atual++) {
         for(selecao = atual+1; selecao < vet.length;selecao++) {
          //verifica qual maior e subtrai para nao ficar negativo.
          //poderia usar o valor absoluto
            if(vet[selecao]>vet[atual]){
               diferenca= vet[selecao]-vet[atual];
               if(diferenca == x){
                  // entrou para a quantidade de pares
                    pares++;
               }
            }else if(vet[selecao]<vet[atual]){
               diferenca= vet[atual]-vet[selecao];
                 if(diferenca == x){
                  
                    pares++;
               }
            } 
           //teste das combinações no console,para ver descomente linha abaixo
          //System.out.println("Pares ["+vet[atual]+"] - ["+vet[selecao]+"] = "+Math.abs((vet[atual]-vet[selecao]))+"\n");
		
	 }//forselecao
		
    }//for atual
    System.out.println("\n Pares totais que satisfazem a condição= "+pares);

         
    }//main
    
    
}
