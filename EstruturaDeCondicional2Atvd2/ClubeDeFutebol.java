package com.company.EstruturaDeCondicional2Atvd2;

import java.util.Scanner;

public class ClubeDeFutebol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idadeDosAlunos = scan.nextInt();

        switch (idadeDosAlunos) {

            case 5,6,7,8,9, 10:
                System.out.println("Infantil");
                break;
            case 11, 12,13,14,15:
                System.out.println("Juvenil");
                break;
            case 16,17,18,19,20:
                System.out.println("Junior");
                break;
            case 21,22,23,24,25:
                System.out.println("Profissional");
                break;

            default:
                System.out.println("Idade inválida.");
        }

    }
}


