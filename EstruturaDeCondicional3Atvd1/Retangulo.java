package com.company.EstruturaDeCondicional3Atvd1;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double base;
        double altura;

        System.out.println("Diga a base do retângulo: ");
        base = scan.nextInt();
        System.out.println("Diga a altura do retângulo: ");
        altura = scan.nextInt();
        double resultado = base * altura;
        System.out.println("A área do retângulo é: " + resultado );


    }
}
