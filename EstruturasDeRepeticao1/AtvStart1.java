package com.company.EstruturasDeRepeticao1;

public class AtvStart1 {
    public static void main(String[] args) {
        int i = 0;
        int somaPares = 0;
        while (i <= 599) {
            i++;
            System.out.println(i);

            if(i%2 == 0){
                somaPares+= i;

            }


        }
        System.out.println("A soma dos números pares de 0 a 599 é: " + somaPares);
    }
}








