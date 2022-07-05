package com.company.EstruturaDeRepeticao4;

import java.util.Scanner;

public class Questao6Atvd1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        System.out.println("Digite mais um numero: ");
        int num2 = scan.nextInt();
        System.out.println("Digite mais um número: ");
        int num3 = scan.nextInt();

        if (num == num2 && num3 == num) {
            System.out.println("Erro");
        } else if (num > num2) {
            System.out.println("O número maior é: " + num);
        } else if (num3 > num2) {
            System.out.println("O número maior é: " + num3);
        } else{
            System.out.println("O número maior é: " + num2);
        }

    }

}




