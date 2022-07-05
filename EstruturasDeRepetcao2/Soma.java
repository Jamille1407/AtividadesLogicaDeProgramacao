package com.company.EstruturasDeRepetcao2;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int quantNegativo = 0;


        for(int i = 0; i <=50; i++){
            System.out.println("Digite um número: ");
            int num = scan.nextInt();

            if(num >= 0){
                soma += num;

            } else{
                quantNegativo ++;


            }

        }
        System.out.println("A soma de números positivos é: " + soma);
        System.out.println("A quantidade de números negativos é: " + quantNegativo);






    }
}
