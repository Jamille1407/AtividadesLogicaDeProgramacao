package com.company.EstruturasDeRepeticao3Atvd1;

import java.util.Scanner;

public class Atvd2Aula3 {
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
