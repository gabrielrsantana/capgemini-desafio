/*
Desafio Capgemini  Questão 03
 */

//package com.mycompany.projeto1;

import java.util.Scanner;

/**
 
 * @author Gabriel Rocha Santana 06/03/2022
 */
public class Encriptacao {
    
    public static void main(String[] args) {
    // declarando as variáveis    
    int i=0,lin,col=0,indice=0; //linha e coluna para o laço For
    double colunas,linhas=0; //calculo das linhas com raiz quadrada,exige double
    String texto="",textoOriginal="";
    char [][] matriz; //matriz para o grid dos elementos do texto
    
    //input do usuario 
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o texto para ser encriptado:");
    textoOriginal=sc.nextLine();
    //remove os espacos externos e internos
    texto = textoOriginal.trim().replace(" ","");
   //para ver texto depois de removido os espacos,descomente as 02 linhas abaixo 
   // System.out.println("texto ficou ="+texto);
   // System.out.println("O texto tem = "+texto.length()+" caracteres");
    
    //calcular o total de colunas e linhas com raiz quadrada
    colunas=Math.ceil(Math.sqrt((texto.length()-1)));
    linhas=colunas; //total de linhas
    //instancia matriz com tamanho total de linhas/colunas 
    matriz = new char[(int)linhas][(int)colunas];
    //teste se esta dentro dos requisitos 
    boolean res= validacaoTamanho((int)linhas,(int)colunas,texto.length());
    if(res){
        //System.out.println("Linha x Coluna >= TamTexto..encriptando...\n");
      }else{
        System.out.println("Teste de validação falhou.Saindo do programa...");
        System.exit(0);
    }
   //preenchendo matriz grid com os caracteres do texto digitado...
    for (lin = 0; lin < linhas;lin++) {
        for (col = 0; col < colunas;col++) {
            if(indice < texto.length()){
                matriz[lin][col]=texto.charAt(indice);
                indice++;
            }
        }//colunas	
    }//linhas
    
   System.out.println("Texto antes: :"+textoOriginal); 
   System.out.println("Texto encriptado:"); 
   for (col = 0; col < colunas;col++) {
        for (lin = 0; lin < linhas;lin++) {
            if((lin %linhas) == 0){
               System.out.print(" ");
            }
          System.out.print(matriz[lin][col]); 
            
        }//linhas	
    }//colunas
 
   
   
   
    }//main
    


//testa condição linhas x colunas >= Tam texto
public static boolean validacaoTamanho(int lin,int col,int tamTexto){
   // System.out.println("tamanho do texto="+tamTexto);
    if(((lin * col) >= tamTexto)){
        return true;
    }else { 
        return false;
    }
    
}
    
}//classe encriptar
