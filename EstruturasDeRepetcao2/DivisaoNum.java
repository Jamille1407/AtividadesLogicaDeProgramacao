package com.company.EstruturasDeRepetcao2;

import java.util.Scanner;

public class DivisaoNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quant = 0;
        System.out.println("Digite um número: ");
        double num = scan.nextDouble();
        double divisao;

        for(divisao = num/2; divisao > 1 ; divisao = divisao /2){
            quant++;

        }
        System.out.println("A divisão final do número: " + divisao);
        System.out.println("A quantidade de divisões é: " + quant);

    }
}