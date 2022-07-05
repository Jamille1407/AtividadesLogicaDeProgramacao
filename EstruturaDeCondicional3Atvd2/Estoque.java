package com.company.EstruturaDeCondicional3Atvd2;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o estoque atual? ");
        double estoqueAtual = scan.nextDouble();
        System.out.println("Qual o estoque máximo? ");
        double estoqueMax = scan.nextDouble();
        System.out.println("Qual o estoque mínimo? ");
        double estoqueMin = scan.nextDouble();
        double quantMedia = (estoqueMax + estoqueMin) /2;
        System.out.println(quantMedia);

        if(estoqueAtual >= quantMedia ){
            System.out.println("Não efetuar compra. " );
        }else{
            System.out.println(("efetuar compra. "));
        }


    }
}
