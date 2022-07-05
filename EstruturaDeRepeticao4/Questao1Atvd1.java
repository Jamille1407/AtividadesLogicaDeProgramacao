package com.company.EstruturaDeRepeticao4;

import java.util.Scanner;

public class Questao1Atvd1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Qual o raio da circunferencia? ");
        double raio = scan.nextDouble();
        double resultado = Math.PI*(raio * raio);
        System.out.println("área do circulo é: " + resultado);

    }
}
