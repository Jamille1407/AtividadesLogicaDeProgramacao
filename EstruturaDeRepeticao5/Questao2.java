package com.company.EstruturaDeRepeticao5;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a distancia percorrida pelo veiculo: ");
        double km = scan.nextDouble();

        double carro = 0;

        int i = 0;

        while(i <= km){
            i++;
            carro = km * 2;


        }
        System.out.println("Distancia percorrida pelo carro em minutos: " + carro);

    }
}
