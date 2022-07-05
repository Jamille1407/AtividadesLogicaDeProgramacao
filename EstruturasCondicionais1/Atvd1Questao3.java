package com.company.EstruturasCondicionais1;

import java.util.Scanner;

public class Atvd1Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio;


        System.out.println("Informe o raio do circulo: ");
        raio = scan.nextInt();
        double resultado = raio * raio * 3.14;
        double resultado2 = 2 * 3.14 * raio;
        System.out.println("A área do círculo é: " + resultado +"\nO perímetro do círculo é: " + resultado2);


    }
}


