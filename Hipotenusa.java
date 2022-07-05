package com.company;

import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro valor do cateto do triangulo retangulo: ");
        double b = scan.nextDouble();
         System.out.println("Informe o segundo valor do cateto do triangulo retangulo: ");
        double c = scan.nextDouble();
        double a = Math.sqrt(b*b + c*c);
        System.out.println("O valor da hipotenusa é: " + a);



    }
}
