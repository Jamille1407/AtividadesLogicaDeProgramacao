package com.company.EstruturaDeCondicional3Atvd2;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        System.out.println("Digite mais um numero: ");
        int num2 = scan.nextInt();

        if(num == num2){
            System.out.println("Erro");
        }else if (num > num2){
            System.out.println("O número maior é: " + num);
        }else{
            System.out.println("O número maior é: " + num2);
        }

        }

    }

