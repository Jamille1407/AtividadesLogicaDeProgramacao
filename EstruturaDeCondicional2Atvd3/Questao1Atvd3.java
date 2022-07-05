package com.company.EstruturaDeCondicional2Atvd3;

import java.util.Scanner;

public class Questao1Atvd3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = scan.nextDouble();
        System.out.println("Escolha uma opção desse menu: \n101 -> raiz quadrada. \n102 -> A metade. " +
                "\n103 -> 10 % do número.\n104 -> O dobro. ");
        System.out.println("Digite um número de 101 a 104: ");
        int menuDeCalculo = scan.nextInt();

        switch (menuDeCalculo){

            case 101:
                System.out.println("Raiz quadrada do número é: " + (num * num));
                break;
            case 102:
                System.out.println("A metade do número é: " + (num / 2));
                break;
            case 103:
                System.out.println("10% do número: " + (num / 10));
                break;
            case 104:
                System.out.println("O dobro do número é: " + (num + num ));
                break;
            default:
                System.out.println("Número inválido.");
                break;
        }

    }
}


