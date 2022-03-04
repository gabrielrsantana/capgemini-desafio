/*
 * Questão 2- Dado um vetor de inteiros n e um inteiro qualquer x.
Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.
 */
package com.mycompany.projeto1;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
/**
 *
 * @author gabriel Rocha Santana 04/03/2022
 */
public class Numeros {
    
    
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int x,i,N,atual,selecao,diferenca=0,pares=0;
	System.out.println("Quantos numeros deseja digitar?:");
	N = sc.nextInt();
	int[] vet = new int[N];
	
	for (i = 0; i < N; i++) {
		System.out.println("digite o numeros["+i+"]");
		vet[i] = sc.nextInt();
	}
	System.out.println("digite o valor pra x: ");
	x = sc.nextInt();
	
	System.out.println("imprimindo combinações para teste...\n");
    
    // agora percorrendo vetor e comparando
    for(atual = 0; atual < vet.length;atual++) {
         for(selecao = atual+1; selecao < vet.length;selecao++) {
            if(vet[selecao]>vet[atual]){
               diferenca= vet[selecao]-vet[atual];
               if(diferenca == x){
                  //  System.out.println("entrou para o par");
                    pares++;
               }
            }else if(vet[selecao]<vet[atual]){
               diferenca= vet[atual]-vet[selecao];
                 if(diferenca == x){
                  //  System.out.println("entrou para o par");
                    pares++;
               }
            } 
           //teste das combinações no console,se não quiser ver comente a linha abaixo
           System.out.println("combinacao pares ["+vet[atual]+"] - ["+vet[selecao]+"] = "+Math.abs((vet[atual]-vet[selecao]))+"\n");
		
	}//forselecao
		
		
    }//for atual
    System.out.println("pares totais="+pares);
          
          
          
    }//main
    
    
    
    
}
