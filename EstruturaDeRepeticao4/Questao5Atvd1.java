package com.company.EstruturaDeRepeticao4;

import java.util.Scanner;

public class Questao5Atvd1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("""
                Informe se vc quer calcular a área de ->\s
                1 -Triângulo Retângulo(base = A, altura = C)
                2 - Circulo(Raio = C)\s
                3 - Trapezio(base = A e B, altura = C)\s
                4 - Quadrado(Lado = B)\s
                5 - Retângulo(Lados = A e B)""");
        int escolha = scan.nextInt();

        switch (escolha){

            case 1:
                System.out.println("Informe o valor de A: ");
                float a = scan.nextFloat();
                System.out.println("Informe o valor de C: ");
                float c = scan.nextFloat();
                System.out.println("Area do triangulo retangulo é: " + ((a * c)/2));

            case 2:
                System.out.println("Informe o valor de C: ");
                c = scan.nextFloat();
                System.out.println("Area do circulo: " + (Math.PI*Math.pow(c, 2)) );

            case 3:
                System.out.println("Informe o valor de A: ");
                a = scan.nextFloat();
                System.out.println("Informe o valor de B: ");
                float b = scan.nextFloat();
                System.out.println("Informe o valor de C: ");
                 c = scan.nextFloat();
                System.out.println("Area do trapezio: " + ((a + b)*c)/2);

            case 4:
                System.out.println("Informe o valor de B: ");
                b = scan.nextFloat();
                System.out.println("Area do quadrado: " + Math.pow(b, 2));

            case 5:
                System.out.println("Informe o valor de A: ");
                a = scan.nextFloat();
                System.out.println("Informe o valor de B: ");
                b = scan.nextFloat();
                System.out.println("Area do Retangulo: " + (a * b));
        }


    }
}
