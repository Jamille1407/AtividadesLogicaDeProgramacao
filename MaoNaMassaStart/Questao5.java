package com.company.MaoNaMassaStart;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scan.nextInt();
        System.out.println("Digite um número: ");
        int num2 = scan.nextInt();
        int soma = 0;

        if(num1>num2){
            for(int i = num2+1; i< num1; i++){
                if(i%2 == 1 || i%2 == -1){
                    soma+=1;
                }
            }
        }
        else if(num1<num2){
            for(int i = num1+1; i < num2; i++){
                if(i%2 == 1 || i%2 == -1){
                    soma+=1;
                }
            }
        }
        System.out.println(soma);
    }
}
