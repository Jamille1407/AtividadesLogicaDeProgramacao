package com.company.EstruturasDeRepetcao2;

import java.util.Scanner;

public class ConjuntosDeNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumPares = 0;
        int quantNumImpares = 0;

        for (int i = 1; i <= 50; i++) {
            System.out.println("Digite um número: ");
            int num = scan.nextInt();


            if (num % 2 == 0) {
                quantNumPares++;

            } else {
                quantNumImpares++;

            }if (i%5 == 0){
                System.out.println("Você quer parar ? se vc quer digite o número 1: ");
                int escolha = scan.nextInt();
                if(escolha ==1){
                    break;
                }else{
                    System.out.println();
                }
            }
        }
        System.out.println("Números pares: " + quantNumPares);
        System.out.println("Números ímpares: " + quantNumImpares);
    }
}