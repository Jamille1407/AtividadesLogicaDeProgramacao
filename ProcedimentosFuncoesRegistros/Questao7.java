package com.company.ProcedimentosFuncoesRegistros;

import java.util.Scanner;

public class Questao7 {

    public static void Baskhara (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número (A): ");
        double a = scan.nextDouble();
        while(a == 0){
            System.out.println("erro, digite um número maior que zero.");
            a = scan.nextDouble();
        }System.out.println("Digite mais um número (B): ");
        double b = scan.nextDouble();
        System.out.println("Digite mais um número (C): ");
        double c = scan.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        if(delta >=0) {
            double x1 = ((-b) + Math.sqrt(delta)) / 2 * a;
            double x2 = ((-b) - Math.sqrt(delta)) / 2 * a;
            System.out.println(x1);
            System.out.println(x2);
        }else{
            System.out.println("Delta não pode ser negativo. ");
        }
    }

    public static void main(String[] args) {
        Baskhara();
    }
    }

