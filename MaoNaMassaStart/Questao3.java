package com.company.MaoNaMassaStart;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double quantPositivos = 0;
        double soma = 0;
        double media = 0;


        for (int i = 0; i <= 6; i++) {
            System.out.println("Digite um número positivo ou negativo: ");
            double num = scan.nextDouble();

            if (num >= 0) {
                quantPositivos++;
                soma += num;
                media = soma /quantPositivos;
            }
        }
        System.out.println(media);


    }
}
