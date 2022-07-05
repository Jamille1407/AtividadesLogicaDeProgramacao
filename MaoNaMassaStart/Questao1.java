package com.company.MaoNaMassaStart;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o sálario desse habitante de lisarb: ");
        double salario = scan.nextDouble();
        System.out.println("""
                1 -> 2,000.00 = não paga taxas.\s
                2 -> 2,000.01 até 3,000.00 = 8% de taxa.
                3 -> 3,000.01 até 4,500.00 = 18% de taxa.\s
                4 -> 4,000.01 = 28% de taxa.""");
        int escolha = scan.nextInt();

        switch (escolha){

            case 1:
                System.out.println("Você não precisa pagar taxa.");
                break;

            case 2:
                System.out.printf("Sua taxa de pagamento é: %.2f %n ",  (salario * 0.08));
                break;

            case 3:
                System.out.printf("Sua taxa de pagamento é: %.2f %n" , (salario * 0.18));
                break;

            case 4:
                System.out.printf("Sua taxa de pagamento é: %.2f %n" , (salario * 0.28));
                break;


        }

    }
}
