package com.company.EstruturasDeRepeticao1;

public class AtvdStart2 {
    public static void main(String[] args) {
        int somaImpar = 0;
        int quantPar = 0;

        for(int cont = 100 ;cont <=1500 ; cont++ ){
            System.out.println(cont);

            if(cont %2 == 1){
                somaImpar += cont;

            }else {
                quantPar += 1;
            }
        }
        System.out.println("soma dos números ímpares: " + somaImpar);
        System.out.println("Quantidades de pares: " + quantPar);
    }
}


