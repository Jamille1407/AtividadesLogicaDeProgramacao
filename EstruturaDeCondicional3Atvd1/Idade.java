package com.company.EstruturaDeCondicional3Atvd1;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);




        System.out.println("quantos anos vc tem ? ");
        double idade = scan.nextDouble();
        System.out.println("E quantos meses? ");
        double mes = scan.nextDouble();
        System.out.println("E quantos dias ? ");
        double dias = scan.nextDouble();
        double resultado = (idade * 365) + (mes * 30) + dias;


        if(mes <= 12 && dias <= 30){
            System.out.println("Sua idade em dias é: " + resultado);

        }else{
            System.out.println("Idade invalida.");
        }





    }
}
