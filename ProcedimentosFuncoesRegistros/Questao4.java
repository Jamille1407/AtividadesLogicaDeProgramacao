package com.company.ProcedimentosFuncoesRegistros;

import java.util.Scanner;

public class Questao4 {

    public static void Crescente(int num1, int num2, int num3){
        System.out.println("Ordem em que foram digitados: " +  num1 +  " " + " " + num2 + " "+ " " +num3);
        if (num1 < num2 || num1 < 0 && num2 < num3){
            System.out.println("A ordem crescente é: " + num1 +  " " + " " + num2 + " "+ " " +num3);
        }if(num1 < num3 && num3 < num2){
            System.out.println("A ordem crescente é: " + num1 +  " " + " " + num3 + " "+ " " +num2);
        }if(num2 < num1 || num2 > 0 && num1 < num3){
            System.out.println("A ordem crescente é: " + num2 +  " " + " " + num1 + " "+ " " +num3);
        }if(num2 < num3 && num3 < num1){
            System.out.println("A ordem crescente é: " + num2 +  " " + " " + num3 + " "+ " " +num1);
        }if(num3 < num2 || num3 < 0 && num2 < num1){
            System.out.println("A ordem crescente é: " + num3 +  " " + " " + num2 + " "+ " " +num1);
        }if(num3 < num1  && num1 < num2) {
            System.out.println("A ordem crescente é: " + num3 + " " + " " + num1 + " " + " " + num2);
        }
        }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = scan.nextInt();
        System.out.println("Digite um número 2: ");
        int num2 = scan.nextInt();
        System.out.println("Digite um número 3: ");
        int num3 = scan.nextInt();
        Crescente(num1, num2, num3);
    }
    }


