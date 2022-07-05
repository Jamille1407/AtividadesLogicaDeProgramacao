package com.company.EstruturasCondicionais1;

import java.util.Scanner;

public class Atvd1Questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double base;
        double altura;

        System.out.println("Diga a base do retângulo: ");
        base = scan.nextInt();
        System.out.println("Diga a altura do retângulo: ");
        altura = scan.nextInt();
        double resultado = base * altura;
        double resultado2 = (base + altura) * 2;
        System.out.println("A área do retângulo é: " + resultado + "\nO perímetro do retângulo é: " + resultado2);


    }
}


