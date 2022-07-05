package com.company.EstruturasCondicionais1;

import java.util.Scanner;

public class Atvd1Questao7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio;
        double altura;

        System.out.println("Informe o raio do Cilindro: ");
        raio = scan.nextInt();
        System.out.println("Informe a altura do cilindro: ");
        altura = scan.nextInt();
        double resultado = 3.14 * (raio * raio) * altura;
        System.out.println("O volume da lata de óleo é: " + resultado);


    }
}

