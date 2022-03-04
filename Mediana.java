
package com.mycompany.projeto1;

/**
 *
 * @author gabriel Rocha Santana 04/03/2022
 */
import java.util.Scanner;
import java.util.Arrays;
class Mediana {
    public static void main(String[] args) {
    int i=0;
    int meio=0;    
    int N=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantos numeros o vetor tera?");
    N = sc.nextInt();
    int vetor[] = new int[N];
    for (i = 0; i < N; i++) {
		System.out.println("digite os numeros:");
		vetor[i] = sc.nextInt();
	}
    //ordena o vetor
    Arrays.sort(vetor);
    meio=((vetor.length-1)/2);
      
    // ** para ver os valores do vetor desmarque as duas linhas abaixo
    //for(int nome : vetor)
    //   System.out.print(nome+",");
       System.out.println("mediana ="+vetor[meio]);
    
    }//main
  
    
}
