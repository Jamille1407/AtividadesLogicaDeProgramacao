package com.company.EstruturaDeRepeticao4;

import java.util.Scanner;

public class Questao4Atvd1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pi = 3.14;
        System.out.println("Qual o raio da esfera: ");
        double raio = scan.nextDouble();
        double resultado = (3/4.0) * pi * Math.pow(raio,3);
        System.out.println("VOLUME = " + resultado);


    }
}
