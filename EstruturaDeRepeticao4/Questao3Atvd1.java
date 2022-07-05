package com.company.EstruturaDeRepeticao4;

import java.util.Scanner;

public class Questao3Atvd1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("Informe o código do produto 1: ");
        int CodProd1 = scan.nextInt();
        System.out.println("Informe o código do produto 2: ");
        int codProd2 = scan.nextInt();
        System.out.println("Qual o valor do produto 1: ");
        double produto1 = scan.nextDouble();
        System.out.println("Qual o valor produto 2: ");
        double produto2 = scan.nextDouble();
        System.out.println("Informe a quantidade de unidade compradas do produto 1: ");
        double uniProd1 = scan.nextDouble();
        System.out.println("Informe a quantidade de unidade compradas do produto 2: ");
        double uniProd2 = scan.nextDouble();



        double resultado = Math.abs(produto1 * uniProd1);
        double resultado2 = Math.abs(produto2 * uniProd2);
         double resultadoFinal = Math.abs(resultado + resultado2);

        System.out.println("CÓDIGO PRODUTO 1: " + CodProd1 +
                "\nCÓDIGO PRODUTO 2: " + codProd2 + "\nVALOR A PAGAR: " + "R$ " + resultadoFinal);



    }

}
