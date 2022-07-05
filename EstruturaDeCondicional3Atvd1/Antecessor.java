package com.company.EstruturaDeCondicional3Atvd1;

import java.util.Scanner;

public class Antecessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();
        System.out.println("\nO antecessor do número é: " + (num - 1));

    }
}
