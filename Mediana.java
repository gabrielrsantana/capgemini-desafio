
/**
 * Questão 01 - Desafio Capgemini  Mediana.
 */

//comentado abaixo para poder rodar pelo Prompt
//package com.mycompany.projeto1;

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
    int tamLista=0;
    int lista[];
    Scanner sc = new Scanner(System.in);
    //OBS: questão disse que recebe numero impar,então não foi tratado isso no código.if tamLista % 2 == 0
    System.out.println("Quantos numeros terá a lista?");
    tamLista = sc.nextInt();
    lista = new int[tamLista];
    for (i = 0; i < tamLista; i++) {
		System.out.println("digite os numeros:");
		lista[i] = sc.nextInt();
	}
    //ordena a lista para achar mediana
    Arrays.sort(lista);
    meio=((lista.length-1)/2);
     // para ver os valores da lista descomente as duas linhas abaixo
    //for(int nome : lista)
      //     System.out.print(nome+",");
    System.out.println("A mediana é = "+lista[meio]);
    
    }//main
  
    
}
