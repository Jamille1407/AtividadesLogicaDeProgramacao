package com.company.EstruturasDeRepeticao3Atvd1;

public class Atvd4Aula3 {
    public static void main(String[] args) {

        int i = 57;
        int soma = 0;
        while (i <= 901){
            i++;

            if(i%2 == 1){
                soma+= i;
                System.out.println(i);

            }
        }
        System.out.println("A soma dos ímpares é: " + soma);
    }
}
