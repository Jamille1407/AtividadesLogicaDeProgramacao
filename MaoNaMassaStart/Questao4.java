package com.company.MaoNaMassaStart;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = scan.nextDouble();

        for(int i = 0; i <= num; i++){

            if(i%2 == 1){
                System.out.println(i);
            }
        }

    }
}
