package com.company;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0;
        double media = 0;

        double[] notas = new double[10];
        for( int i =0; i <= 10; i++ ){
            System.out.println("Digite a nota: " + i);
                    notas[i] = scan.nextDouble();

            soma = soma + notas[i];

        }
        media =soma/10;
        System.out.println("a media é: " +media);
    }
}
