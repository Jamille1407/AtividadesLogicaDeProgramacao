package com.company.EstruturaDeRepeticao5;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de x1: ");
        double x1 = scan.nextDouble();
        System.out.println("Informe o valor de x2: ");
        double x2 = scan.nextDouble();
        System.out.println("Informe o valor de y1: ");
        double y1 = scan.nextDouble();
        System.out.println("Informe o valor de y2: ");
        double y2 = scan.nextDouble();

        double resultado = Math.sqrt((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
        System.out.printf(" %.3f %n" ,resultado);


    }
}
