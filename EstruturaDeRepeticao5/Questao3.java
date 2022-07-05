package com.company.EstruturaDeRepeticao5;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tempo gasto na viagem: ");
        double tempoGasto = scan.nextDouble();
        System.out.println("Velocidade media: ");
        double velocidadeMedia = scan.nextDouble();

        System.out.println("Litros necessarios para fazer a viagem: " + (tempoGasto * velocidadeMedia)/12);
    }
}
