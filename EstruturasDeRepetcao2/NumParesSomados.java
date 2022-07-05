package com.company.EstruturasDeRepetcao2;

public class NumParesSomados {
    public static void main(String[] args) {
        int soma = 0;

        for(int i = 85; i <= 907; i++ ){


            if(i%2 == 0){
                soma += i;
                System.out.println(i);


            }
        }

        System.out.println("Soma dos números pares: " + soma);
    }
}
