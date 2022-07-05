package com.company.EstruturaDeRepeticao4;

import java.util.Scanner;

public class Questao2Atvd1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int salarioRecebidoPorHora = 15;
        System.out.println("Qual o número do funcionario: ");
        int numFuncionario = scan.nextInt();
        System.out.println("Quantas horas o funcionario trabalhou no mês: ");
        double horasTrabalhadas = scan.nextDouble();
        double salarioFinal = Math.abs(salarioRecebidoPorHora * horasTrabalhadas);

        System.out.println("Número do funcionário -> " + numFuncionario + "\nSalário recebido no final do mês -> " +
                salarioFinal);


    }
}
