package com.company.EstruturasDeRepeticao3Atvd1;

public class atvd1Aula3 {
    public static void main(String[] args) {

        int x = 0;
        int somaInt = 0;

        while(x < 11){
            x++;
            System.out.println(x);

            if(x <= 10){
                somaInt += x;
            }

        }
        System.out.println("A soma dos inteiros de 1 a 10: " + somaInt);


    }
}
