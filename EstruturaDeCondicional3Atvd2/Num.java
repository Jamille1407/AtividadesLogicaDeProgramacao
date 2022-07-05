package com.company.EstruturaDeCondicional3Atvd2;

import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        if(num < 10){
            System.out.println("É MENOR QUE DEZ!!");
        }else if (num == 10){
            System.out.println("O NÚMERO É IGUAL A 10! ");

        }else{
            System.out.println("O NÚMERO É MAIOR QUE DEZ! ");
        }



    }
}
