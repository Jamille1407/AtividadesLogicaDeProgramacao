package com.company.EstruturasCondicionais1;

import java.util.Scanner;

public class Atvd1Questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Informe o primeiro número: ");
        numero1 = scan.nextInt();
        System.out.println("Informe o segundo número: ");
        numero2 = scan.nextInt();
        int resultado = numero1 / numero2;
        int resultado2 = numero1 % numero2;
        System.out.println("O quociente é: " + resultado + "\nO mod dos números é: " + resultado2);

    }
}











