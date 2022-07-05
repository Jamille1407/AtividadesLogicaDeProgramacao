package com.company.EstruturasCondicionais1;

import java.util.Scanner;

public class Atvd1Questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lado1;
        double lado2;
        double lado3;

        System.out.println("Informe o lado 1 do triângulo: ");
        lado1 = scan.nextInt();
        System.out.println("Informe o lado 2 do trângulo: ");
        lado2 = scan.nextInt();
        System.out.println("Informe o lado 3 do triângulo: ");
        lado3 = scan.nextInt();
        double resultado = lado1 + lado2 + lado3;
        System.out.println("O perímetro do triângulo é: " + resultado);


    }
}


