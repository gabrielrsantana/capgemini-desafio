package com.mycompany.projeto1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * questão 03 - Desafio Capgemini
 * @author Gabriel Rocha Santana 06/03/2022
 */
public class Encriptacao {
    
    public static void main(String[] args) {
    int i=0,lin,col=0,indice=0; //linha e coluna para o laço For
    double colunas,linhas=0; //calculo das linhas com raiz quadrada,exibe double
    String texto="",textoOriginal="";
    char [][] matriz = new char[4][4]; //matriz com os  caracteres da string do input
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o texto para ser encriptado:");
    //remove os espacos internos
    textoOriginal=sc.nextLine();
    texto = textoOriginal.trim().replace(" ","");
    System.out.println("texto é="+texto);
    System.out.println("tamanho é="+texto.length()+" caracteres");
    
    colunas=Math.ceil(Math.sqrt((texto.length()-1))); //total de colunas
    linhas=colunas; //total de linhas
    System.out.println("\n Colunas="+ (int)colunas);
    System.out.println("\n Linhas="+ (int)linhas);
     System.out.println("preenchendo matriz grid...\n");
   //
    for (lin = 0; lin < linhas;lin++) {
        for (col = 0; col < colunas;col++) {
            if(indice < texto.length()){
                matriz[lin][col]=texto.charAt(indice) ;
              //  System.out.println("indice= "+indice+" - "+matriz[lin][col]); //salvou o caracter na matrix..incremente depois
                indice++;
            }
            
        }//colunas	
    }//linhas
    
   System.out.println("String antes: :"+textoOriginal); 
   System.out.println("String encriptada:"); 
       for (col = 0; col < colunas;col++) {
        for (lin = 0; lin < linhas;lin++) {
            if((lin %linhas) == 0){
               System.out.print(" ");
            }
          System.out.print(matriz[lin][col]); 
            
        }//colunas	
    }//linhas
   
      

    
    }//main
    
public static String addChar(String str, char ch, int position) {
    return str.substring(0, position) + ch + str.substring(position);
}
    
}//classe encriptar
