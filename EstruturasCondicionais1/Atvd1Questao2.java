package com.company.EstruturasCondicionais1;

import java.util.Scanner;

public class Atvd1Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lado;


        System.out.println("Diga o lado do quadrado: ");
        lado = scan.nextInt();
        double resultado = lado * 4;
        double resultado2 = lado * lado;
        System.out.println("O perímetro do quadrado é: " + resultado +"\nA área do quadrado é: " + resultado2);





    }
}
