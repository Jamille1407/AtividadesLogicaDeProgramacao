package com.company;

import java.util.Scanner;

public class IdadeAtvdStart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Digite a sua idade: ");
            int idade = scan.nextInt();

            System.out.println("Você deseja parar ? se sim, digite 1: ");
            int escolha = scan.nextInt();
            if (escolha == 1) {
                break;


            }
        }

    }
}