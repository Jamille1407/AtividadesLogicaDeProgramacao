package com.company;

import java.util.Scanner;

public class AvaliacaoFatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro e positivo: ");
        int num = scan.nextInt();
        int fatorial = num;

        while(num > 1){
            fatorial = fatorial * (num - 1);
            num--;

        }
        System.out.println(fatorial);
    }
}



