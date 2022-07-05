package com.company.ProcedimentosFuncoesRegistros;

import java.util.Scanner;

public class Questao2 {

    public static void PlanoCartesiano(float x, float y){

        if(x > 0 && y > 0){
            System.out.println("Q1");
        }if(y >0 && x < 0){
            System.out.println("Q2");
        }if(y < 0 && x < 0){
            System.out.println("Q3");
        }if(y < 0 && x > 0){
            System.out.println("Q4");
        }if(y == 0 && x == 0){
            System.out.println("Origem");
        }if(x == 0 && y > 0){
            System.out.println("Eixo X");
        }if(y == 0 && x > 0){
            System.out.println("Eixo Y");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a coordenada de  x: ");
        float x = scan.nextFloat();
         System.out.println("Digite a coordenada de  y: ");
        float y = scan.nextFloat();
        PlanoCartesiano(x, y);


    }

}
