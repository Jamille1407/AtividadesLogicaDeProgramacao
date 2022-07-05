package com.company.EstruturaDeRepeticao4;

import java.util.Scanner;

public class Questaoo5Atvd1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        float a = scan.nextFloat();
        System.out.println("Informe o valor de B: ");
        float b = scan.nextFloat();
        System.out.println("Informe o valor de C: ");
        float c = scan.nextFloat();
        System.out.printf("Area do triangulo retangulo é: %.3f %n" , ((a * c)/2));
        System.out.printf("Area do circulo: %.3f %n" , (Math.PI*Math.pow(c, 2)) );
        System.out.printf("Area do trapezio: %.3f %n" , ((a + b)*c)/2);
        System.out.printf("Area do quadrado: %.3f %n",  Math.pow(b, 2));
        System.out.printf("Area do Retangulo: %.3f %n", (a * b));


    }
}
