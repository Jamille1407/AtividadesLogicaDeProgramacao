package com.company.EstruturaDeCondicional3Atvd2;

import java.util.Scanner;

public class IdadeEleitor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o ano que você nasceu: ");
        int anoNascimento = scan.nextInt();
        System.out.println("\nInforme o ano atual: ");
        int anoAtual = scan.nextInt();
        int idadeVotar =  anoAtual - anoNascimento;
        System.out.println("\nVocê tem: " + idadeVotar + " anos");

        if(idadeVotar >= 16){
            System.out.println("Você poderá votar esse ano. ");
        }else{
            System.out.println("Você não poderá votar esse ano. ");
        }
    }
}
