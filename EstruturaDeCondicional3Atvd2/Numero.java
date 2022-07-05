package com.company.EstruturaDeCondicional3Atvd2;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = scan.nextDouble();

        if (num >= 0) {
            System.out.println("NÚMERO POSITIVO");
        } else {
            System.out.println("NÚMERO NEGATIVO");
        }
    }
}
