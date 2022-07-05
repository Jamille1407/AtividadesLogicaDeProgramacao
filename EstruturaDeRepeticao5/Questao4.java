package com.company.EstruturaDeRepeticao5;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int nota1 = 0;

        System.out.println("Qual nota vc quer decompor? ");
        int nota = scan.nextInt();
        while (nota >100){
            nota100++;
            nota = nota - 100;
        } while (nota >50){
            nota50++;
            nota = nota - 50;
        } while (nota >20){
            nota20++;
            nota = nota - 20;
        } while (nota > 10){
            nota10++;
            nota = nota - 10;
        } while (nota >5){
            nota5++;
            nota = nota - 5;
        } while (nota >2){
            nota2++;
            nota = nota - 2;
        } while (nota >1){
            nota1++;
            nota = nota - 1;
        }

        System.out.println(nota100 + " notas de: R$ 100");

        System.out.println(nota50 + " notas de: R$ 50");

        System.out.println(nota20 + " notas de: R$ 20");

        System.out.println(nota10 + " notas de: R$ 10");

        System.out.println(nota5 + " notas de: R$ 5");

        System.out.println(nota2 + " notas de: R$ 2");

        System.out.println(nota1 + " notas de: R$ 1");



    }
}
