package com.company.EstruturaDeCondicional2Atvd3;

import java.util.Scanner;

public class Questao2Atvd3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Opções no menu da loja: \n01 -> Venda a vista. \n02 -> Venda a prazo de 30 dias" +
                "\n03 -> Venda a prazo de 60 dias. \n04 -> Venda a prazo com 90 dias. \n05 -> venda com cartão de débito." +
                "\n06 -> Venda com cartão de crédito. ");
        System.out.println("Escolha uma opção: ");
        int menu = scan.nextInt();

        switch (menu){

            case 01:
                System.out.println("Venda a vista.");
                break;
            case 02:
                System.out.println("Venda a prazo de 30 dias.");
                break;
            case 03:
                System.out.println("Venda a prazo de 60 dias.");
                break;
            case 04:
                System.out.println("Venda a prazo de 90 dias.");
                break;
            case 05:
                System.out.println("Venda com cartão de débito.");
                break;
            case 06:
                System.out.println("Venda com cartão de crédito.");
                break;
            default:
                System.out.println("Erro, número não está presente no menu. \nErro, Digite um número.");
        }


    }
}

