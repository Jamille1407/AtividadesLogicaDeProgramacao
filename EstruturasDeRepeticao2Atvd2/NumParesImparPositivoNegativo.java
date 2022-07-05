package com.company.EstruturasDeRepeticao2Atvd2;

import java.util.Scanner;

public class NumParesImparPositivoNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double quantPares = 0;
        double quantImpar = 0;
        double quantPositivo = 0;
        double quantNegativo = 0;

        for(int i = 0; i <= 40; i ++){
            System.out.println("Digite um número: " );
            double num = scan.nextDouble();
            if(num%2 == 0){
                quantPares++;
            }else{
                quantImpar++;
            }if(num >= 0){
                quantPositivo++;
            }else{
                quantNegativo++;
            }
        }
        System.out.println("Quantidades de números pares: " + quantPares);
        System.out.println("Quantidade de números ímpares: " + quantImpar);
        System.out.println("Quantidade de números positivos: " + quantPositivo);
        System.out.println("Quantidade de números negativos: " + quantNegativo);

    }
}
