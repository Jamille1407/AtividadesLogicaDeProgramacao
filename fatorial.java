package com.company;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();
        int fatorial = 1;

        while (num > 1){
            fatorial = num * fatorial;
            num--;
        }
        System.out.println(fatorial);
    }
}
