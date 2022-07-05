package com.company.EstruturasDeRepetcao2;

public class SomaDeValores {
    public static void main(String[] args) {

        int soma = 0;

        for(int i = 0; i <= 100; i++){
            System.out.println(i);
             soma += i;
        }
        System.out.println("A soma dos valores: " + soma);
    }
}
