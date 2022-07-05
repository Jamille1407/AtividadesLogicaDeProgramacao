package com.company.EstruturasDeRepeticao1;

public class AtvdStart4 {
    public static void main(String[] args) {

        int somaImpar = 0;

        for(int i = 57; i <= 901; i++){
            System.out.println(i);

            if(i %2 == 1){
                somaImpar += i;

            }
        }
        System.out.println("soma dos números Ímpares: " + somaImpar);
    }
}



