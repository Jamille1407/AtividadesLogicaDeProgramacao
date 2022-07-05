package com.company.EstruturaDeCondicional3Atvd1;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Salario mensal atual do funcionario: ");
        double salarioAtual = scan.nextDouble();
        System.out.println("reajuste do salario: ");
        double reajuste = scan.nextDouble();
        double percentual = (reajuste * 100) / salarioAtual;
        double soma = salarioAtual + reajuste;
        System.out.printf("Percentual do reajuste: %.2f\n" , percentual);
        System.out.println("\nO salário com reajuste é de: " + soma);

    }
}
